/**
 */
package cs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.Category#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getCategory()
 * @model annotation="gmf.node label='type'"
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cs.Categories}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cs.Categories
	 * @see #setType(Categories)
	 * @see cs.CsPackage#getCategory_Type()
	 * @model
	 * @generated
	 */
	Categories getType();

	/**
	 * Sets the value of the '{@link cs.Category#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cs.Categories
	 * @see #getType()
	 * @generated
	 */
	void setType(Categories value);

} // Category
