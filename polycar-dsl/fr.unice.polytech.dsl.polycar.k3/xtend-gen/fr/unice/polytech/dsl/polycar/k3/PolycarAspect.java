package fr.unice.polytech.dsl.polycar.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.dsl.polycar.Car;
import fr.unice.polytech.dsl.polycar.k3.PolycarAspectCarAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className = Car.class)
@SuppressWarnings("all")
public class PolycarAspect {
  @Main
  public static void run(final Car _self) {
    final fr.unice.polytech.dsl.polycar.k3.PolycarAspectCarAspectProperties _self_ = fr.unice.polytech.dsl.polycar.k3.PolycarAspectCarAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run()
    if (_self instanceof fr.unice.polytech.dsl.polycar.Car){
    	fr.unice.polytech.dsl.polycar.k3.PolycarAspect._privk3_run(_self_, (fr.unice.polytech.dsl.polycar.Car)_self);
    };
  }
  
  protected static void _privk3_run(final PolycarAspectCarAspectProperties _self_, final Car _self) {
    InputOutput.<String>println("Coucou!");
  }
}
