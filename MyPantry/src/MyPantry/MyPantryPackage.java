/**
 */
package MyPantry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MyPantry.MyPantryFactory
 * @model kind="package"
 * @generated
 */
public interface MyPantryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MyPantry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.example.mypantry";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "try";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyPantryPackage eINSTANCE = MyPantry.impl.MyPantryPackageImpl.init();

	/**
	 * The meta object id for the '{@link MyPantry.impl.PantryImpl <em>Pantry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyPantry.impl.PantryImpl
	 * @see MyPantry.impl.MyPantryPackageImpl#getPantry()
	 * @generated
	 */
	int PANTRY = 0;

	/**
	 * The feature id for the '<em><b>Ingredient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANTRY__INGREDIENT = 0;

	/**
	 * The number of structural features of the '<em>Pantry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MyPantry.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyPantry.impl.IngredientImpl
	 * @see MyPantry.impl.MyPantryPackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__MASS = 1;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link MyPantry.impl.MassImpl <em>Mass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyPantry.impl.MassImpl
	 * @see MyPantry.impl.MyPantryPackageImpl#getMass()
	 * @generated
	 */
	int MASS = 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Mass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link MyPantry.Pantry <em>Pantry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pantry</em>'.
	 * @see MyPantry.Pantry
	 * @generated
	 */
	EClass getPantry();

	/**
	 * Returns the meta object for the containment reference list '{@link MyPantry.Pantry#getIngredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient</em>'.
	 * @see MyPantry.Pantry#getIngredient()
	 * @see #getPantry()
	 * @generated
	 */
	EReference getPantry_Ingredient();

	/**
	 * Returns the meta object for class '{@link MyPantry.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see MyPantry.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link MyPantry.Ingredient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MyPantry.Ingredient#getName()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MyPantry.Ingredient#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mass</em>'.
	 * @see MyPantry.Ingredient#getMass()
	 * @see #getIngredient()
	 * @generated
	 */
	EReference getIngredient_Mass();

	/**
	 * Returns the meta object for class '{@link MyPantry.Mass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mass</em>'.
	 * @see MyPantry.Mass
	 * @generated
	 */
	EClass getMass();

	/**
	 * Returns the meta object for the attribute '{@link MyPantry.Mass#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see MyPantry.Mass#getAmount()
	 * @see #getMass()
	 * @generated
	 */
	EAttribute getMass_Amount();

	/**
	 * Returns the meta object for the attribute '{@link MyPantry.Mass#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MyPantry.Mass#getUnit()
	 * @see #getMass()
	 * @generated
	 */
	EAttribute getMass_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyPantryFactory getMyPantryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MyPantry.impl.PantryImpl <em>Pantry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyPantry.impl.PantryImpl
		 * @see MyPantry.impl.MyPantryPackageImpl#getPantry()
		 * @generated
		 */
		EClass PANTRY = eINSTANCE.getPantry();

		/**
		 * The meta object literal for the '<em><b>Ingredient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANTRY__INGREDIENT = eINSTANCE.getPantry_Ingredient();

		/**
		 * The meta object literal for the '{@link MyPantry.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyPantry.impl.IngredientImpl
		 * @see MyPantry.impl.MyPantryPackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENT__MASS = eINSTANCE.getIngredient_Mass();

		/**
		 * The meta object literal for the '{@link MyPantry.impl.MassImpl <em>Mass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyPantry.impl.MassImpl
		 * @see MyPantry.impl.MyPantryPackageImpl#getMass()
		 * @generated
		 */
		EClass MASS = eINSTANCE.getMass();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASS__AMOUNT = eINSTANCE.getMass_Amount();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASS__UNIT = eINSTANCE.getMass_Unit();

	}

} //MyPantryPackage
