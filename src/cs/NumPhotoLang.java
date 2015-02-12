/**
 */
package cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Photo Lang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.NumPhotoLang#getName <em>Name</em>}</li>
 *   <li>{@link cs.NumPhotoLang#getPhotoperLang <em>Photoper Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPhotoLang()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface NumPhotoLang extends StatisticalData {
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
	 * @see cs.CsPackage#getNumPhotoLang_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cs.NumPhotoLang#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Photoper Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photoper Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photoper Lang</em>' attribute.
	 * @see #setPhotoperLang(long)
	 * @see cs.CsPackage#getNumPhotoLang_PhotoperLang()
	 * @model required="true"
	 * @generated
	 */
	long getPhotoperLang();

	/**
	 * Sets the value of the '{@link cs.NumPhotoLang#getPhotoperLang <em>Photoper Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photoper Lang</em>' attribute.
	 * @see #getPhotoperLang()
	 * @generated
	 */
	void setPhotoperLang(long value);

} // NumPhotoLang
