/**
 */
package smr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smr.Coordinates;
import smr.SmrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smr.impl.CoordinatesImpl#getName <em>Name</em>}</li>
 *   <li>{@link smr.impl.CoordinatesImpl#getCoordx <em>Coordx</em>}</li>
 *   <li>{@link smr.impl.CoordinatesImpl#getCoordy <em>Coordy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinatesImpl extends MinimalEObjectImpl.Container implements Coordinates {
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
	 * The default value of the '{@link #getCoordx() <em>Coordx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordx()
	 * @generated
	 * @ordered
	 */
	protected static final float COORDX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordx() <em>Coordx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordx()
	 * @generated
	 * @ordered
	 */
	protected float coordx = COORDX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordy() <em>Coordy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordy()
	 * @generated
	 * @ordered
	 */
	protected static final float COORDY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordy() <em>Coordy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordy()
	 * @generated
	 * @ordered
	 */
	protected float coordy = COORDY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmrPackage.Literals.COORDINATES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmrPackage.COORDINATES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordx() {
		return coordx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordx(float newCoordx) {
		float oldCoordx = coordx;
		coordx = newCoordx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmrPackage.COORDINATES__COORDX, oldCoordx, coordx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordy() {
		return coordy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordy(float newCoordy) {
		float oldCoordy = coordy;
		coordy = newCoordy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmrPackage.COORDINATES__COORDY, oldCoordy, coordy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmrPackage.COORDINATES__NAME:
				return getName();
			case SmrPackage.COORDINATES__COORDX:
				return getCoordx();
			case SmrPackage.COORDINATES__COORDY:
				return getCoordy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmrPackage.COORDINATES__NAME:
				setName((String)newValue);
				return;
			case SmrPackage.COORDINATES__COORDX:
				setCoordx((Float)newValue);
				return;
			case SmrPackage.COORDINATES__COORDY:
				setCoordy((Float)newValue);
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
			case SmrPackage.COORDINATES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmrPackage.COORDINATES__COORDX:
				setCoordx(COORDX_EDEFAULT);
				return;
			case SmrPackage.COORDINATES__COORDY:
				setCoordy(COORDY_EDEFAULT);
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
			case SmrPackage.COORDINATES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmrPackage.COORDINATES__COORDX:
				return coordx != COORDX_EDEFAULT;
			case SmrPackage.COORDINATES__COORDY:
				return coordy != COORDY_EDEFAULT;
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
		result.append(", coordx: ");
		result.append(coordx);
		result.append(", coordy: ");
		result.append(coordy);
		result.append(')');
		return result.toString();
	}

} //CoordinatesImpl
