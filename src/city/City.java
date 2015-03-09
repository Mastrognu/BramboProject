/**
 */
package city;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link city.City#getName <em>Name</em>}</li>
 *   <li>{@link city.City#getDistricts <em>Districts</em>}</li>
 * </ul>
 * </p>
 *
 * @see city.CityPackage#getCity()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface City extends EObject {
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
	 * @see city.CityPackage#getCity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link city.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Districts</b></em>' containment reference list.
	 * The list contents are of type {@link city.District}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Districts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Districts</em>' containment reference list.
	 * @see city.CityPackage#getCity_Districts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<District> getDistricts();

} // City
