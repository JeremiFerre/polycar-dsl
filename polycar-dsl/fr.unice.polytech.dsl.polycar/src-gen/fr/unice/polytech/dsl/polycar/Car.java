/**
 */
package fr.unice.polytech.dsl.polycar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.polycar.Car#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.Car#getRightMotor <em>Right Motor</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.Car#getEnvironmentEvents <em>Environment Events</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.Car#getLeftMotor <em>Left Motor</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.polycar.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCar_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Right Motor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Motor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Motor</em>' attribute.
	 * @see #setRightMotor(int)
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCar_RightMotor()
	 * @model
	 * @generated
	 */
	int getRightMotor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.polycar.Car#getRightMotor <em>Right Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Motor</em>' attribute.
	 * @see #getRightMotor()
	 * @generated
	 */
	void setRightMotor(int value);

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
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCar_EnvironmentEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentEvent> getEnvironmentEvents();

	/**
	 * Returns the value of the '<em><b>Left Motor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Motor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Motor</em>' attribute.
	 * @see #setLeftMotor(int)
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getCar_LeftMotor()
	 * @model
	 * @generated
	 */
	int getLeftMotor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.polycar.Car#getLeftMotor <em>Left Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Motor</em>' attribute.
	 * @see #getLeftMotor()
	 * @generated
	 */
	void setLeftMotor(int value);

} // Car
