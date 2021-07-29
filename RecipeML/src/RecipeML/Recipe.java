/**
 */
package RecipeML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RecipeML.Recipe#getBaseings <em>Baseings</em>}</li>
 *   <li>{@link RecipeML.Recipe#getMethods <em>Methods</em>}</li>
 *   <li>{@link RecipeML.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link RecipeML.Recipe#getServes <em>Serves</em>}</li>
 * </ul>
 *
 * @see RecipeML.RecipeMLPackage#getRecipe()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Baseings</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeML.BaseIng}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseings</em>' containment reference list.
	 * @see RecipeML.RecipeMLPackage#getRecipe_Baseings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BaseIng> getBaseings();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeML.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see RecipeML.RecipeMLPackage#getRecipe_Methods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RecipeML.RecipeMLPackage#getRecipe_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RecipeML.Recipe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Serves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves</em>' attribute.
	 * @see #setServes(int)
	 * @see RecipeML.RecipeMLPackage#getRecipe_Serves()
	 * @model
	 * @generated
	 */
	int getServes();

	/**
	 * Sets the value of the '{@link RecipeML.Recipe#getServes <em>Serves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves</em>' attribute.
	 * @see #getServes()
	 * @generated
	 */
	void setServes(int value);

} // Recipe
