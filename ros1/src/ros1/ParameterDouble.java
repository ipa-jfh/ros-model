/**
 */
package ros1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.ParameterDouble#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getParameterDouble()
 * @model
 * @generated
 */
public interface ParameterDouble extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see ros1.Ros1Package#getParameterDouble_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link ros1.ParameterDouble#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // ParameterDouble