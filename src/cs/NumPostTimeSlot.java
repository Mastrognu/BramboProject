/**
 */
package cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Post Time Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.NumPostTimeSlot#getName <em>Name</em>}</li>
 *   <li>{@link cs.NumPostTimeSlot#getPostperTimeSlot <em>Postper Time Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPostTimeSlot()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface NumPostTimeSlot extends StatisticalData {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cs.CsPackage#getNumPostTimeSlot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cs.NumPostTimeSlot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Postper Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postper Time Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postper Time Slot</em>' attribute.
	 * @see #setPostperTimeSlot(long)
	 * @see cs.CsPackage#getNumPostTimeSlot_PostperTimeSlot()
	 * @model required="true"
	 * @generated
	 */
	long getPostperTimeSlot();

	/**
	 * Sets the value of the '{@link cs.NumPostTimeSlot#getPostperTimeSlot <em>Postper Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postper Time Slot</em>' attribute.
	 * @see #getPostperTimeSlot()
	 * @generated
	 */
	void setPostperTimeSlot(long value);

} // NumPostTimeSlot
