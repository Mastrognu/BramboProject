/**
 */
package cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Post Distr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.NumPostDistr#getName <em>Name</em>}</li>
 *   <li>{@link cs.NumPostDistr#getPostperDistr <em>Postper Distr</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPostDistr()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface NumPostDistr extends StatisticalData {
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
	 * @see cs.CsPackage#getNumPostDistr_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cs.NumPostDistr#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Postper Distr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postper Distr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postper Distr</em>' attribute.
	 * @see #setPostperDistr(long)
	 * @see cs.CsPackage#getNumPostDistr_PostperDistr()
	 * @model required="true"
	 * @generated
	 */
	long getPostperDistr();

	/**
	 * Sets the value of the '{@link cs.NumPostDistr#getPostperDistr <em>Postper Distr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postper Distr</em>' attribute.
	 * @see #getPostperDistr()
	 * @generated
	 */
	void setPostperDistr(long value);

} // NumPostDistr
