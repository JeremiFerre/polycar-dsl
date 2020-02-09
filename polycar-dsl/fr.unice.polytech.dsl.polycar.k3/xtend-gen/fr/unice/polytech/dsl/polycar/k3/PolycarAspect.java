package fr.unice.polytech.dsl.polycar.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import fr.unice.polytech.dsl.polycar.ActionType;
import fr.unice.polytech.dsl.polycar.Car;
import fr.unice.polytech.dsl.polycar.EnvironmentEvent;
import fr.unice.polytech.dsl.polycar.EventType;
import fr.unice.polytech.dsl.polycar.SubAction;
import fr.unice.polytech.dsl.polycar.k3.ActionCarAdapter;
import fr.unice.polytech.dsl.polycar.k3.EventTypeCondition;
import fr.unice.polytech.dsl.polycar.k3.PolycarAspectCarAspectProperties;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
    try {
      String _name = _self.getName();
      String _plus = ("Starting Car " + _name);
      InputOutput.<String>println(_plus);
      final PolyCar car = new PolyCar("10.211.55.4", 19997);
      car.start();
      car.goStraight(10);
      while (true) {
        {
          final Consumer<EnvironmentEvent> _function = (EnvironmentEvent env) -> {
            EventType _type = env.getType();
            boolean _isTriggered = new EventTypeCondition(car, _type).isTriggered();
            if (_isTriggered) {
              EventType _type_1 = env.getType();
              String _plus_1 = ("Event " + _type_1);
              String _plus_2 = (_plus_1 + " triggered!");
              InputOutput.<String>println(_plus_2);
              final Consumer<SubAction> _function_1 = (SubAction a) -> {
                ActionType _type_2 = a.getType();
                int _value = a.getValue();
                new ActionCarAdapter(car, _type_2, _value).execute();
              };
              env.getAction().getSubActions().forEach(_function_1);
            }
          };
          _self.getEnvironmentEvents().forEach(_function);
          Thread.sleep(200);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
