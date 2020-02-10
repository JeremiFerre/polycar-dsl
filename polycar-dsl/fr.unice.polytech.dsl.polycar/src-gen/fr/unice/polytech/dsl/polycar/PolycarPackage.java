/**
 */
package fr.unice.polytech.dsl.polycar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.polycar.PolycarFactory
 * @model kind="package"
 * @generated
 */
public interface PolycarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polycar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.unice.polytech.dsl.polycar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.unice.polytech.dsl.polycar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycarPackage eINSTANCE = fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.polycar.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.polycar.impl.NamedElementImpl
	 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.polycar.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.polycar.impl.CarImpl
	 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Motor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__RIGHT_MOTOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ENVIRONMENT_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left Motor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__LEFT_MOTOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.polycar.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.polycar.impl.ActionImpl
	 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUB_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.polycar.impl.SubActionImpl <em>Sub Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.polycar.impl.SubActionImpl
	 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getSubAction()
	 * @generated
	 */
	int SUB_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION__DURATION = 2;

	/**
	 * The number of structural features of the '<em>Sub Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sub Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.polycar.impl.EnvironmentEventImpl <em>Environment Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.polycar.impl.EnvironmentEventImpl
	 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getEnvironmentEvent()
	 * @generated
	 */
	int ENVIRONMENT_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_EVENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_EVENT__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Environment Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_EVENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>React</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_EVENT___REACT = 0;

	/**
	 * The number of operations of the '<em>Environment Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_EVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.polycar.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.polycar.ActionType
	 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 5;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.polycar.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.polycar.EventType
	 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 6;

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.polycar.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.unice.polytech.dsl.polycar.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.polycar.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.dsl.polycar.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.polycar.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see fr.unice.polytech.dsl.polycar.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.polycar.Car#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.unice.polytech.dsl.polycar.Car#getActions()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Actions();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.polycar.Car#getRightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Motor</em>'.
	 * @see fr.unice.polytech.dsl.polycar.Car#getRightMotor()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_RightMotor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.polycar.Car#getEnvironmentEvents <em>Environment Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Events</em>'.
	 * @see fr.unice.polytech.dsl.polycar.Car#getEnvironmentEvents()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_EnvironmentEvents();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.polycar.Car#getLeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Motor</em>'.
	 * @see fr.unice.polytech.dsl.polycar.Car#getLeftMotor()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_LeftMotor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.polycar.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.unice.polytech.dsl.polycar.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.polycar.Action#getSubActions <em>Sub Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Actions</em>'.
	 * @see fr.unice.polytech.dsl.polycar.Action#getSubActions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_SubActions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.polycar.SubAction <em>Sub Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Action</em>'.
	 * @see fr.unice.polytech.dsl.polycar.SubAction
	 * @generated
	 */
	EClass getSubAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.polycar.SubAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.polytech.dsl.polycar.SubAction#getType()
	 * @see #getSubAction()
	 * @generated
	 */
	EAttribute getSubAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.polycar.SubAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.dsl.polycar.SubAction#getValue()
	 * @see #getSubAction()
	 * @generated
	 */
	EAttribute getSubAction_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.polycar.SubAction#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.unice.polytech.dsl.polycar.SubAction#getDuration()
	 * @see #getSubAction()
	 * @generated
	 */
	EAttribute getSubAction_Duration();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent <em>Environment Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Event</em>'.
	 * @see fr.unice.polytech.dsl.polycar.EnvironmentEvent
	 * @generated
	 */
	EClass getEnvironmentEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.polytech.dsl.polycar.EnvironmentEvent#getType()
	 * @see #getEnvironmentEvent()
	 * @generated
	 */
	EAttribute getEnvironmentEvent_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see fr.unice.polytech.dsl.polycar.EnvironmentEvent#getAction()
	 * @see #getEnvironmentEvent()
	 * @generated
	 */
	EReference getEnvironmentEvent_Action();

	/**
	 * Returns the meta object for the '{@link fr.unice.polytech.dsl.polycar.EnvironmentEvent#react() <em>React</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>React</em>' operation.
	 * @see fr.unice.polytech.dsl.polycar.EnvironmentEvent#react()
	 * @generated
	 */
	EOperation getEnvironmentEvent__React();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.dsl.polycar.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see fr.unice.polytech.dsl.polycar.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.dsl.polycar.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see fr.unice.polytech.dsl.polycar.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolycarFactory getPolycarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.polycar.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.polycar.impl.NamedElementImpl
		 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.polycar.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.polycar.impl.CarImpl
		 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__ACTIONS = eINSTANCE.getCar_Actions();

		/**
		 * The meta object literal for the '<em><b>Right Motor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__RIGHT_MOTOR = eINSTANCE.getCar_RightMotor();

		/**
		 * The meta object literal for the '<em><b>Environment Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__ENVIRONMENT_EVENTS = eINSTANCE.getCar_EnvironmentEvents();

		/**
		 * The meta object literal for the '<em><b>Left Motor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__LEFT_MOTOR = eINSTANCE.getCar_LeftMotor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.polycar.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.polycar.impl.ActionImpl
		 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Sub Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SUB_ACTIONS = eINSTANCE.getAction_SubActions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.polycar.impl.SubActionImpl <em>Sub Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.polycar.impl.SubActionImpl
		 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getSubAction()
		 * @generated
		 */
		EClass SUB_ACTION = eINSTANCE.getSubAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ACTION__TYPE = eINSTANCE.getSubAction_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ACTION__VALUE = eINSTANCE.getSubAction_Value();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ACTION__DURATION = eINSTANCE.getSubAction_Duration();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.polycar.impl.EnvironmentEventImpl <em>Environment Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.polycar.impl.EnvironmentEventImpl
		 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getEnvironmentEvent()
		 * @generated
		 */
		EClass ENVIRONMENT_EVENT = eINSTANCE.getEnvironmentEvent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_EVENT__TYPE = eINSTANCE.getEnvironmentEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_EVENT__ACTION = eINSTANCE.getEnvironmentEvent_Action();

		/**
		 * The meta object literal for the '<em><b>React</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_EVENT___REACT = eINSTANCE.getEnvironmentEvent__React();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.polycar.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.polycar.ActionType
		 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.polycar.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.polycar.EventType
		 * @see fr.unice.polytech.dsl.polycar.impl.PolycarPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

	}

} //PolycarPackage
