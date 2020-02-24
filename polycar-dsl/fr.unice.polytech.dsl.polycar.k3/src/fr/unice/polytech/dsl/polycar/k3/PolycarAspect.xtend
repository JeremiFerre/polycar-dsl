package fr.unice.polytech.dsl.polycar.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.dsl.polycar.Car
import fr.unice.polytech.dsl.polycar.EnvironmentEvent
import fr.unice.polytech.dsl.polycar.SubAction
import fr.unice.polytech.dsl.polycar.Action
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import fr.unice.polytech.dsl.polycar.EventType
import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension fr.unice.polytech.dsl.polycar.k3.ConditionAspect.*
import static extension fr.unice.polytech.dsl.polycar.k3.EnvironmentEventAspect.*
import static extension fr.unice.polytech.dsl.polycar.k3.ActionAspect.*
import static extension fr.unice.polytech.dsl.polycar.k3.SubActionAspect.*
import fr.unice.polytech.deantoni.vrep.polycar.JbossCar
import fr.unice.polytech.deantoni.vrep.polycar.Direction
import java.util.stream.Collectors
import fr.unice.polytech.dsl.polycar.Condition

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Car)
class PolycarAspect {

	@Main
	def void run() {
		println("Starting Car " + _self.name)
		val car = new JbossCar("127.0.0.1", 19997) // Change with your V-REP machine IP (or 127.0.0.1)
		car.start()
		
		if (_self.defaultAction !== null) {
			_self.defaultAction.run(car);
		} else {
			car.goStraight(0)
		}
		
		while (true) {
			val triggeredEvents = _self.conditions.stream.filter(v|v.isTriggered(car)).collect(Collectors.toList())
			if (!triggeredEvents.empty) {
				triggeredEvents.get(0).run(car)
			}
			car.synchronize()
		}
	}
}

@Aspect(className=Condition)
class ConditionAspect {
	
	def boolean isTriggered(JbossCar car) {
		return _self.environmentEvents.stream.allMatch(v|v.isTriggered(car))
	}
	
	def void run(JbossCar car) {
		if (_self.isTriggered(car)) {
			_self.action.run(car)
		}
	}
}

@Aspect(className=EnvironmentEvent)
class EnvironmentEventAspect {
	public var Boolean trigger = false;
	def boolean isTriggered(JbossCar car) {
		switch (_self.type) {
			case FORB_FORWARD:
				_self.trigger = car.readVeryLeftSensor().red
			case FORB_LEFT:
				_self.trigger = car.readVeryLeftSensor().orange
			case FORB_RIGHT:
				_self.trigger = car.readVeryRightSensor().orange
			case OFF_ROAD_LEFT:
				_self.trigger = !car.readLeftSensor().black
			case OFF_ROAD_RIGHT:
				_self.trigger = !car.readRightSensor().black
			case TRAFFIC_LIGHT_OFF:
				_self.trigger = car.readVeryRightSensor().red
			case TRAFFIC_LIGHT_ON:
				_self.trigger = car.readVeryRightSensor().green
			case OBJECT_LEFT:
				_self.trigger = car.vrepObjects.stream.anyMatch(v | v.direction.equals(Direction.LEFT))
			case OBJECT_MIDDLE:
				_self.trigger = car.vrepObjects.stream.anyMatch(v | v.direction.equals(Direction.MIDDLE))
			case OBJECT_RIGHT:
				_self.trigger = car.vrepObjects.stream.anyMatch(v | v.direction.equals(Direction.RIGHT))
			case CAN_GO_LEFT:
				_self.trigger = car.readVeryLeftSensor().blue
			case CAN_GO_RIGHT:
				_self.trigger = car.readVeryRightSensor().blue
			default:
				_self.trigger = false
		}
		
		return _self.trigger
	}
}

@Aspect(className=Action)
class ActionAspect {

	@Step
	def void run(PolyCar car) {
		_self.subActions.forEach[a|{
			if (a.duration > 0) {
				for (var i = 0; i < a.duration; i++) {
					a.run(car)
					car.synchronize()
				}
			} else {
				a.run(car)
			}
		}]
	}
}

@Aspect(className=SubAction)
class SubActionAspect {

	def void run(PolyCar car) {
		switch (_self.type) {
			case MOTOR_LEFT:
				car.leftSpeed = _self.value
			case MOTOR_RIGHT:
				car.rightSpeed = _self.value
			case SPEED: {
				println(_self.value)
				car.goStraight(_self.value)
			}
		}
	}
}
