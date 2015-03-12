/**
 */
package smr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smr.Author#getName <em>Name</em>}</li>
 *   <li>{@link smr.Author#getLanguage <em>Language</em>}</li>
 *   <li>{@link smr.Author#getCurrentCity <em>Current City</em>}</li>
 * </ul>
 * </p>
 *
 * @see smr.SmrPackage#getAuthor()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Author extends EObject {
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
	 * @see smr.SmrPackage#getAuthor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smr.Author#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link smr.Languages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see smr.Languages
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #setLanguage(Languages)
	 * @see smr.SmrPackage#getAuthor_Language()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Languages getLanguage();

	/**
	 * Sets the value of the '{@link smr.Author#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see smr.Languages
	 * @see #isSetLanguage()
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Languages value);

	/**
	 * Unsets the value of the '{@link smr.Author#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(Languages)
	 * @generated
	 */
	void unsetLanguage();

	/**
	 * Returns whether the value of the '{@link smr.Author#getLanguage <em>Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language</em>' attribute is set.
	 * @see #unsetLanguage()
	 * @see #getLanguage()
	 * @see #setLanguage(Languages)
	 * @generated
	 */
	boolean isSetLanguage();

	/**
	 * Returns the value of the '<em><b>Current City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current City</em>' attribute.
	 * @see #setCurrentCity(String)
	 * @see smr.SmrPackage#getAuthor_CurrentCity()
	 * @model
	 * @generated
	 */
	String getCurrentCity();

	/**
	 * Sets the value of the '{@link smr.Author#getCurrentCity <em>Current City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current City</em>' attribute.
	 * @see #getCurrentCity()
	 * @generated
	 */
	void setCurrentCity(String value);

} // Author
