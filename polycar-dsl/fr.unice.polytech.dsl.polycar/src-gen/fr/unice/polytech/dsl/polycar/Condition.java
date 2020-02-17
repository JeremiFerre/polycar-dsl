/**
 */
package fr.unice.polytech.dsl.polycar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.polycar.Condition#getEnvironmentEvents <em>Environment Events</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.Condition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.polycar.EnvironmentEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Events</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCondition_EnvironmentEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentEvent> getEnvironmentEvents();

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
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCondition_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.polycar.Condition#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Condition
