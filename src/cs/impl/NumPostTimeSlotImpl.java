/**
 */
package cs.impl;

import cs.CsPackage;
import cs.NumPostTimeSlot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Post Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.NumPostTimeSlotImpl#getTimeSlot <em>Time Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPostTimeSlotImpl extends StatisticImpl implements NumPostTimeSlot {
	/**
	 * The default value of the '{@link #getTimeSlot() <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_SLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeSlot() <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected String timeSlot = TIME_SLOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumPostTimeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.NUM_POST_TIME_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeSlot() {
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSlot(String newTimeSlot) {
		String oldTimeSlot = timeSlot;
		timeSlot = newTimeSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.NUM_POST_TIME_SLOT__TIME_SLOT, oldTimeSlot, timeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.NUM_POST_TIME_SLOT__TIME_SLOT:
				return getTimeSlot();
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
			case CsPackage.NUM_POST_TIME_SLOT__TIME_SLOT:
				setTimeSlot((String)newValue);
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
			case CsPackage.NUM_POST_TIME_SLOT__TIME_SLOT:
				setTimeSlot(TIME_SLOT_EDEFAULT);
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
			case CsPackage.NUM_POST_TIME_SLOT__TIME_SLOT:
				return TIME_SLOT_EDEFAULT == null ? timeSlot != null : !TIME_SLOT_EDEFAULT.equals(timeSlot);
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
		result.append(" (timeSlot: ");
		result.append(timeSlot);
		result.append(')');
		return result.toString();
	}

} //NumPostTimeSlotImpl
