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
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__STATS = 2;

	/**
	 * The number of structural features of the '<em>Monitored City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Monitored City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__STATS = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.StatisticImpl <em>Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.StatisticImpl
	 * @see cs.impl.CsPackageImpl#getStatistic()
	 * @generated
	 */
	int STATISTIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__METRIC = 1;

	/**
	 * The number of structural features of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__STATS = 6;

	/**
	 * The number of structural features of the '<em>District</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>District</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostLangImpl <em>Num Post Lang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostLangImpl
	 * @see cs.impl.CsPackageImpl#getNumPostLang()
	 * @generated
	 */
	int NUM_POST_LANG = 6;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostImpl <em>Num Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostImpl
	 * @see cs.impl.CsPackageImpl#getNumPost()
	 * @generated
	 */
	int NUM_POST = 7;

	/**
	 * The meta object id for the '{@link cs.impl.NumPhotoImpl <em>Num Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPhotoImpl
	 * @see cs.impl.CsPackageImpl#getNumPhoto()
	 * @generated
	 */
	int NUM_PHOTO = 8;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostTimeSlotImpl <em>Num Post Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostTimeSlotImpl
	 * @see cs.impl.CsPackageImpl#getNumPostTimeSlot()
	 * @generated
	 */
	int NUM_POST_TIME_SLOT = 9;

	/**
	 * The meta object id for the '{@link cs.impl.CitySensingImpl <em>City Sensing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.CitySensingImpl
	 * @see cs.impl.CsPackageImpl#getCitySensing()
	 * @generated
	 */
	int CITY_SENSING = 5;

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
	 * The number of operations of the '<em>City Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_SENSING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__METRIC = STATISTIC__METRIC;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__LANGUAGE = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__LANG_NUMBER = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Num Post Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Num Post Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST__METRIC = STATISTIC__METRIC;

	/**
	 * The number of structural features of the '<em>Num Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Num Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO__METRIC = STATISTIC__METRIC;

	/**
	 * The number of structural features of the '<em>Num Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Num Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__METRIC = STATISTIC__METRIC;

	/**
	 * The feature id for the '<em><b>Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__TIME_SLOT = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Num Post Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Num Post Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link cs.Languages <em>Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.Languages
	 * @see cs.impl.CsPackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 11;


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
	 * Returns the meta object for the containment reference list '{@link cs.MonitoredCity#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see cs.MonitoredCity#getStats()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EReference getMonitoredCity_Stats();

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
	 * Returns the meta object for the containment reference list '{@link cs.Place#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see cs.Place#getStats()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Stats();

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
	 * Returns the meta object for class '{@link cs.Statistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic</em>'.
	 * @see cs.Statistic
	 * @generated
	 */
	EClass getStatistic();

	/**
	 * Returns the meta object for the attribute '{@link cs.Statistic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.Statistic#getName()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.Statistic#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see cs.Statistic#getMetric()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Metric();

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
	 * Returns the meta object for the containment reference list '{@link cs.District#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see cs.District#getStats()
	 * @see #getDistrict()
	 * @generated
	 */
	EReference getDistrict_Stats();

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
	 * Returns the meta object for the attribute '{@link cs.NumPostLang#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see cs.NumPostLang#getLanguage()
	 * @see #getNumPostLang()
	 * @generated
	 */
	EAttribute getNumPostLang_Language();

	/**
	 * Returns the meta object for the attribute '{@link cs.NumPostLang#getLangNumber <em>Lang Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Number</em>'.
	 * @see cs.NumPostLang#getLangNumber()
	 * @see #getNumPostLang()
	 * @generated
	 */
	EAttribute getNumPostLang_LangNumber();

	/**
	 * Returns the meta object for class '{@link cs.NumPost <em>Num Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Post</em>'.
	 * @see cs.NumPost
	 * @generated
	 */
	EClass getNumPost();

	/**
	 * Returns the meta object for class '{@link cs.NumPhoto <em>Num Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Photo</em>'.
	 * @see cs.NumPhoto
	 * @generated
	 */
	EClass getNumPhoto();

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
	 * Returns the meta object for the attribute '{@link cs.NumPostTimeSlot#getTimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Slot</em>'.
	 * @see cs.NumPostTimeSlot#getTimeSlot()
	 * @see #getNumPostTimeSlot()
	 * @generated
	 */
	EAttribute getNumPostTimeSlot_TimeSlot();

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
	 * Returns the meta object for enum '{@link cs.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Languages</em>'.
	 * @see cs.Languages
	 * @generated
	 */
	EEnum getLanguages();

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
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_CITY__STATS = eINSTANCE.getMonitoredCity_Stats();

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
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__STATS = eINSTANCE.getPlace_Stats();

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
		 * The meta object literal for the '{@link cs.impl.StatisticImpl <em>Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.StatisticImpl
		 * @see cs.impl.CsPackageImpl#getStatistic()
		 * @generated
		 */
		EClass STATISTIC = eINSTANCE.getStatistic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__NAME = eINSTANCE.getStatistic_Name();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__METRIC = eINSTANCE.getStatistic_Metric();

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
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRICT__STATS = eINSTANCE.getDistrict_Stats();

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
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_LANG__LANGUAGE = eINSTANCE.getNumPostLang_Language();

		/**
		 * The meta object literal for the '<em><b>Lang Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_LANG__LANG_NUMBER = eINSTANCE.getNumPostLang_LangNumber();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPostImpl <em>Num Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPostImpl
		 * @see cs.impl.CsPackageImpl#getNumPost()
		 * @generated
		 */
		EClass NUM_POST = eINSTANCE.getNumPost();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPhotoImpl <em>Num Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPhotoImpl
		 * @see cs.impl.CsPackageImpl#getNumPhoto()
		 * @generated
		 */
		EClass NUM_PHOTO = eINSTANCE.getNumPhoto();

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
		 * The meta object literal for the '<em><b>Time Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POST_TIME_SLOT__TIME_SLOT = eINSTANCE.getNumPostTimeSlot_TimeSlot();

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

		/**
		 * The meta object literal for the '{@link cs.Languages <em>Languages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.Languages
		 * @see cs.impl.CsPackageImpl#getLanguages()
		 * @generated
		 */
		EEnum LANGUAGES = eINSTANCE.getLanguages();

	}

} //CsPackage
