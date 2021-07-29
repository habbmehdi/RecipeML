/**
 */
package MyPantry.tests;

import MyPantry.Ingredient;
import MyPantry.MyPantryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IngredientTest extends TestCase {

	/**
	 * The fixture for this Ingredient test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ingredient fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IngredientTest.class);
	}

	/**
	 * Constructs a new Ingredient test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ingredient test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ingredient fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ingredient test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ingredient getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyPantryFactory.eINSTANCE.createIngredient());
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

} //IngredientTest
