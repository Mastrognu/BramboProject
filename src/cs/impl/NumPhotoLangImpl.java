/**
 */
package cs.impl;

import cs.CsPackage;
import cs.NumPhotoLang;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Photo Lang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.NumPhotoLangImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.impl.NumPhotoLangImpl#getPhotoperLang <em>Photoper Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPhotoLangImpl extends StatisticalDataImpl implements NumPhotoLang {
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
	 * The default value of the '{@link #getPhotoperLang() <em>Photoper Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotoperLang()
	 * @generated
	 * @ordered
	 */
	protected static final long PHOTOPER_LANG_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPhotoperLang() <em>Photoper Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotoperLang()
	 * @generated
	 * @ordered
	 */
	protected long photoperLang = PHOTOPER_LANG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumPhotoLangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.NUM_PHOTO_LANG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.NUM_PHOTO_LANG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPhotoperLang() {
		return photoperLang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhotoperLang(long newPhotoperLang) {
		long oldPhotoperLang = photoperLang;
		photoperLang = newPhotoperLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.NUM_PHOTO_LANG__PHOTOPER_LANG, oldPhotoperLang, photoperLang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.NUM_PHOTO_LANG__NAME:
				return getName();
			case CsPackage.NUM_PHOTO_LANG__PHOTOPER_LANG:
				return getPhotoperLang();
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
			case CsPackage.NUM_PHOTO_LANG__NAME:
				setName((String)newValue);
				return;
			case CsPackage.NUM_PHOTO_LANG__PHOTOPER_LANG:
				setPhotoperLang((Long)newValue);
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
			case CsPackage.NUM_PHOTO_LANG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CsPackage.NUM_PHOTO_LANG__PHOTOPER_LANG:
				setPhotoperLang(PHOTOPER_LANG_EDEFAULT);
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
			case CsPackage.NUM_PHOTO_LANG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CsPackage.NUM_PHOTO_LANG__PHOTOPER_LANG:
				return photoperLang != PHOTOPER_LANG_EDEFAULT;
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
		result.append(", photoperLang: ");
		result.append(photoperLang);
		result.append(')');
		return result.toString();
	}

} //NumPhotoLangImpl
