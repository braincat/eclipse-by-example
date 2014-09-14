/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bits Per Sample Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.BitsPerSampleType#getValue <em>Value</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.BitsPerSampleType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getBitsPerSampleType()
 * @model extendedMetaData="name='bitsPerSampleType' kind='simple'"
 * @generated
 */
public interface BitsPerSampleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link com.oracle.xmlns.ord.meta.exif.BitsPerSampleT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see com.oracle.xmlns.ord.meta.exif.BitsPerSampleT
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(BitsPerSampleT)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getBitsPerSampleType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BitsPerSampleT getValue();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.BitsPerSampleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see com.oracle.xmlns.ord.meta.exif.BitsPerSampleT
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BitsPerSampleT value);

	/**
	 * Unsets the value of the '{@link com.oracle.xmlns.ord.meta.exif.BitsPerSampleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(BitsPerSampleT)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link com.oracle.xmlns.ord.meta.exif.BitsPerSampleType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(BitsPerSampleT)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(BigInteger)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getBitsPerSampleType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.BitsPerSampleType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // BitsPerSampleType
