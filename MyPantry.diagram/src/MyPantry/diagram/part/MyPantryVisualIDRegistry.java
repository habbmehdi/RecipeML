/*
* 
*/
package MyPantry.diagram.part;

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
public class MyPantryVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "MyPantry.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MyPantry.diagram.edit.parts.PantryEditPart.MODEL_ID.equals(view.getType())) {
				return MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view.getType());
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
				MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance()
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
		if (MyPantry.MyPantryPackage.eINSTANCE.getPantry().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((MyPantry.Pantry) domainElement)) {
			return MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID;
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
		String containerModelID = MyPantry.diagram.part.MyPantryVisualIDRegistry.getModelID(containerView);
		if (!MyPantry.diagram.edit.parts.PantryEditPart.MODEL_ID.equals(containerModelID)
				&& !"MyPantry".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MyPantry.diagram.edit.parts.PantryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
			if (MyPantry.MyPantryPackage.eINSTANCE.getIngredient().isSuperTypeOf(domainElement.eClass())) {
				return MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = MyPantry.diagram.part.MyPantryVisualIDRegistry.getModelID(containerView);
		if (!MyPantry.diagram.edit.parts.PantryEditPart.MODEL_ID.equals(containerModelID)
				&& !"MyPantry".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MyPantry.diagram.edit.parts.PantryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
			if (MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
			if (MyPantry.diagram.edit.parts.IngredientNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MyPantry.diagram.edit.parts.IngredientIngredientMassCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(MyPantry.Pantry element) {
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
		case MyPantry.diagram.edit.parts.IngredientIngredientMassCompartmentEditPart.VISUAL_ID:
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
		case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
			return false;
		case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
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
			return MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return MyPantry.diagram.part.MyPantryVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return MyPantry.diagram.part.MyPantryVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return MyPantry.diagram.part.MyPantryVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return MyPantry.diagram.part.MyPantryVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return MyPantry.diagram.part.MyPantryVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
