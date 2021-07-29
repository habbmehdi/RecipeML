/*
 * 
 */
package RecipeML.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class RecipeMLElementTypes {

	/**
	* @generated
	*/
	private RecipeMLElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Recipe_1000 = getElementType("RecipeML.diagram.Recipe_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BaseIng_2001 = getElementType("RecipeML.diagram.BaseIng_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Method_2002 = getElementType("RecipeML.diagram.Method_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ModIng_3001 = getElementType("RecipeML.diagram.ModIng_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Amount_3002 = getElementType("RecipeML.diagram.Amount_3002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IngredientAmount_4010 = getElementType("RecipeML.diagram.IngredientAmount_4010"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType AmountAmountof_4011 = getElementType("RecipeML.diagram.AmountAmountof_4011"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Recipe_1000, RecipeML.RecipeMLPackage.eINSTANCE.getRecipe());

			elements.put(BaseIng_2001, RecipeML.RecipeMLPackage.eINSTANCE.getBaseIng());

			elements.put(Method_2002, RecipeML.RecipeMLPackage.eINSTANCE.getMethod());

			elements.put(ModIng_3001, RecipeML.RecipeMLPackage.eINSTANCE.getModIng());

			elements.put(Amount_3002, RecipeML.RecipeMLPackage.eINSTANCE.getAmount());

			elements.put(IngredientAmount_4010, RecipeML.RecipeMLPackage.eINSTANCE.getIngredient_Amount());

			elements.put(AmountAmountof_4011, RecipeML.RecipeMLPackage.eINSTANCE.getAmount_Amountof());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Recipe_1000);
			KNOWN_ELEMENT_TYPES.add(BaseIng_2001);
			KNOWN_ELEMENT_TYPES.add(Method_2002);
			KNOWN_ELEMENT_TYPES.add(ModIng_3001);
			KNOWN_ELEMENT_TYPES.add(Amount_3002);
			KNOWN_ELEMENT_TYPES.add(IngredientAmount_4010);
			KNOWN_ELEMENT_TYPES.add(AmountAmountof_4011);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			return Recipe_1000;
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
			return BaseIng_2001;
		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return Method_2002;
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
			return ModIng_3001;
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			return Amount_3002;
		case RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID:
			return IngredientAmount_4010;
		case RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID:
			return AmountAmountof_4011;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return RecipeML.diagram.providers.RecipeMLElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return RecipeML.diagram.providers.RecipeMLElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return RecipeML.diagram.providers.RecipeMLElementTypes.getElement(elementTypeAdapter);
		}
	};

}
