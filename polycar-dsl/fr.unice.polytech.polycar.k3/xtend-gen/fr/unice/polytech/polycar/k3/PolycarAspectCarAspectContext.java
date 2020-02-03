package fr.unice.polytech.polycar.k3;

import fr.unice.polytech.polycar.Car;
import fr.unice.polytech.polycar.k3.PolycarAspectCarAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PolycarAspectCarAspectContext {
  public final static PolycarAspectCarAspectContext INSTANCE = new PolycarAspectCarAspectContext();
  
  public static PolycarAspectCarAspectProperties getSelf(final Car _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.polycar.k3.PolycarAspectCarAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Car, PolycarAspectCarAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.polycar.Car, fr.unice.polytech.polycar.k3.PolycarAspectCarAspectProperties>();
  
  public Map<Car, PolycarAspectCarAspectProperties> getMap() {
    return map;
  }
}
