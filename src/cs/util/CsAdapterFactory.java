/**
 */
package cs.util;

import cs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cs.CsPackage
 * @generated
 */
public class CsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsSwitch<Adapter> modelSwitch =
		new CsSwitch<Adapter>() {
			@Override
			public Adapter caseMonitoredCity(MonitoredCity object) {
				return createMonitoredCityAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseStatisticalData(StatisticalData object) {
				return createStatisticalDataAdapter();
			}
			@Override
			public Adapter caseDistrict(District object) {
				return createDistrictAdapter();
			}
			@Override
			public Adapter caseNumPostLang(NumPostLang object) {
				return createNumPostLangAdapter();
			}
			@Override
			public Adapter caseNumPostDistr(NumPostDistr object) {
				return createNumPostDistrAdapter();
			}
			@Override
			public Adapter caseNumPhotoLang(NumPhotoLang object) {
				return createNumPhotoLangAdapter();
			}
			@Override
			public Adapter caseNumPostTimeSlot(NumPostTimeSlot object) {
				return createNumPostTimeSlotAdapter();
			}
			@Override
			public Adapter caseCitySensing(CitySensing object) {
				return createCitySensingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cs.MonitoredCity <em>Monitored City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.MonitoredCity
	 * @generated
	 */
	public Adapter createMonitoredCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.StatisticalData <em>Statistical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.StatisticalData
	 * @generated
	 */
	public Adapter createStatisticalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.District <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.District
	 * @generated
	 */
	public Adapter createDistrictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.NumPostLang <em>Num Post Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.NumPostLang
	 * @generated
	 */
	public Adapter createNumPostLangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.NumPostDistr <em>Num Post Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.NumPostDistr
	 * @generated
	 */
	public Adapter createNumPostDistrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.NumPhotoLang <em>Num Photo Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.NumPhotoLang
	 * @generated
	 */
	public Adapter createNumPhotoLangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.NumPostTimeSlot <em>Num Post Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.NumPostTimeSlot
	 * @generated
	 */
	public Adapter createNumPostTimeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.CitySensing <em>City Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.CitySensing
	 * @generated
	 */
	public Adapter createCitySensingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CsAdapterFactory
