/**
 */
package smr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smr.Coordinates#getName <em>Name</em>}</li>
 *   <li>{@link smr.Coordinates#getCoordx <em>Coordx</em>}</li>
 *   <li>{@link smr.Coordinates#getCoordy <em>Coordy</em>}</li>
 * </ul>
 * </p>
 *
 * @see smr.SmrPackage#getCoordinates()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Coordinates extends EObject {
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
	 * @see smr.SmrPackage#getCoordinates_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smr.Coordinates#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coordx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordx</em>' attribute.
	 * @see #setCoordx(long)
	 * @see smr.SmrPackage#getCoordinates_Coordx()
	 * @model required="true"
	 * @generated
	 */
	long getCoordx();

	/**
	 * Sets the value of the '{@link smr.Coordinates#getCoordx <em>Coordx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordx</em>' attribute.
	 * @see #getCoordx()
	 * @generated
	 */
	void setCoordx(long value);

	/**
	 * Returns the value of the '<em><b>Coordy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordy</em>' attribute.
	 * @see #setCoordy(long)
	 * @see smr.SmrPackage#getCoordinates_Coordy()
	 * @model required="true"
	 * @generated
	 */
	long getCoordy();

	/**
	 * Sets the value of the '{@link smr.Coordinates#getCoordy <em>Coordy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordy</em>' attribute.
	 * @see #getCoordy()
	 * @generated
	 */
	void setCoordy(long value);

} // Coordinates
