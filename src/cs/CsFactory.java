/**
 */
package cs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cs.CsPackage
 * @generated
 */
public interface CsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsFactory eINSTANCE = cs.impl.CsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Monitored City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitored City</em>'.
	 * @generated
	 */
	MonitoredCity createMonitoredCity();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>District</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>District</em>'.
	 * @generated
	 */
	District createDistrict();

	/**
	 * Returns a new object of class '<em>City Sensing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City Sensing</em>'.
	 * @generated
	 */
	CitySensing createCitySensing();

	/**
	 * Returns a new object of class '<em>Num Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Post</em>'.
	 * @generated
	 */
	NumPost createNumPost();

	/**
	 * Returns a new object of class '<em>Num Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Photo</em>'.
	 * @generated
	 */
	NumPhoto createNumPhoto();

	/**
	 * Returns a new object of class '<em>Num Post Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Post Time Slot</em>'.
	 * @generated
	 */
	NumPostTimeSlot createNumPostTimeSlot();

	/**
	 * Returns a new object of class '<em>Num Post Lang</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Post Lang</em>'.
	 * @generated
	 */
	NumPostLang createNumPostLang();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CsPackage getCsPackage();

} //CsFactory
