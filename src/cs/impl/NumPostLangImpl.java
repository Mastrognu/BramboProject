/**
 */
package cs.impl;

import cs.CsPackage;
import cs.Languages;
import cs.NumPostLang;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Post Lang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.NumPostLangImpl#getLangNumber <em>Lang Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPostLangImpl extends StatisticImpl implements NumPostLang {
	/**
	 * The cached value of the '{@link #getLangNumber() <em>Lang Number</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangNumber()
	 * @generated
	 * @ordered
	 */
	protected EMap<Languages, Integer> langNumber;

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
	public EMap<Languages, Integer> getLangNumber() {
		if (langNumber == null) {
			langNumber = new EcoreEMap<Languages,Integer>(CsPackage.Literals.MAP_POST_LANG, MapPostLangImpl.class, this, CsPackage.NUM_POST_LANG__LANG_NUMBER);
		}
		return langNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				return ((InternalEList<?>)getLangNumber()).basicRemove(otherEnd, msgs);
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
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				if (coreType) return getLangNumber();
				else return getLangNumber().map();
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
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				((EStructuralFeature.Setting)getLangNumber()).set(newValue);
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
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				getLangNumber().clear();
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
			case CsPackage.NUM_POST_LANG__LANG_NUMBER:
				return langNumber != null && !langNumber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NumPostLangImpl
