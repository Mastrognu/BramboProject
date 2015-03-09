/**
 */
package city;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>District</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link city.District#getPlaces <em>Places</em>}</li>
 *   <li>{@link city.District#getName <em>Name</em>}</li>
 *   <li>{@link city.District#getCoordBx <em>Coord Bx</em>}</li>
 *   <li>{@link city.District#getCoordBy <em>Coord By</em>}</li>
 *   <li>{@link city.District#getCoordEx <em>Coord Ex</em>}</li>
 *   <li>{@link city.District#getCoordEy <em>Coord Ey</em>}</li>
 * </ul>
 * </p>
 *
 * @see city.CityPackage#getDistrict()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface District extends EObject {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link city.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see city.CityPackage#getDistrict_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

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
	 * @see city.CityPackage#getDistrict_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link city.District#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coord Bx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord Bx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Bx</em>' attribute.
	 * @see #setCoordBx(float)
	 * @see city.CityPackage#getDistrict_CoordBx()
	 * @model required="true"
	 * @generated
	 */
	float getCoordBx();

	/**
	 * Sets the value of the '{@link city.District#getCoordBx <em>Coord Bx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Bx</em>' attribute.
	 * @see #getCoordBx()
	 * @generated
	 */
	void setCoordBx(float value);

	/**
	 * Returns the value of the '<em><b>Coord By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord By</em>' attribute.
	 * @see #setCoordBy(float)
	 * @see city.CityPackage#getDistrict_CoordBy()
	 * @model required="true"
	 * @generated
	 */
	float getCoordBy();

	/**
	 * Sets the value of the '{@link city.District#getCoordBy <em>Coord By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord By</em>' attribute.
	 * @see #getCoordBy()
	 * @generated
	 */
	void setCoordBy(float value);

	/**
	 * Returns the value of the '<em><b>Coord Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord Ex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Ex</em>' attribute.
	 * @see #setCoordEx(float)
	 * @see city.CityPackage#getDistrict_CoordEx()
	 * @model required="true"
	 * @generated
	 */
	float getCoordEx();

	/**
	 * Sets the value of the '{@link city.District#getCoordEx <em>Coord Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Ex</em>' attribute.
	 * @see #getCoordEx()
	 * @generated
	 */
	void setCoordEx(float value);

	/**
	 * Returns the value of the '<em><b>Coord Ey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord Ey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Ey</em>' attribute.
	 * @see #setCoordEy(float)
	 * @see city.CityPackage#getDistrict_CoordEy()
	 * @model required="true"
	 * @generated
	 */
	float getCoordEy();

	/**
	 * Sets the value of the '{@link city.District#getCoordEy <em>Coord Ey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Ey</em>' attribute.
	 * @see #getCoordEy()
	 * @generated
	 */
	void setCoordEy(float value);

} // District
