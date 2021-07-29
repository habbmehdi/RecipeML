/**
 */
package RecipeML.impl;

import RecipeML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeMLFactoryImpl extends EFactoryImpl implements RecipeMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecipeMLFactory init() {
		try {
			RecipeMLFactory theRecipeMLFactory = (RecipeMLFactory)EPackage.Registry.INSTANCE.getEFactory(RecipeMLPackage.eNS_URI);
			if (theRecipeMLFactory != null) {
				return theRecipeMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecipeMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RecipeMLPackage.RECIPE: return createRecipe();
			case RecipeMLPackage.METHOD: return createMethod();
			case RecipeMLPackage.MOD_ING: return createModIng();
			case RecipeMLPackage.BASE_ING: return createBaseIng();
			case RecipeMLPackage.AMOUNT: return createAmount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Recipe createRecipe() {
		RecipeImpl recipe = new RecipeImpl();
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModIng createModIng() {
		ModIngImpl modIng = new ModIngImpl();
		return modIng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseIng createBaseIng() {
		BaseIngImpl baseIng = new BaseIngImpl();
		return baseIng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Amount createAmount() {
		AmountImpl amount = new AmountImpl();
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipeMLPackage getRecipeMLPackage() {
		return (RecipeMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecipeMLPackage getPackage() {
		return RecipeMLPackage.eINSTANCE;
	}

} //RecipeMLFactoryImpl
