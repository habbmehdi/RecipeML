/*
* 
*/
package RecipeML.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class RecipeMLDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLNodeDescriptor> getSemanticChildren(View view) {
		switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			return getRecipe_1000SemanticChildren(view);
		case RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart.VISUAL_ID:
			return getMethodMethodCreatesCompartment_7001SemanticChildren(view);
		case RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart.VISUAL_ID:
			return getMethodMethodUsesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLNodeDescriptor> getRecipe_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RecipeML.Recipe modelElement = (RecipeML.Recipe) view.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLNodeDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBaseings().iterator(); it.hasNext();) {
			RecipeML.BaseIng childElement = (RecipeML.BaseIng) it.next();
			int visualID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID) {
				result.add(new RecipeML.diagram.part.RecipeMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMethods().iterator(); it.hasNext();) {
			RecipeML.Method childElement = (RecipeML.Method) it.next();
			int visualID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID) {
				result.add(new RecipeML.diagram.part.RecipeMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLNodeDescriptor> getMethodMethodCreatesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		RecipeML.Method modelElement = (RecipeML.Method) containerView.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLNodeDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCreates().iterator(); it.hasNext();) {
			RecipeML.ModIng childElement = (RecipeML.ModIng) it.next();
			int visualID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID) {
				result.add(new RecipeML.diagram.part.RecipeMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLNodeDescriptor> getMethodMethodUsesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		RecipeML.Method modelElement = (RecipeML.Method) containerView.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLNodeDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUses().iterator(); it.hasNext();) {
			RecipeML.Amount childElement = (RecipeML.Amount) it.next();
			int visualID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID) {
				result.add(new RecipeML.diagram.part.RecipeMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getContainedLinks(View view) {
		switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			return getRecipe_1000ContainedLinks(view);
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
			return getBaseIng_2001ContainedLinks(view);
		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2002ContainedLinks(view);
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
			return getModIng_3001ContainedLinks(view);
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			return getAmount_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getIncomingLinks(View view) {
		switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
			return getBaseIng_2001IncomingLinks(view);
		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2002IncomingLinks(view);
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
			return getModIng_3001IncomingLinks(view);
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			return getAmount_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getOutgoingLinks(View view) {
		switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
			return getBaseIng_2001OutgoingLinks(view);
		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2002OutgoingLinks(view);
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
			return getModIng_3001OutgoingLinks(view);
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			return getAmount_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getRecipe_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getBaseIng_2001ContainedLinks(View view) {
		RecipeML.BaseIng modelElement = (RecipeML.BaseIng) view.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Ingredient_Amount_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getMethod_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getModIng_3001ContainedLinks(View view) {
		RecipeML.ModIng modelElement = (RecipeML.ModIng) view.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Ingredient_Amount_4010(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getAmount_3002ContainedLinks(View view) {
		RecipeML.Amount modelElement = (RecipeML.Amount) view.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Amount_Amountof_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getBaseIng_2001IncomingLinks(View view) {
		RecipeML.BaseIng modelElement = (RecipeML.BaseIng) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Amount_Amountof_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getMethod_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getModIng_3001IncomingLinks(View view) {
		RecipeML.ModIng modelElement = (RecipeML.ModIng) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Amount_Amountof_4011(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getAmount_3002IncomingLinks(View view) {
		RecipeML.Amount modelElement = (RecipeML.Amount) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Ingredient_Amount_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getBaseIng_2001OutgoingLinks(View view) {
		RecipeML.BaseIng modelElement = (RecipeML.BaseIng) view.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Ingredient_Amount_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getMethod_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getModIng_3001OutgoingLinks(View view) {
		RecipeML.ModIng modelElement = (RecipeML.ModIng) view.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Ingredient_Amount_4010(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getAmount_3002OutgoingLinks(View view) {
		RecipeML.Amount modelElement = (RecipeML.Amount) view.getElement();
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Amount_Amountof_4011(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<RecipeML.diagram.part.RecipeMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Ingredient_Amount_4010(
			RecipeML.Amount target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RecipeML.RecipeMLPackage.eINSTANCE.getIngredient_Amount()) {
				result.add(new RecipeML.diagram.part.RecipeMLLinkDescriptor(setting.getEObject(), target,
						RecipeML.diagram.providers.RecipeMLElementTypes.IngredientAmount_4010,
						RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<RecipeML.diagram.part.RecipeMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Amount_Amountof_4011(
			RecipeML.Ingredient target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RecipeML.RecipeMLPackage.eINSTANCE.getAmount_Amountof()) {
				result.add(new RecipeML.diagram.part.RecipeMLLinkDescriptor(setting.getEObject(), target,
						RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011,
						RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<RecipeML.diagram.part.RecipeMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Ingredient_Amount_4010(
			RecipeML.Ingredient source) {
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		for (Iterator<?> destinations = source.getAmount().iterator(); destinations.hasNext();) {
			RecipeML.Amount destination = (RecipeML.Amount) destinations.next();
			result.add(new RecipeML.diagram.part.RecipeMLLinkDescriptor(source, destination,
					RecipeML.diagram.providers.RecipeMLElementTypes.IngredientAmount_4010,
					RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<RecipeML.diagram.part.RecipeMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Amount_Amountof_4011(
			RecipeML.Amount source) {
		LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor> result = new LinkedList<RecipeML.diagram.part.RecipeMLLinkDescriptor>();
		RecipeML.Ingredient destination = source.getAmountof();
		if (destination == null) {
			return result;
		}
		result.add(new RecipeML.diagram.part.RecipeMLLinkDescriptor(source, destination,
				RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011,
				RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<RecipeML.diagram.part.RecipeMLNodeDescriptor> getSemanticChildren(View view) {
			return RecipeMLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getContainedLinks(View view) {
			return RecipeMLDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getIncomingLinks(View view) {
			return RecipeMLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<RecipeML.diagram.part.RecipeMLLinkDescriptor> getOutgoingLinks(View view) {
			return RecipeMLDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
