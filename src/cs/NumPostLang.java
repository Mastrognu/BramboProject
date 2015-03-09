/**
 */
package cs;

import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Post Lang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.NumPostLang#getLanguage <em>Language</em>}</li>
 *   <li>{@link cs.NumPostLang#getLangNumber <em>Lang Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPostLang()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface NumPostLang extends Statistic {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link cs.Languages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see cs.Languages
	 * @see #setLanguage(Languages)
	 * @see cs.CsPackage#getNumPostLang_Language()
	 * @model
	 * @generated
	 */
	Languages getLanguage();

	/**
	 * Sets the value of the '{@link cs.NumPostLang#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see cs.Languages
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Languages value);

	/**
	 * Returns the value of the '<em><b>Lang Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Number</em>' attribute.
	 * @see #setLangNumber(Map)
	 * @see cs.CsPackage#getNumPostLang_LangNumber()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<Languages, Integer> getLangNumber();

	/**
	 * Sets the value of the '{@link cs.NumPostLang#getLangNumber <em>Lang Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Number</em>' attribute.
	 * @see #getLangNumber()
	 * @generated
	 */
	void setLangNumber(Map<Languages, Integer> value);

} // NumPostLang
