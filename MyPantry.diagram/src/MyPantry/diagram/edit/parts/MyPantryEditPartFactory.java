/*
 * 
 */
package MyPantry.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MyPantryEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view)) {

			case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
				return new MyPantry.diagram.edit.parts.PantryEditPart(view);

			case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
				return new MyPantry.diagram.edit.parts.IngredientEditPart(view);

			case MyPantry.diagram.edit.parts.IngredientNameEditPart.VISUAL_ID:
				return new MyPantry.diagram.edit.parts.IngredientNameEditPart(view);

			case MyPantry.diagram.edit.parts.IngredientIngredientMassCompartmentEditPart.VISUAL_ID:
				return new MyPantry.diagram.edit.parts.IngredientIngredientMassCompartmentEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
