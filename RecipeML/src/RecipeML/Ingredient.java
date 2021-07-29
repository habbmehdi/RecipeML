/**
 */
package RecipeML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RecipeML.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link RecipeML.Ingredient#getCount <em>Count</em>}</li>
 *   <li>{@link RecipeML.Ingredient#getAmount <em>Amount</em>}</li>
 *   <li>{@link RecipeML.Ingredient#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see RecipeML.RecipeMLPackage#getIngredient()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Ingredient extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RecipeML.RecipeMLPackage#getIngredient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RecipeML.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(float)
	 * @see RecipeML.RecipeMLPackage#getIngredient_Count()
	 * @model
	 * @generated
	 */
	float getCount();

	/**
	 * Sets the value of the '{@link RecipeML.Ingredient#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(float value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' reference list.
	 * The list contents are of type {@link RecipeML.Amount}.
	 * It is bidirectional and its opposite is '{@link RecipeML.Amount#getAmountof <em>Amountof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' reference list.
	 * @see RecipeML.RecipeMLPackage#getIngredient_Amount()
	 * @see RecipeML.Amount#getAmountof
	 * @model opposite="amountof"
	 *        annotation="gmf.link"
	 * @generated
	 */
	EList<Amount> getAmount();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see RecipeML.RecipeMLPackage#getIngredient_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link RecipeML.Ingredient#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Ingredient
