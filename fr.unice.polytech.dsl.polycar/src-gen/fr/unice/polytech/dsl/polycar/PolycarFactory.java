/**
 */
package fr.unice.polytech.dsl.polycar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.polycar.PolycarPackage
 * @generated
 */
public interface PolycarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycarFactory eINSTANCE = fr.unice.polytech.dsl.polycar.impl.PolycarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car</em>'.
	 * @generated
	 */
	Car createCar();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Sub Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Action</em>'.
	 * @generated
	 */
	SubAction createSubAction();

	/**
	 * Returns a new object of class '<em>Environment Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Event</em>'.
	 * @generated
	 */
	EnvironmentEvent createEnvironmentEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolycarPackage getPolycarPackage();

} //PolycarFactory
