/**
 */
package cs.impl;

import cs.CsPackage;
import cs.NumPostDistr;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Post Distr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.NumPostDistrImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.impl.NumPostDistrImpl#getPostperDistr <em>Postper Distr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPostDistrImpl extends StatisticalDataImpl implements NumPostDistr {
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
	 * The default value of the '{@link #getPostperDistr() <em>Postper Distr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostperDistr()
	 * @generated
	 * @ordered
	 */
	protected static final long POSTPER_DISTR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPostperDistr() <em>Postper Distr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostperDistr()
	 * @generated
	 * @ordered
	 */
	protected long postperDistr = POSTPER_DISTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumPostDistrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.NUM_POST_DISTR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.NUM_POST_DISTR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPostperDistr() {
		return postperDistr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostperDistr(long newPostperDistr) {
		long oldPostperDistr = postperDistr;
		postperDistr = newPostperDistr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.NUM_POST_DISTR__POSTPER_DISTR, oldPostperDistr, postperDistr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.NUM_POST_DISTR__NAME:
				return getName();
			case CsPackage.NUM_POST_DISTR__POSTPER_DISTR:
				return getPostperDistr();
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
			case CsPackage.NUM_POST_DISTR__NAME:
				setName((String)newValue);
				return;
			case CsPackage.NUM_POST_DISTR__POSTPER_DISTR:
				setPostperDistr((Long)newValue);
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
			case CsPackage.NUM_POST_DISTR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CsPackage.NUM_POST_DISTR__POSTPER_DISTR:
				setPostperDistr(POSTPER_DISTR_EDEFAULT);
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
			case CsPackage.NUM_POST_DISTR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CsPackage.NUM_POST_DISTR__POSTPER_DISTR:
				return postperDistr != POSTPER_DISTR_EDEFAULT;
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
		result.append(", postperDistr: ");
		result.append(postperDistr);
		result.append(')');
		return result.toString();
	}

} //NumPostDistrImpl
