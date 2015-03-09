/**
 */
package city;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link city.CityModel#getCities <em>Cities</em>}</li>
 * </ul>
 * </p>
 *
 * @see city.CityPackage#getCityModel()
 * @model
 * @generated
 */
public interface CityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
	 * The list contents are of type {@link city.City}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference list.
	 * @see city.CityPackage#getCityModel_Cities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<City> getCities();

} // CityModel
