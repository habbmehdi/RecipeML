/**
 */
package RecipeML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RecipeML.Amount#getName <em>Name</em>}</li>
 *   <li>{@link RecipeML.Amount#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link RecipeML.Amount#getAmountof <em>Amountof</em>}</li>
 *   <li>{@link RecipeML.Amount#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see RecipeML.RecipeMLPackage#getAmount()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Amount extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RecipeML.RecipeMLPackage#getAmount_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RecipeML.Amount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(float)
	 * @see RecipeML.RecipeMLPackage#getAmount_Quantity()
	 * @model
	 * @generated
	 */
	float getQuantity();

	/**
	 * Sets the value of the '{@link RecipeML.Amount#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(float value);

	/**
	 * Returns the value of the '<em><b>Amountof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link RecipeML.Ingredient#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amountof</em>' reference.
	 * @see #setAmountof(Ingredient)
	 * @see RecipeML.RecipeMLPackage#getAmount_Amountof()
	 * @see RecipeML.Ingredient#getAmount
	 * @model opposite="amount" required="true"
	 *        annotation="gmf.link"
	 * @generated
	 */
	Ingredient getAmountof();

	/**
	 * Sets the value of the '{@link RecipeML.Amount#getAmountof <em>Amountof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amountof</em>' reference.
	 * @see #getAmountof()
	 * @generated
	 */
	void setAmountof(Ingredient value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see RecipeML.RecipeMLPackage#getAmount_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link RecipeML.Amount#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Amount
