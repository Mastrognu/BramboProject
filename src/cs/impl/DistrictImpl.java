/**
 */
package cs.impl;

import cs.CsPackage;
import cs.District;
import cs.Place;
import cs.Statistic;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>District</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.DistrictImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link cs.impl.DistrictImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.impl.DistrictImpl#getCoordBx <em>Coord Bx</em>}</li>
 *   <li>{@link cs.impl.DistrictImpl#getCoordBy <em>Coord By</em>}</li>
 *   <li>{@link cs.impl.DistrictImpl#getCoordEx <em>Coord Ex</em>}</li>
 *   <li>{@link cs.impl.DistrictImpl#getCoordEy <em>Coord Ey</em>}</li>
 *   <li>{@link cs.impl.DistrictImpl#getStats <em>Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistrictImpl extends MinimalEObjectImpl.Container implements District {
	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordBx() <em>Coord Bx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBx()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_BX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordBx() <em>Coord Bx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBx()
	 * @generated
	 * @ordered
	 */
	protected float coordBx = COORD_BX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordBy() <em>Coord By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBy()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_BY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordBy() <em>Coord By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBy()
	 * @generated
	 * @ordered
	 */
	protected float coordBy = COORD_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordEx() <em>Coord Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEx()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_EX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordEx() <em>Coord Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEx()
	 * @generated
	 * @ordered
	 */
	protected float coordEx = COORD_EX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordEy() <em>Coord Ey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEy()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_EY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordEy() <em>Coord Ey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEy()
	 * @generated
	 * @ordered
	 */
	protected float coordEy = COORD_EY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected EList<Statistic> stats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistrictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.DISTRICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Place>(Place.class, this, CsPackage.DISTRICT__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DISTRICT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordBx() {
		return coordBx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordBx(float newCoordBx) {
		float oldCoordBx = coordBx;
		coordBx = newCoordBx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DISTRICT__COORD_BX, oldCoordBx, coordBx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordBy() {
		return coordBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordBy(float newCoordBy) {
		float oldCoordBy = coordBy;
		coordBy = newCoordBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DISTRICT__COORD_BY, oldCoordBy, coordBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordEx() {
		return coordEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordEx(float newCoordEx) {
		float oldCoordEx = coordEx;
		coordEx = newCoordEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DISTRICT__COORD_EX, oldCoordEx, coordEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordEy() {
		return coordEy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordEy(float newCoordEy) {
		float oldCoordEy = coordEy;
		coordEy = newCoordEy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DISTRICT__COORD_EY, oldCoordEy, coordEy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statistic> getStats() {
		if (stats == null) {
			stats = new EObjectContainmentEList<Statistic>(Statistic.class, this, CsPackage.DISTRICT__STATS);
		}
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.DISTRICT__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case CsPackage.DISTRICT__STATS:
				return ((InternalEList<?>)getStats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.DISTRICT__PLACES:
				return getPlaces();
			case CsPackage.DISTRICT__NAME:
				return getName();
			case CsPackage.DISTRICT__COORD_BX:
				return getCoordBx();
			case CsPackage.DISTRICT__COORD_BY:
				return getCoordBy();
			case CsPackage.DISTRICT__COORD_EX:
				return getCoordEx();
			case CsPackage.DISTRICT__COORD_EY:
				return getCoordEy();
			case CsPackage.DISTRICT__STATS:
				return getStats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.DISTRICT__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case CsPackage.DISTRICT__NAME:
				setName((String)newValue);
				return;
			case CsPackage.DISTRICT__COORD_BX:
				setCoordBx((Float)newValue);
				return;
			case CsPackage.DISTRICT__COORD_BY:
				setCoordBy((Float)newValue);
				return;
			case CsPackage.DISTRICT__COORD_EX:
				setCoordEx((Float)newValue);
				return;
			case CsPackage.DISTRICT__COORD_EY:
				setCoordEy((Float)newValue);
				return;
			case CsPackage.DISTRICT__STATS:
				getStats().clear();
				getStats().addAll((Collection<? extends Statistic>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.DISTRICT__PLACES:
				getPlaces().clear();
				return;
			case CsPackage.DISTRICT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CsPackage.DISTRICT__COORD_BX:
				setCoordBx(COORD_BX_EDEFAULT);
				return;
			case CsPackage.DISTRICT__COORD_BY:
				setCoordBy(COORD_BY_EDEFAULT);
				return;
			case CsPackage.DISTRICT__COORD_EX:
				setCoordEx(COORD_EX_EDEFAULT);
				return;
			case CsPackage.DISTRICT__COORD_EY:
				setCoordEy(COORD_EY_EDEFAULT);
				return;
			case CsPackage.DISTRICT__STATS:
				getStats().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.DISTRICT__PLACES:
				return places != null && !places.isEmpty();
			case CsPackage.DISTRICT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CsPackage.DISTRICT__COORD_BX:
				return coordBx != COORD_BX_EDEFAULT;
			case CsPackage.DISTRICT__COORD_BY:
				return coordBy != COORD_BY_EDEFAULT;
			case CsPackage.DISTRICT__COORD_EX:
				return coordEx != COORD_EX_EDEFAULT;
			case CsPackage.DISTRICT__COORD_EY:
				return coordEy != COORD_EY_EDEFAULT;
			case CsPackage.DISTRICT__STATS:
				return stats != null && !stats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", coordBx: ");
		result.append(coordBx);
		result.append(", coordBy: ");
		result.append(coordBy);
		result.append(", coordEx: ");
		result.append(coordEx);
		result.append(", coordEy: ");
		result.append(coordEy);
		result.append(')');
		return result.toString();
	}

} //DistrictImpl
