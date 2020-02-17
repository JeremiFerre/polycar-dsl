/**
 */
package fr.unice.polytech.dsl.polycar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getEnvironmentEvent()
 * @model
 * @generated
 */
public interface EnvironmentEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.dsl.polycar.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.unice.polytech.dsl.polycar.EventType
	 * @see #setType(EventType)
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getEnvironmentEvent_Type()
	 * @model
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.unice.polytech.dsl.polycar.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void react();

} // EnvironmentEvent
