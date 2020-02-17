/**
 */
package fr.unice.polytech.dsl.polycar.impl;

import fr.unice.polytech.dsl.polycar.Action;
import fr.unice.polytech.dsl.polycar.PolycarPackage;
import fr.unice.polytech.dsl.polycar.SubAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.polycar.impl.ActionImpl#getSubActions <em>Sub Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends NamedElementImpl implements Action {
	/**
	 * The cached value of the '{@link #getSubActions() <em>Sub Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SubAction> subActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycarPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubAction> getSubActions() {
		if (subActions == null) {
			subActions = new EObjectContainmentEList<SubAction>(SubAction.class, this,
					PolycarPackage.ACTION__SUB_ACTIONS);
		}
		return subActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PolycarPackage.ACTION__SUB_ACTIONS:
			return ((InternalEList<?>) getSubActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycarPackage.ACTION__SUB_ACTIONS:
			return getSubActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PolycarPackage.ACTION__SUB_ACTIONS:
			getSubActions().clear();
			getSubActions().addAll((Collection<? extends SubAction>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PolycarPackage.ACTION__SUB_ACTIONS:
			getSubActions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PolycarPackage.ACTION__SUB_ACTIONS:
			return subActions != null && !subActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
