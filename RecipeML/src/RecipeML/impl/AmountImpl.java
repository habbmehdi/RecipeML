/**
 */
package RecipeML.impl;

import RecipeML.Amount;
import RecipeML.BaseIng;
import RecipeML.Ingredient;
import RecipeML.RecipeMLPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RecipeML.impl.AmountImpl#getName <em>Name</em>}</li>
 *   <li>{@link RecipeML.impl.AmountImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link RecipeML.impl.AmountImpl#getAmountof <em>Amountof</em>}</li>
 *   <li>{@link RecipeML.impl.AmountImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmountImpl extends EObjectImpl implements Amount {
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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected float quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAmountof() <em>Amountof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountof()
	 * @generated
	 * @ordered
	 */
	protected Ingredient amountof;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipeMLPackage.Literals.AMOUNT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeMLPackage.AMOUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(float newQuantity) {
		float oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeMLPackage.AMOUNT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingredient getAmountof() {
		if (amountof != null && amountof.eIsProxy()) {
			InternalEObject oldAmountof = (InternalEObject)amountof;
			amountof = (Ingredient)eResolveProxy(oldAmountof);
			if (amountof != oldAmountof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipeMLPackage.AMOUNT__AMOUNTOF, oldAmountof, amountof));
			}
		}
		return amountof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient basicGetAmountof() {
		return amountof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountof(Ingredient newAmountof, NotificationChain msgs) {
		Ingredient oldAmountof = amountof;
		amountof = newAmountof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecipeMLPackage.AMOUNT__AMOUNTOF, oldAmountof, newAmountof);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountof(Ingredient newAmountof) {
		if (newAmountof != amountof) {
			NotificationChain msgs = null;
			if (amountof != null)
				msgs = ((InternalEObject)amountof).eInverseRemove(this, RecipeMLPackage.INGREDIENT__AMOUNT, Ingredient.class, msgs);
			if (newAmountof != null)
				msgs = ((InternalEObject)newAmountof).eInverseAdd(this, RecipeMLPackage.INGREDIENT__AMOUNT, Ingredient.class, msgs);
			msgs = basicSetAmountof(newAmountof, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeMLPackage.AMOUNT__AMOUNTOF, newAmountof, newAmountof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeMLPackage.AMOUNT__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipeMLPackage.AMOUNT__AMOUNTOF:
				if (amountof != null)
					msgs = ((InternalEObject)amountof).eInverseRemove(this, RecipeMLPackage.INGREDIENT__AMOUNT, Ingredient.class, msgs);
				return basicSetAmountof((Ingredient)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecipeMLPackage.AMOUNT__AMOUNTOF:
				return basicSetAmountof(null, msgs);
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
			case RecipeMLPackage.AMOUNT__NAME:
				return getName();
			case RecipeMLPackage.AMOUNT__QUANTITY:
				return getQuantity();
			case RecipeMLPackage.AMOUNT__AMOUNTOF:
				if (resolve) return getAmountof();
				return basicGetAmountof();
			case RecipeMLPackage.AMOUNT__UNIT:
				return getUnit();
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
			case RecipeMLPackage.AMOUNT__NAME:
				setName((String)newValue);
				return;
			case RecipeMLPackage.AMOUNT__QUANTITY:
				setQuantity((Float)newValue);
				return;
			case RecipeMLPackage.AMOUNT__AMOUNTOF:
				setAmountof((Ingredient)newValue);
				return;
			case RecipeMLPackage.AMOUNT__UNIT:
				setUnit((String)newValue);
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
			case RecipeMLPackage.AMOUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RecipeMLPackage.AMOUNT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case RecipeMLPackage.AMOUNT__AMOUNTOF:
				setAmountof((Ingredient)null);
				return;
			case RecipeMLPackage.AMOUNT__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case RecipeMLPackage.AMOUNT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RecipeMLPackage.AMOUNT__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case RecipeMLPackage.AMOUNT__AMOUNTOF:
				return amountof != null;
			case RecipeMLPackage.AMOUNT__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //AmountImpl
