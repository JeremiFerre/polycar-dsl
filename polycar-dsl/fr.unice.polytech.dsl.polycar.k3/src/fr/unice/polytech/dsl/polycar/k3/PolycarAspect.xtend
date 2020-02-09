package fr.unice.polytech.dsl.polycar.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.dsl.polycar.Car

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Car)
class PolycarAspect {
	
	@Main
	public def void run() {		
		println("Coucou!")
	}
	
}
