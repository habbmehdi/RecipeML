/**
 */
package MyPantry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pantry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyPantry.Pantry#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 *
 * @see MyPantry.MyPantryPackage#getPantry()
 * @model annotation="gmf.diagram uri='org.example.mypantry' prefix='try'"
 * @generated
 */
public interface Pantry extends EObject {
	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link MyPantry.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see MyPantry.MyPantryPackage#getPantry_Ingredient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ingredient> getIngredient();

} // Pantry
