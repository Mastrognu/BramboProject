/**
 */
package cs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cs.CsFactory
 * @model kind="package"
 * @generated
 */
public interface CsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsPackage eINSTANCE = cs.impl.CsPackageImpl.init();

	/**
	 * The meta object id for the '{@link cs.impl.MonitoredCityImpl <em>Monitored City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.MonitoredCityImpl
	 * @see cs.impl.CsPackageImpl#getMonitoredCity()
	 * @generated
	 */
	int MONITORED_CITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Districts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__DISTRICTS = 1;

	/**
	 * The number of structural features of the '<em>Monitored City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cs.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PlaceImpl
	 * @see cs.impl.CsPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__CATEGORIES = 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cs.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.CategoryImpl
	 * @see cs.impl.CsPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cs.impl.StatisticalDataImpl <em>Statistical Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.StatisticalDataImpl
	 * @see cs.impl.CsPackageImpl#getStatisticalData()
	 * @generated
	 */
	int STATISTICAL_DATA = 3;

	/**
	 * The number of structural features of the '<em>Statistical Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.DistrictImpl <em>District</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.DistrictImpl
	 * @see cs.impl.CsPackageImpl#getDistrict()
	 * @generated
	 */
	int DISTRICT = 4;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Coord Bx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_BX = 2;

	/**
	 * The feature id for the '<em><b>Coord By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_BY = 3;

	/**
	 * The feature id for the '<em><b>Coord Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_EX = 4;

	/**
	 * The feature id for the '<em><b>Coord Ey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_EY = 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__DATA = 6;

	/**
	 * The number of structural features of the '<em>District</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostLangImpl <em>Num Post Lang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostLangImpl
	 * @see cs.impl.CsPackageImpl#getNumPostLang()
	 * @generated
	 */
	int NUM_POST_LANG = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__NAME = STATISTICAL_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postper Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__POSTPER_LANG = STATISTICAL_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Num Post Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG_FEATURE_COUNT = STATISTICAL_DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostDistrImpl <em>Num Post Distr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostDistrImpl
	 * @see cs.impl.CsPackageImpl#getNumPostDistr()
	 * @generated
	 */
	int NUM_POST_DISTR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_DISTR__NAME = STATISTICAL_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postper Distr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_DISTR__POSTPER_DISTR = STATISTICAL_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Num Post Distr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_DISTR_FEATURE_COUNT = STATISTICAL_DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.NumPhotoLangImpl <em>Num Photo Lang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPhotoLangImpl
	 * @see cs.impl.CsPackageImpl#getNumPhotoLang()
	 * @generated
	 */
	int NUM_PHOTO_LANG = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO_LANG__NAME = STATISTICAL_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Photoper Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO_LANG__PHOTOPER_LANG = STATISTICAL_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Num Photo Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO_LANG_FEATURE_COUNT = STATISTICAL_DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostTimeSlotImpl <em>Num Post Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostTimeSlotImpl
	 * @see cs.impl.CsPackageImpl#getNumPostTimeSlot()
	 * @generated
	 */
	int NUM_POST_TIME_SLOT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__NAME = STATISTICAL_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postper Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__POSTPER_TIME_SLOT = STATISTICAL_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Num Post Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT_FEATURE_COUNT = STATISTICAL_DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.CitySensingImpl <em>City Sensing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.CitySensingImpl
	 * @see cs.impl.CsPackageImpl#getCitySensing()
	 * @generated
	 */
	int CITY_SENSING = 9;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_SENSING__CITIES = 0;

	/**
	 * The number of structural features of the '<em>City Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_SENSING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cs.Categories <em>Categories</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.Categories
	 * @see cs.impl.CsPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 10;


	/**
	 * Returns the meta object for class '{@link cs.MonitoredCity <em>Monitored City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitored City</em>'.
	 * @see cs.MonitoredCity
	 * @generated
	 */
	EClass getMonitoredCity();

	/**
	 * Returns the meta object for the attribute '{@link cs.MonitoredCity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.MonitoredCity#getName()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EAttribute getMonitoredCity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.MonitoredCity#getDistricts <em>Districts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Districts</em>'.
	 * @see cs.MonitoredCity#getDistricts()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EReference getMonitoredCity_Districts();

	/**
	 * Returns the meta object for class '{@link cs.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see cs.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link cs.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.Place#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see cs.Place#getCategories()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Categories();

	/**
	 * Returns the meta object for class '{@link cs.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see cs.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link cs.Category#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cs.Category#getType()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Type();

	/**
	 * Returns the meta object for class '{@link cs.StatisticalData <em>Statistical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Data</em>'.
	 * @see cs.StatisticalData
	 * @generated
	 */
	EClass getStatisticalData();

	/**
	 * Returns the meta object for class '{@link cs.District <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>District</em>'.
	 * @see cs.District
	 * @generated
	 */
	EClass getDistrict();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.District#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see cs.District#getPlaces()
	 * @see #getDistrict()
	 * @generated
	 */
	EReference getDistrict_Places();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.District#getName()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordBx <em>Coord Bx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Bx</em>'.
	 * @see cs.District#getCoordBx()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordBx();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordBy <em>Coord By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord By</em>'.
	 * @see cs.District#getCoordBy()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordBy();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordEx <em>Coord Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Ex</em>'.
	 * @see cs.District#getCoordEx()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordEx();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordEy <em>Coord Ey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Ey</em>'.
	 * @see cs.District#getCoordEy()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordEy();

	/**
	 * Returns the meta object for the containment reference '{@link cs.District#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see cs.District#getData()
	 * @see #getDistrict()
	 * @generated
	 */
	EReference getDistrict_Data();

	/**
	 * Returns the meta object for class '{@link cs.NumPostLang <em>Num Post Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Post Lang</em>'.
	 * @see cs.NumPostLang
	 * @generated
	 */
	EClass getNumPostLang();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPostLang#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.NumPostLang#getName()
	 * @see #getNumPostLang()
	 * @generated
	 */
	EAttribute getNumPostLang_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPostLang#getPostperLang <em>Postper Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postper Lang</em>'.
	 * @see cs.NumPostLang#getPostperLang()
	 * @see #getNumPostLang()
	 * @generated
	 */
	EAttribute getNumPostLang_PostperLang();

	/**
	 * Returns the meta object for class '{@link cs.NumPostDistr <em>Num Post Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Post Distr</em>'.
	 * @see cs.NumPostDistr
	 * @generated
	 */
	EClass getNumPostDistr();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPostDistr#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.NumPostDistr#getName()
	 * @see #getNumPostDistr()
	 * @generated
	 */
	EAttribute getNumPostDistr_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPostDistr#getPostperDistr <em>Postper Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postper Distr</em>'.
	 * @see cs.NumPostDistr#getPostperDistr()
	 * @see #getNumPostDistr()
	 * @generated
	 */
	EAttribute getNumPostDistr_PostperDistr();

	/**
	 * Returns the meta object for class '{@link cs.NumPhotoLang <em>Num Photo Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Photo Lang</em>'.
	 * @see cs.NumPhotoLang
	 * @generated
	 */
	EClass getNumPhotoLang();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPhotoLang#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.NumPhotoLang#getName()
	 * @see #getNumPhotoLang()
	 * @generated
	 */
	EAttribute getNumPhotoLang_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPhotoLang#getPhotoperLang <em>Photoper Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photoper Lang</em>'.
	 * @see cs.NumPhotoLang#getPhotoperLang()
	 * @see #getNumPhotoLang()
	 * @generated
	 */
	EAttribute getNumPhotoLang_PhotoperLang();

	/**
	 * Returns the meta object for class '{@link cs.NumPostTimeSlot <em>Num Post Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Post Time Slot</em>'.
	 * @see cs.NumPostTimeSlot
	 * @generated
	 */
	EClass getNumPostTimeSlot();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPostTimeSlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.NumPostTimeSlot#getName()
	 * @see #getNumPostTimeSlot()
	 * @generated
	 */
	EAttribute getNumPostTimeSlot_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPostTimeSlot#getPostperTimeSlot <em>Postper Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postper Time Slot</em>'.
	 * @see cs.NumPostTimeSlot#getPostperTimeSlot()
	 * @see #getNumPostTimeSlot()
	 * @generated
	 */
	EAttribute getNumPostTimeSlot_PostperTimeSlot();

	/**
	 * Returns the meta object for class '{@link cs.CitySensing <em>City Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Sensing</em>'.
	 * @see cs.CitySensing
	 * @generated
	 */
	EClass getCitySensing();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.CitySensing#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see cs.CitySensing#getCities()
	 * @see #getCitySensing()
	 * @generated
	 */
	EReference getCitySensing_Cities();

	/**
	 * Returns the meta object for enum '{@link cs.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categories</em>'.
	 * @see cs.Categories
	 * @generated
	 */
	EEnum getCategories();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsFactory getCsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cs.impl.MonitoredCityImpl <em>Monitored City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.MonitoredCityImpl
		 * @see cs.impl.CsPackageImpl#getMonitoredCity()
		 * @generated
		 */
		EClass MONITORED_CITY = eINSTANCE.getMonitoredCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_CITY__NAME = eINSTANCE.getMonitoredCity_Name();

		/**
		 * The meta object literal for the '<em><b>Districts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_CITY__DISTRICTS = eINSTANCE.getMonitoredCity_Districts();

		/**
		 * The meta object literal for the '{@link cs.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PlaceImpl
		 * @see cs.impl.CsPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__CATEGORIES = eINSTANCE.getPlace_Categories();

		/**
		 * The meta object literal for the '{@link cs.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.CategoryImpl
		 * @see cs.impl.CsPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TYPE = eINSTANCE.getCategory_Type();

		/**
		 * The meta object literal for the '{@link cs.impl.StatisticalDataImpl <em>Statistical Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.StatisticalDataImpl
		 * @see cs.impl.CsPackageImpl#getStatisticalData()
		 * @generated
		 */
		EClass STATISTICAL_DATA = eINSTANCE.getStatisticalData();

		/**
		 * The meta object literal for the '{@link cs.impl.DistrictImpl <em>District</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.DistrictImpl
		 * @see cs.impl.CsPackageImpl#getDistrict()
		 * @generated
		 */
		EClass DISTRICT = eINSTANCE.getDistrict();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRICT__PLACES = eINSTANCE.getDistrict_Places();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__NAME = eINSTANCE.getDistrict_Name();

		/**
		 * The meta object literal for the '<em><b>Coord Bx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_BX = eINSTANCE.getDistrict_CoordBx();

		/**
		 * The meta object literal for the '<em><b>Coord By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_BY = eINSTANCE.getDistrict_CoordBy();

		/**
		 * The meta object literal for the '<em><b>Coord Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_EX = eINSTANCE.getDistrict_CoordEx();

		/**
		 * The meta object literal for the '<em><b>Coord Ey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_EY = eINSTANCE.getDistrict_CoordEy();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRICT__DATA = eINSTANCE.getDistrict_Data();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPostLangImpl <em>Num Post Lang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPostLangImpl
		 * @see cs.impl.CsPackageImpl#getNumPostLang()
		 * @generated
		 */
		EClass NUM_POST_LANG = eINSTANCE.getNumPostLang();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_LANG__NAME = eINSTANCE.getNumPostLang_Name();

		/**
		 * The meta object literal for the '<em><b>Postper Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_LANG__POSTPER_LANG = eINSTANCE.getNumPostLang_PostperLang();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPostDistrImpl <em>Num Post Distr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPostDistrImpl
		 * @see cs.impl.CsPackageImpl#getNumPostDistr()
		 * @generated
		 */
		EClass NUM_POST_DISTR = eINSTANCE.getNumPostDistr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_DISTR__NAME = eINSTANCE.getNumPostDistr_Name();

		/**
		 * The meta object literal for the '<em><b>Postper Distr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_DISTR__POSTPER_DISTR = eINSTANCE.getNumPostDistr_PostperDistr();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPhotoLangImpl <em>Num Photo Lang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPhotoLangImpl
		 * @see cs.impl.CsPackageImpl#getNumPhotoLang()
		 * @generated
		 */
		EClass NUM_PHOTO_LANG = eINSTANCE.getNumPhotoLang();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_PHOTO_LANG__NAME = eINSTANCE.getNumPhotoLang_Name();

		/**
		 * The meta object literal for the '<em><b>Photoper Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_PHOTO_LANG__PHOTOPER_LANG = eINSTANCE.getNumPhotoLang_PhotoperLang();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPostTimeSlotImpl <em>Num Post Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPostTimeSlotImpl
		 * @see cs.impl.CsPackageImpl#getNumPostTimeSlot()
		 * @generated
		 */
		EClass NUM_POST_TIME_SLOT = eINSTANCE.getNumPostTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_TIME_SLOT__NAME = eINSTANCE.getNumPostTimeSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Postper Time Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_TIME_SLOT__POSTPER_TIME_SLOT = eINSTANCE.getNumPostTimeSlot_PostperTimeSlot();

		/**
		 * The meta object literal for the '{@link cs.impl.CitySensingImpl <em>City Sensing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.CitySensingImpl
		 * @see cs.impl.CsPackageImpl#getCitySensing()
		 * @generated
		 */
		EClass CITY_SENSING = eINSTANCE.getCitySensing();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_SENSING__CITIES = eINSTANCE.getCitySensing_Cities();

		/**
		 * The meta object literal for the '{@link cs.Categories <em>Categories</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.Categories
		 * @see cs.impl.CsPackageImpl#getCategories()
		 * @generated
		 */
		EEnum CATEGORIES = eINSTANCE.getCategories();

	}

} //CsPackage
