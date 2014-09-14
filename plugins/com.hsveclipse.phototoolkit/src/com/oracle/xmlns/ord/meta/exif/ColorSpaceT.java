/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Space T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getColorSpaceT()
 * @model extendedMetaData="name='colorSpace_t'"
 * @generated
 */
public enum ColorSpaceT implements Enumerator {
	/**
	 * The '<em><b>SRGB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRGB_VALUE
	 * @generated
	 * @ordered
	 */
	SRGB(0, "sRGB", "sRGB"),

	/**
	 * The '<em><b>Uncalibrated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCALIBRATED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCALIBRATED(1, "Uncalibrated", "Uncalibrated");

	/**
	 * The '<em><b>SRGB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRGB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SRGB
	 * @model name="sRGB"
	 * @generated
	 * @ordered
	 */
	public static final int SRGB_VALUE = 0;

	/**
	 * The '<em><b>Uncalibrated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uncalibrated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCALIBRATED
	 * @model name="Uncalibrated"
	 * @generated
	 * @ordered
	 */
	public static final int UNCALIBRATED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Color Space T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColorSpaceT[] VALUES_ARRAY =
		new ColorSpaceT[] {
			SRGB,
			UNCALIBRATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Color Space T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColorSpaceT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color Space T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorSpaceT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorSpaceT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Space T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorSpaceT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorSpaceT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Space T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorSpaceT get(int value) {
		switch (value) {
			case SRGB_VALUE: return SRGB;
			case UNCALIBRATED_VALUE: return UNCALIBRATED;
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
	private ColorSpaceT(int value, String name, String literal) {
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
	
} //ColorSpaceT
