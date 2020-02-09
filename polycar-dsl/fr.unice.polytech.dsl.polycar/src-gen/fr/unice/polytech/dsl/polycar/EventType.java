/**
 */
package fr.unice.polytech.dsl.polycar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.polycar.PolycarPackage#getEventType()
 * @model
 * @generated
 */
public enum EventType implements Enumerator {
	/**
	 * The '<em><b>TRAFFIC LIGHT ON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_LIGHT_ON_VALUE
	 * @generated
	 * @ordered
	 */
	TRAFFIC_LIGHT_ON(0, "TRAFFIC_LIGHT_ON", "TRAFFIC_LIGHT_ON"),

	/**
	 * The '<em><b>TRAFFIC LIGHT OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_LIGHT_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	TRAFFIC_LIGHT_OFF(1, "TRAFFIC_LIGHT_OFF", "TRAFFIC_LIGHT_OFF"),

	/**
	 * The '<em><b>FORB FORWARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORB_FORWARD_VALUE
	 * @generated
	 * @ordered
	 */
	FORB_FORWARD(2, "FORB_FORWARD", "FORB_FORWARD"),

	/**
	 * The '<em><b>FORB LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORB_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	FORB_LEFT(3, "FORB_LEFT", "FORB_LEFT"),

	/**
	 * The '<em><b>FORB RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORB_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	FORB_RIGHT(4, "FORB_RIGHT", "FORB_RIGHT"),
	/**
	 * The '<em><b>OFF THE ROAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #OFF_THE_ROAD_VALUE
	 * @generated
	 * @ordered
	 */
	OFF_THE_ROAD(5, "OFF_THE_ROAD", "OFF_THE_ROAD");

	/**
	 * The '<em><b>TRAFFIC LIGHT ON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAFFIC LIGHT ON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_LIGHT_ON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAFFIC_LIGHT_ON_VALUE = 0;

	/**
	 * The '<em><b>TRAFFIC LIGHT OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAFFIC LIGHT OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_LIGHT_OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAFFIC_LIGHT_OFF_VALUE = 1;

	/**
	 * The '<em><b>FORB FORWARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORB FORWARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORB_FORWARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORB_FORWARD_VALUE = 2;

	/**
	 * The '<em><b>FORB LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORB LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORB_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORB_LEFT_VALUE = 3;

	/**
	 * The '<em><b>FORB RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORB RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORB_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORB_RIGHT_VALUE = 4;

	/**
	 * The '<em><b>OFF THE ROAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFF THE ROAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF_THE_ROAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFF_THE_ROAD_VALUE = 5;

	/**
	 * An array of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventType[] VALUES_ARRAY = new EventType[] { TRAFFIC_LIGHT_ON, TRAFFIC_LIGHT_OFF, FORB_FORWARD,
			FORB_LEFT, FORB_RIGHT, OFF_THE_ROAD, };

	/**
	 * A public read-only list of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType get(int value) {
		switch (value) {
		case TRAFFIC_LIGHT_ON_VALUE:
			return TRAFFIC_LIGHT_ON;
		case TRAFFIC_LIGHT_OFF_VALUE:
			return TRAFFIC_LIGHT_OFF;
		case FORB_FORWARD_VALUE:
			return FORB_FORWARD;
		case FORB_LEFT_VALUE:
			return FORB_LEFT;
		case FORB_RIGHT_VALUE:
			return FORB_RIGHT;
		case OFF_THE_ROAD_VALUE:
			return OFF_THE_ROAD;
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
	private EventType(int value, String name, String literal) {
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

} //EventType
