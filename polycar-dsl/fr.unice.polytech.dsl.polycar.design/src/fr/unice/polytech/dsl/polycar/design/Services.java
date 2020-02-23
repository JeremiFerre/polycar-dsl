package fr.unice.polytech.dsl.polycar.design;

import org.eclipse.emf.ecore.EObject;
import polycar.xdsml.api.impl.PolycarRTDAccessor;
import fr.unice.polytech.dsl.polycar.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	public String getEnvType(EObject self) {
		return ((EnvironmentEvent)self).getType().getLiteral();
    }
	
	public boolean getTrigger(EObject self) {
		return PolycarRTDAccessor.getTrigger((EnvironmentEvent)self);
		
	}
}
