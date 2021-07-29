/*
* 
*/
package RecipeML.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RecipeMLVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "RecipeML.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID.equals(view.getType())) {
				return RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (RecipeML.RecipeMLPackage.eINSTANCE.getRecipe().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((RecipeML.Recipe) domainElement)) {
			return RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getModelID(containerView);
		if (!RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID.equals(containerModelID)
				&& !"RecipeML".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			if (RecipeML.RecipeMLPackage.eINSTANCE.getBaseIng().isSuperTypeOf(domainElement.eClass())) {
				return RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID;
			}
			if (RecipeML.RecipeMLPackage.eINSTANCE.getMethod().isSuperTypeOf(domainElement.eClass())) {
				return RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID;
			}
			break;
		case RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart.VISUAL_ID:
			if (RecipeML.RecipeMLPackage.eINSTANCE.getModIng().isSuperTypeOf(domainElement.eClass())) {
				return RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID;
			}
			break;
		case RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart.VISUAL_ID:
			if (RecipeML.RecipeMLPackage.eINSTANCE.getAmount().isSuperTypeOf(domainElement.eClass())) {
				return RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getModelID(containerView);
		if (!RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID.equals(containerModelID)
				&& !"RecipeML".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.BaseIngNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.MethodNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.ModIngNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.AmountNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID:
			if (RecipeML.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(RecipeML.Recipe element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart.VISUAL_ID:
		case RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			return false;
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return RecipeML.diagram.part.RecipeMLVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return RecipeML.diagram.part.RecipeMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return RecipeML.diagram.part.RecipeMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return RecipeML.diagram.part.RecipeMLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return RecipeML.diagram.part.RecipeMLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
