/**
 */
package smr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smr.Text#getName <em>Name</em>}</li>
 *   <li>{@link smr.Text#getText <em>Text</em>}</li>
 *   <li>{@link smr.Text#getHashtag <em>Hashtag</em>}</li>
 *   <li>{@link smr.Text#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see smr.SmrPackage#getText()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Text extends EObject {
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
	 * @see smr.SmrPackage#getText_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smr.Text#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see smr.SmrPackage#getText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link smr.Text#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Hashtag</b></em>' containment reference list.
	 * The list contents are of type {@link smr.Hashtag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashtag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashtag</em>' containment reference list.
	 * @see smr.SmrPackage#getText_Hashtag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hashtag> getHashtag();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link smr.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see smr.SmrPackage#getText_Tag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTag();

} // Text
