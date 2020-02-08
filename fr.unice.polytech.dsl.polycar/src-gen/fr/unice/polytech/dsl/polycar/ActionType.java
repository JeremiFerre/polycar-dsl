/**
 */
package fr.unice.polytech.dsl.polycar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getActionType()
 * @model
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
	 * The '<em><b>SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	SPEED(0, "SPEED", "SPEED"),

	/**
	 * The '<em><b>MOTOR LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR_LEFT(1, "MOTOR_LEFT", "MOTOR_LEFT"),

	/**
	 * The '<em><b>MOTOR RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR_RIGHT(2, "MOTOR_RIGHT", "MOTOR_RIGHT");

	/**
	 * The '<em><b>SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_VALUE = 0;

	/**
	 * The '<em><b>MOTOR LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOTOR LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTOR_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_LEFT_VALUE = 1;

	/**
	 * The '<em><b>MOTOR RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOTOR RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTOR_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_RIGHT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionType[] VALUES_ARRAY = new ActionType[] { SPEED, MOTOR_LEFT, MOTOR_RIGHT, };

	/**
	 * A public read-only list of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType get(int value) {
		switch (value) {
		case SPEED_VALUE:
			return SPEED;
		case MOTOR_LEFT_VALUE:
			return MOTOR_LEFT;
		case MOTOR_RIGHT_VALUE:
			return MOTOR_RIGHT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ActionType
