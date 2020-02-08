/**
 */
package fr.unice.polytech.dsl.polycar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.polycar.Action#getSubActions <em>Sub Actions</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Sub Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.polycar.SubAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Actions</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getAction_SubActions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SubAction> getSubActions();
} // Action
