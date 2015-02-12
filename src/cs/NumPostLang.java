/**
 */
package cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Post Lang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.NumPostLang#getName <em>Name</em>}</li>
 *   <li>{@link cs.NumPostLang#getPostperLang <em>Postper Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPostLang()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface NumPostLang extends StatisticalData {
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
	 * @see cs.CsPackage#getNumPostLang_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cs.NumPostLang#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Postper Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postper Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postper Lang</em>' attribute.
	 * @see #setPostperLang(long)
	 * @see cs.CsPackage#getNumPostLang_PostperLang()
	 * @model required="true"
	 * @generated
	 */
	long getPostperLang();

	/**
	 * Sets the value of the '{@link cs.NumPostLang#getPostperLang <em>Postper Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postper Lang</em>' attribute.
	 * @see #getPostperLang()
	 * @generated
	 */
	void setPostperLang(long value);

} // NumPostLang
