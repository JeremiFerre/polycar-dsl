/**
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.formatting2;

import com.google.inject.Inject;
import fr.unice.polytech.dsl.polycar.Action;
import fr.unice.polytech.dsl.polycar.Car;
import fr.unice.polytech.dsl.services.PolycarGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PolycarFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private PolycarGrammarAccess _polycarGrammarAccess;
  
  protected void _format(final Car car, @Extension final IFormattableDocument document) {
    EList<Action> _actions = car.getActions();
    for (final Action action : _actions) {
      document.<Action>format(action);
    }
  }
  
  public void format(final Object car, final IFormattableDocument document) {
    if (car instanceof XtextResource) {
      _format((XtextResource)car, document);
      return;
    } else if (car instanceof Car) {
      _format((Car)car, document);
      return;
    } else if (car instanceof EObject) {
      _format((EObject)car, document);
      return;
    } else if (car == null) {
      _format((Void)null, document);
      return;
    } else if (car != null) {
      _format(car, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(car, document).toString());
    }
  }
}