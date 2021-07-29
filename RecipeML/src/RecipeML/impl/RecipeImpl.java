/**
 */
package RecipeML.impl;

import RecipeML.BaseIng;
import RecipeML.Method;
import RecipeML.Recipe;
import RecipeML.RecipeMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RecipeML.impl.RecipeImpl#getBaseings <em>Baseings</em>}</li>
 *   <li>{@link RecipeML.impl.RecipeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link RecipeML.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link RecipeML.impl.RecipeImpl#getServes <em>Serves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeImpl extends EObjectImpl implements Recipe {
	/**
	 * The cached value of the '{@link #getBaseings() <em>Baseings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseings()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseIng> baseings;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServes() <em>Serves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServes()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServes() <em>Serves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServes()
	 * @generated
	 * @ordered
	 */
	protected int serves = SERVES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipeMLPackage.Literals.RECIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseIng> getBaseings() {
		if (baseings == null) {
			baseings = new EObjectContainmentEList<BaseIng>(BaseIng.class, this, RecipeMLPackage.RECIPE__BASEINGS);
		}
		return baseings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, RecipeMLPackage.RECIPE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeMLPackage.RECIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServes() {
		return serves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServes(int newServes) {
		int oldServes = serves;
		serves = newServes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeMLPackage.RECIPE__SERVES, oldServes, serves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipeMLPackage.RECIPE__BASEINGS:
				return ((InternalEList<?>)getBaseings()).basicRemove(otherEnd, msgs);
			case RecipeMLPackage.RECIPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecipeMLPackage.RECIPE__BASEINGS:
				return getBaseings();
			case RecipeMLPackage.RECIPE__METHODS:
				return getMethods();
			case RecipeMLPackage.RECIPE__NAME:
				return getName();
			case RecipeMLPackage.RECIPE__SERVES:
				return getServes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecipeMLPackage.RECIPE__BASEINGS:
				getBaseings().clear();
				getBaseings().addAll((Collection<? extends BaseIng>)newValue);
				return;
			case RecipeMLPackage.RECIPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case RecipeMLPackage.RECIPE__NAME:
				setName((String)newValue);
				return;
			case RecipeMLPackage.RECIPE__SERVES:
				setServes((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecipeMLPackage.RECIPE__BASEINGS:
				getBaseings().clear();
				return;
			case RecipeMLPackage.RECIPE__METHODS:
				getMethods().clear();
				return;
			case RecipeMLPackage.RECIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipeMLPackage.RECIPE__SERVES:
				setServes(SERVES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecipeMLPackage.RECIPE__BASEINGS:
				return baseings != null && !baseings.isEmpty();
			case RecipeMLPackage.RECIPE__METHODS:
				return methods != null && !methods.isEmpty();
			case RecipeMLPackage.RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipeMLPackage.RECIPE__SERVES:
				return serves != SERVES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", serves: ");
		result.append(serves);
		result.append(')');
		return result.toString();
	}

} //RecipeImpl
