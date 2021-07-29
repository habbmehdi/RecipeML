/*
* 
*/
package MyPantry.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MyPantryDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<MyPantry.diagram.part.MyPantryNodeDescriptor> getSemanticChildren(View view) {
		switch (MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view)) {
		case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
			return getPantry_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyPantry.diagram.part.MyPantryNodeDescriptor> getPantry_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MyPantry.Pantry modelElement = (MyPantry.Pantry) view.getElement();
		LinkedList<MyPantry.diagram.part.MyPantryNodeDescriptor> result = new LinkedList<MyPantry.diagram.part.MyPantryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIngredient().iterator(); it.hasNext();) {
			MyPantry.Ingredient childElement = (MyPantry.Ingredient) it.next();
			int visualID = MyPantry.diagram.part.MyPantryVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID) {
				result.add(new MyPantry.diagram.part.MyPantryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MyPantry.diagram.part.MyPantryLinkDescriptor> getContainedLinks(View view) {
		switch (MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view)) {
		case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
			return getPantry_1000ContainedLinks(view);
		case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
			return getIngredient_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyPantry.diagram.part.MyPantryLinkDescriptor> getIncomingLinks(View view) {
		switch (MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view)) {
		case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
			return getIngredient_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyPantry.diagram.part.MyPantryLinkDescriptor> getOutgoingLinks(View view) {
		switch (MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view)) {
		case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
			return getIngredient_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyPantry.diagram.part.MyPantryLinkDescriptor> getPantry_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyPantry.diagram.part.MyPantryLinkDescriptor> getIngredient_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyPantry.diagram.part.MyPantryLinkDescriptor> getIngredient_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyPantry.diagram.part.MyPantryLinkDescriptor> getIngredient_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MyPantry.diagram.part.MyPantryNodeDescriptor> getSemanticChildren(View view) {
			return MyPantryDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MyPantry.diagram.part.MyPantryLinkDescriptor> getContainedLinks(View view) {
			return MyPantryDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MyPantry.diagram.part.MyPantryLinkDescriptor> getIncomingLinks(View view) {
			return MyPantryDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MyPantry.diagram.part.MyPantryLinkDescriptor> getOutgoingLinks(View view) {
			return MyPantryDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
