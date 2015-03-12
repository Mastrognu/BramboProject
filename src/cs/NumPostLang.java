/**
 */
package cs;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Post Lang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.NumPostLang#getLangNumber <em>Lang Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPostLang()
 * @model
 * @generated
 */
public interface NumPostLang extends Statistic {
	/**
	 * Returns the value of the '<em><b>Lang Number</b></em>' map.
	 * The key is of type {@link cs.Languages},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Number</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Number</em>' map.
	 * @see cs.CsPackage#getNumPostLang_LangNumber()
	 * @model mapType="cs.MapPostLang<cs.Languages, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<Languages, Integer> getLangNumber();

} // NumPostLang
