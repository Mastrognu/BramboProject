/**
 */
package cs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.MonitoredCity#getName <em>Name</em>}</li>
 *   <li>{@link cs.MonitoredCity#getDistricts <em>Districts</em>}</li>
 *   <li>{@link cs.MonitoredCity#getStats <em>Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getMonitoredCity()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface MonitoredCity extends EObject {
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
	 * @see cs.CsPackage#getMonitoredCity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cs.MonitoredCity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Districts</b></em>' containment reference list.
	 * The list contents are of type {@link cs.District}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Districts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Districts</em>' containment reference list.
	 * @see cs.CsPackage#getMonitoredCity_Districts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<District> getDistricts();

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference list.
	 * The list contents are of type {@link cs.Statistic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference list.
	 * @see cs.CsPackage#getMonitoredCity_Stats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statistic> getStats();

} // MonitoredCity
