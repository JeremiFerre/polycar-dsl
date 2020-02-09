package fr.unice.polytech.dsl.polycar.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.dsl.polycar.Car
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import fr.unice.polytech.dsl.polycar.EventType

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Car)
class PolycarAspect {
	
	@Main
	public def void run() {		
		println("Starting Car " + _self.name)
		val car = new PolyCar("10.211.55.4", 19997) // Change with your V-REP machine IP (or 127.0.0.1)
		
		car.start()
        car.goStraight(10)
        while (true) {
        	_self.environmentEvents.forEach[env|{
				if (new EventTypeCondition(car, env.type).triggered) {
					println("Event " + env.type + " triggered!")
					env.action.subActions.forEach[a|{
						new ActionCarAdapter(car, a.type, a.value).execute()
					}]
				}
        	}]
            Thread.sleep(200)
        }
	}
	
}
