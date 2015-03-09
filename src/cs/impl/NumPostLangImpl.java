/**
 */
package cs.impl;

import cs.CsPackage;
import cs.Languages;
import cs.NumPostLang;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Post Lang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.NumPostLangImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link cs.impl.NumPostLangImpl#getLangNumber <em>Lang Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPostLangImpl extends StatisticImpl implements NumPostLang {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Languages LANGUAGE_EDEFAULT = Languages.ENGLISH;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Languages language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLangNumber() <em>Lang Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangNumber()
	 * @generated
	 * @ordered
	 */
	protected Map<Languages, Integer> langNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumPostLangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.NUM_POST_LANG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Languages newLanguage) {
		Languages oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.NUM_POST_LANG__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Languages, Integer> getLangNumber() {
		return langNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangNumber(Map<Languages, Integer> newLangNumber) {
		Map<Languages, Integer> oldLangNumber = langNumber;
		langNumber = newLangNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.NUM_POST_LANG__LANG_NUMBER, oldLangNumber, langNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.NUM_POST_LANG__LANGUAGE:
				return getLanguage();
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				return getLangNumber();
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
			case CsPackage.NUM_POST_LANG__LANGUAGE:
				setLanguage((Languages)newValue);
				return;
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				setLangNumber((Map<Languages, Integer>)newValue);
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
			case CsPackage.NUM_POST_LANG__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				setLangNumber((Map<Languages, Integer>)null);
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
			case CsPackage.NUM_POST_LANG__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				return langNumber != null;
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
		result.append(" (language: ");
		result.append(language);
		result.append(", langNumber: ");
		result.append(langNumber);
		result.append(')');
		return result.toString();
	}

} //NumPostLangImpl
