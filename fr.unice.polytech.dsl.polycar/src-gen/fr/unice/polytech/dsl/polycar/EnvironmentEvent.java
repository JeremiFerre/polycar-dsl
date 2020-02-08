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
 *   <li>{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent#getAction <em>Action</em>}</li>
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
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getEnvironmentEvent_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void react();

} // EnvironmentEvent
