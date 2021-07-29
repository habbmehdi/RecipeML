/**
 */
package RecipeML.tests;

import RecipeML.BaseIng;
import RecipeML.RecipeMLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Base Ing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseIngTest extends IngredientTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaseIngTest.class);
	}

	/**
	 * Constructs a new Base Ing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseIngTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Base Ing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BaseIng getFixture() {
		return (BaseIng)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RecipeMLFactory.eINSTANCE.createBaseIng());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BaseIngTest
