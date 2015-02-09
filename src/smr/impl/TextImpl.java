/**
 */
package smr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smr.Hashtag;
import smr.SmrPackage;
import smr.Tag;
import smr.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smr.impl.TextImpl#getName <em>Name</em>}</li>
 *   <li>{@link smr.impl.TextImpl#getText <em>Text</em>}</li>
 *   <li>{@link smr.impl.TextImpl#getHashtag <em>Hashtag</em>}</li>
 *   <li>{@link smr.impl.TextImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends EObjectImpl implements Text {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHashtag() <em>Hashtag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashtag()
	 * @generated
	 * @ordered
	 */
	protected EList<Hashtag> hashtag;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmrPackage.Literals.TEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmrPackage.TEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmrPackage.TEXT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hashtag> getHashtag() {
		if (hashtag == null) {
			hashtag = new EObjectContainmentEList<Hashtag>(Hashtag.class, this, SmrPackage.TEXT__HASHTAG);
		}
		return hashtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectContainmentEList<Tag>(Tag.class, this, SmrPackage.TEXT__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmrPackage.TEXT__HASHTAG:
				return ((InternalEList<?>)getHashtag()).basicRemove(otherEnd, msgs);
			case SmrPackage.TEXT__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
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
			case SmrPackage.TEXT__NAME:
				return getName();
			case SmrPackage.TEXT__TEXT:
				return getText();
			case SmrPackage.TEXT__HASHTAG:
				return getHashtag();
			case SmrPackage.TEXT__TAG:
				return getTag();
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
			case SmrPackage.TEXT__NAME:
				setName((String)newValue);
				return;
			case SmrPackage.TEXT__TEXT:
				setText((String)newValue);
				return;
			case SmrPackage.TEXT__HASHTAG:
				getHashtag().clear();
				getHashtag().addAll((Collection<? extends Hashtag>)newValue);
				return;
			case SmrPackage.TEXT__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Tag>)newValue);
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
			case SmrPackage.TEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmrPackage.TEXT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case SmrPackage.TEXT__HASHTAG:
				getHashtag().clear();
				return;
			case SmrPackage.TEXT__TAG:
				getTag().clear();
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
			case SmrPackage.TEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmrPackage.TEXT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case SmrPackage.TEXT__HASHTAG:
				return hashtag != null && !hashtag.isEmpty();
			case SmrPackage.TEXT__TAG:
				return tag != null && !tag.isEmpty();
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
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //TextImpl
