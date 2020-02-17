/**
 */
package fr.unice.polytech.dsl.polycar.impl;

import fr.unice.polytech.dsl.polycar.Action;
import fr.unice.polytech.dsl.polycar.Car;
import fr.unice.polytech.dsl.polycar.EnvironmentEvent;
import fr.unice.polytech.dsl.polycar.PolycarPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.polycar.impl.CarImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.impl.CarImpl#getRightMotor <em>Right Motor</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.impl.CarImpl#getEnvironmentEvents <em>Environment Events</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.impl.CarImpl#getLeftMotor <em>Left Motor</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.polycar.impl.CarImpl#getDefaultAction <em>Default Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarImpl extends NamedElementImpl implements Car {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The default value of the '{@link #getRightMotor() <em>Right Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMotor()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_MOTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightMotor() <em>Right Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMotor()
	 * @generated
	 * @ordered
	 */
	protected int rightMotor = RIGHT_MOTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvironmentEvents() <em>Environment Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentEvent> environmentEvents;

	/**
	 * The default value of the '{@link #getLeftMotor() <em>Left Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMotor()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_MOTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeftMotor() <em>Left Motor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMotor()
	 * @generated
	 * @ordered
	 */
	protected int leftMotor = LEFT_MOTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultAction() <em>Default Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAction()
	 * @generated
	 * @ordered
	 */
	protected Action defaultAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycarPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, PolycarPackage.CAR__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRightMotor() {
		return rightMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMotor(int newRightMotor) {
		int oldRightMotor = rightMotor;
		rightMotor = newRightMotor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycarPackage.CAR__RIGHT_MOTOR, oldRightMotor,
					rightMotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentEvent> getEnvironmentEvents() {
		if (environmentEvents == null) {
			environmentEvents = new EObjectContainmentEList<EnvironmentEvent>(EnvironmentEvent.class, this,
					PolycarPackage.CAR__ENVIRONMENT_EVENTS);
		}
		return environmentEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeftMotor() {
		return leftMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMotor(int newLeftMotor) {
		int oldLeftMotor = leftMotor;
		leftMotor = newLeftMotor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycarPackage.CAR__LEFT_MOTOR, oldLeftMotor,
					leftMotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getDefaultAction() {
		if (defaultAction != null && defaultAction.eIsProxy()) {
			InternalEObject oldDefaultAction = (InternalEObject) defaultAction;
			defaultAction = (Action) eResolveProxy(oldDefaultAction);
			if (defaultAction != oldDefaultAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PolycarPackage.CAR__DEFAULT_ACTION,
							oldDefaultAction, defaultAction));
			}
		}
		return defaultAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetDefaultAction() {
		return defaultAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAction(Action newDefaultAction) {
		Action oldDefaultAction = defaultAction;
		defaultAction = newDefaultAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycarPackage.CAR__DEFAULT_ACTION, oldDefaultAction,
					defaultAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PolycarPackage.CAR__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case PolycarPackage.CAR__ENVIRONMENT_EVENTS:
			return ((InternalEList<?>) getEnvironmentEvents()).basicRemove(otherEnd, msgs);
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
		case PolycarPackage.CAR__ACTIONS:
			return getActions();
		case PolycarPackage.CAR__RIGHT_MOTOR:
			return getRightMotor();
		case PolycarPackage.CAR__ENVIRONMENT_EVENTS:
			return getEnvironmentEvents();
		case PolycarPackage.CAR__LEFT_MOTOR:
			return getLeftMotor();
		case PolycarPackage.CAR__DEFAULT_ACTION:
			if (resolve)
				return getDefaultAction();
			return basicGetDefaultAction();
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
		case PolycarPackage.CAR__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case PolycarPackage.CAR__RIGHT_MOTOR:
			setRightMotor((Integer) newValue);
			return;
		case PolycarPackage.CAR__ENVIRONMENT_EVENTS:
			getEnvironmentEvents().clear();
			getEnvironmentEvents().addAll((Collection<? extends EnvironmentEvent>) newValue);
			return;
		case PolycarPackage.CAR__LEFT_MOTOR:
			setLeftMotor((Integer) newValue);
			return;
		case PolycarPackage.CAR__DEFAULT_ACTION:
			setDefaultAction((Action) newValue);
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
		case PolycarPackage.CAR__ACTIONS:
			getActions().clear();
			return;
		case PolycarPackage.CAR__RIGHT_MOTOR:
			setRightMotor(RIGHT_MOTOR_EDEFAULT);
			return;
		case PolycarPackage.CAR__ENVIRONMENT_EVENTS:
			getEnvironmentEvents().clear();
			return;
		case PolycarPackage.CAR__LEFT_MOTOR:
			setLeftMotor(LEFT_MOTOR_EDEFAULT);
			return;
		case PolycarPackage.CAR__DEFAULT_ACTION:
			setDefaultAction((Action) null);
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
		case PolycarPackage.CAR__ACTIONS:
			return actions != null && !actions.isEmpty();
		case PolycarPackage.CAR__RIGHT_MOTOR:
			return rightMotor != RIGHT_MOTOR_EDEFAULT;
		case PolycarPackage.CAR__ENVIRONMENT_EVENTS:
			return environmentEvents != null && !environmentEvents.isEmpty();
		case PolycarPackage.CAR__LEFT_MOTOR:
			return leftMotor != LEFT_MOTOR_EDEFAULT;
		case PolycarPackage.CAR__DEFAULT_ACTION:
			return defaultAction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (rightMotor: ");
		result.append(rightMotor);
		result.append(", leftMotor: ");
		result.append(leftMotor);
		result.append(')');
		return result.toString();
	}

} //CarImpl
