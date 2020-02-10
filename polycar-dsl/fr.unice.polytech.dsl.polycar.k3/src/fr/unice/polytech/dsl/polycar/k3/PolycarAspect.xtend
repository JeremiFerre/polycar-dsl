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

import static extension fr.unice.polytech.dsl.polycar.k3.EnvironmentEventAspect.*
import static extension fr.unice.polytech.dsl.polycar.k3.ActionAspect.*
import static extension fr.unice.polytech.dsl.polycar.k3.SubActionAspect.*

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Car)
class PolycarAspect {

	@Main
	def void run() {
		println("Starting Car " + _self.name)
		val car = new PolyCar("10.211.55.4", 19997) // Change with your V-REP machine IP (or 127.0.0.1)
		car.start()
		car.goStraight(10)
		while (true) {
			_self.environmentEvents.forEach[env|env.run(car)]
			car.synchronize()
		}
	}
}

@Aspect(className=EnvironmentEvent)
class EnvironmentEventAspect {

	@Step
	def void run(PolyCar car) {
		var trigger = false
		switch (_self.type) {
			case FORB_FORWARD:
				trigger = false
			case FORB_LEFT:
				trigger = false
			case FORB_RIGHT:
				trigger = false
			case OFF_ROAD_LEFT:
				trigger = !car.readLeftSensor().black
			case OFF_ROAD_RIGHT:
				trigger = !car.readRightSensor().black
			case TRAFFIC_LIGHT_OFF:
				trigger = car.readVeryRightSensor().red
			case TRAFFIC_LIGHT_ON:
				trigger = car.readVeryRightSensor().green
			default:
				trigger = false
		}

		if (trigger) {
			_self.action.run(car)
		}
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

	@Step
	def void run(PolyCar car) {
		switch (_self.type) {
			case MOTOR_LEFT:
				car.leftSpeed = _self.value
			case MOTOR_RIGHT:
				car.rightSpeed = _self.value
			case SPEED:
				car.goStraight(_self.value)
		}
	}
}
