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
 *   <li>{@link cs.NumPostTimeSlot#getTimeSlot <em>Time Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPostTimeSlot()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface NumPostTimeSlot extends Statistic {
	/**
	 * Returns the value of the '<em><b>Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slot</em>' attribute.
	 * @see #setTimeSlot(String)
	 * @see cs.CsPackage#getNumPostTimeSlot_TimeSlot()
	 * @model required="true"
	 * @generated
	 */
	String getTimeSlot();

	/**
	 * Sets the value of the '{@link cs.NumPostTimeSlot#getTimeSlot <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Slot</em>' attribute.
	 * @see #getTimeSlot()
	 * @generated
	 */
	void setTimeSlot(String value);

} // NumPostTimeSlot
