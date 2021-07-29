/**
 */
package RecipeML;

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
 * @see RecipeML.RecipeMLFactory
 * @model kind="package"
 * @generated
 */
public interface RecipeMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RecipeML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.project.recipeml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecipeMLPackage eINSTANCE = RecipeML.impl.RecipeMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link RecipeML.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RecipeML.impl.RecipeImpl
	 * @see RecipeML.impl.RecipeMLPackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 0;

	/**
	 * The feature id for the '<em><b>Baseings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__BASEINGS = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__METHODS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Serves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__SERVES = 3;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link RecipeML.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RecipeML.impl.IngredientImpl
	 * @see RecipeML.impl.RecipeMLPackageImpl#getIngredient()
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
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__COUNT = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__UNIT = 3;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link RecipeML.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RecipeML.impl.MethodImpl
	 * @see RecipeML.impl.RecipeMLPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Creates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CREATES = 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__USES = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TIME = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STEP = 4;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link RecipeML.impl.ModIngImpl <em>Mod Ing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RecipeML.impl.ModIngImpl
	 * @see RecipeML.impl.RecipeMLPackageImpl#getModIng()
	 * @generated
	 */
	int MOD_ING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_ING__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_ING__COUNT = INGREDIENT__COUNT;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_ING__AMOUNT = INGREDIENT__AMOUNT;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_ING__UNIT = INGREDIENT__UNIT;

	/**
	 * The number of structural features of the '<em>Mod Ing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_ING_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link RecipeML.impl.BaseIngImpl <em>Base Ing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RecipeML.impl.BaseIngImpl
	 * @see RecipeML.impl.RecipeMLPackageImpl#getBaseIng()
	 * @generated
	 */
	int BASE_ING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ING__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ING__COUNT = INGREDIENT__COUNT;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ING__AMOUNT = INGREDIENT__AMOUNT;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ING__UNIT = INGREDIENT__UNIT;

	/**
	 * The number of structural features of the '<em>Base Ing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ING_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link RecipeML.impl.AmountImpl <em>Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RecipeML.impl.AmountImpl
	 * @see RecipeML.impl.RecipeMLPackageImpl#getAmount()
	 * @generated
	 */
	int AMOUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Amountof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__AMOUNTOF = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__UNIT = 3;

	/**
	 * The number of structural features of the '<em>Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link RecipeML.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see RecipeML.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the containment reference list '{@link RecipeML.Recipe#getBaseings <em>Baseings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baseings</em>'.
	 * @see RecipeML.Recipe#getBaseings()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Baseings();

	/**
	 * Returns the meta object for the containment reference list '{@link RecipeML.Recipe#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see RecipeML.Recipe#getMethods()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Methods();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Recipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RecipeML.Recipe#getName()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Name();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Recipe#getServes <em>Serves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serves</em>'.
	 * @see RecipeML.Recipe#getServes()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Serves();

	/**
	 * Returns the meta object for class '{@link RecipeML.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see RecipeML.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Ingredient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RecipeML.Ingredient#getName()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Name();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Ingredient#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see RecipeML.Ingredient#getCount()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Count();

	/**
	 * Returns the meta object for the reference list '{@link RecipeML.Ingredient#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Amount</em>'.
	 * @see RecipeML.Ingredient#getAmount()
	 * @see #getIngredient()
	 * @generated
	 */
	EReference getIngredient_Amount();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Ingredient#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see RecipeML.Ingredient#getUnit()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Unit();

	/**
	 * Returns the meta object for class '{@link RecipeML.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see RecipeML.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RecipeML.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link RecipeML.Method#getCreates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creates</em>'.
	 * @see RecipeML.Method#getCreates()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Creates();

	/**
	 * Returns the meta object for the containment reference list '{@link RecipeML.Method#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see RecipeML.Method#getUses()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Uses();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Method#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see RecipeML.Method#getTime()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Time();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Method#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see RecipeML.Method#getStep()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Step();

	/**
	 * Returns the meta object for class '{@link RecipeML.ModIng <em>Mod Ing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod Ing</em>'.
	 * @see RecipeML.ModIng
	 * @generated
	 */
	EClass getModIng();

	/**
	 * Returns the meta object for class '{@link RecipeML.BaseIng <em>Base Ing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Ing</em>'.
	 * @see RecipeML.BaseIng
	 * @generated
	 */
	EClass getBaseIng();

	/**
	 * Returns the meta object for class '{@link RecipeML.Amount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount</em>'.
	 * @see RecipeML.Amount
	 * @generated
	 */
	EClass getAmount();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Amount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RecipeML.Amount#getName()
	 * @see #getAmount()
	 * @generated
	 */
	EAttribute getAmount_Name();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Amount#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see RecipeML.Amount#getQuantity()
	 * @see #getAmount()
	 * @generated
	 */
	EAttribute getAmount_Quantity();

	/**
	 * Returns the meta object for the reference '{@link RecipeML.Amount#getAmountof <em>Amountof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amountof</em>'.
	 * @see RecipeML.Amount#getAmountof()
	 * @see #getAmount()
	 * @generated
	 */
	EReference getAmount_Amountof();

	/**
	 * Returns the meta object for the attribute '{@link RecipeML.Amount#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see RecipeML.Amount#getUnit()
	 * @see #getAmount()
	 * @generated
	 */
	EAttribute getAmount_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecipeMLFactory getRecipeMLFactory();

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
		 * The meta object literal for the '{@link RecipeML.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RecipeML.impl.RecipeImpl
		 * @see RecipeML.impl.RecipeMLPackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Baseings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__BASEINGS = eINSTANCE.getRecipe_Baseings();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__METHODS = eINSTANCE.getRecipe_Methods();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

		/**
		 * The meta object literal for the '<em><b>Serves</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__SERVES = eINSTANCE.getRecipe_Serves();

		/**
		 * The meta object literal for the '{@link RecipeML.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RecipeML.impl.IngredientImpl
		 * @see RecipeML.impl.RecipeMLPackageImpl#getIngredient()
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
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__COUNT = eINSTANCE.getIngredient_Count();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGREDIENT__AMOUNT = eINSTANCE.getIngredient_Amount();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__UNIT = eINSTANCE.getIngredient_Unit();

		/**
		 * The meta object literal for the '{@link RecipeML.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RecipeML.impl.MethodImpl
		 * @see RecipeML.impl.RecipeMLPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Creates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CREATES = eINSTANCE.getMethod_Creates();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__USES = eINSTANCE.getMethod_Uses();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__TIME = eINSTANCE.getMethod_Time();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STEP = eINSTANCE.getMethod_Step();

		/**
		 * The meta object literal for the '{@link RecipeML.impl.ModIngImpl <em>Mod Ing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RecipeML.impl.ModIngImpl
		 * @see RecipeML.impl.RecipeMLPackageImpl#getModIng()
		 * @generated
		 */
		EClass MOD_ING = eINSTANCE.getModIng();

		/**
		 * The meta object literal for the '{@link RecipeML.impl.BaseIngImpl <em>Base Ing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RecipeML.impl.BaseIngImpl
		 * @see RecipeML.impl.RecipeMLPackageImpl#getBaseIng()
		 * @generated
		 */
		EClass BASE_ING = eINSTANCE.getBaseIng();

		/**
		 * The meta object literal for the '{@link RecipeML.impl.AmountImpl <em>Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RecipeML.impl.AmountImpl
		 * @see RecipeML.impl.RecipeMLPackageImpl#getAmount()
		 * @generated
		 */
		EClass AMOUNT = eINSTANCE.getAmount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT__NAME = eINSTANCE.getAmount_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT__QUANTITY = eINSTANCE.getAmount_Quantity();

		/**
		 * The meta object literal for the '<em><b>Amountof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMOUNT__AMOUNTOF = eINSTANCE.getAmount_Amountof();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMOUNT__UNIT = eINSTANCE.getAmount_Unit();

	}

} //RecipeMLPackage
