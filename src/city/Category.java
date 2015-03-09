/**
 */
package city;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link city.Category#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see city.CityPackage#getCategory()
 * @model annotation="gmf.node label='type'"
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link city.Categories}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see city.Categories
	 * @see #setType(Categories)
	 * @see city.CityPackage#getCategory_Type()
	 * @model
	 * @generated
	 */
	Categories getType();

	/**
	 * Sets the value of the '{@link city.Category#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see city.Categories
	 * @see #getType()
	 * @generated
	 */
	void setType(Categories value);

} // Category
