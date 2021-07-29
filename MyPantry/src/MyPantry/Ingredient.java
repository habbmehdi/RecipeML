/**
 */
package MyPantry;

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
 *   <li>{@link MyPantry.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link MyPantry.Ingredient#getMass <em>Mass</em>}</li>
 * </ul>
 *
 * @see MyPantry.MyPantryPackage#getIngredient()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Ingredient extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MyPantry.MyPantryPackage#getIngredient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MyPantry.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(Mass)
	 * @see MyPantry.MyPantryPackage#getIngredient_Mass()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	Mass getMass();

	/**
	 * Sets the value of the '{@link MyPantry.Ingredient#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(Mass value);

} // Ingredient
