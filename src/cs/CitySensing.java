/**
 */
package cs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City Sensing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.CitySensing#getCities <em>Cities</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getCitySensing()
 * @model
 * @generated
 */
public interface CitySensing extends EObject {
	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
	 * The list contents are of type {@link cs.MonitoredCity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference list.
	 * @see cs.CsPackage#getCitySensing_Cities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MonitoredCity> getCities();

} // CitySensing
