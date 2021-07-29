/*
 * 
 */
package RecipeML.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class RecipeMLEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {

			case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.RecipeEditPart(view);

			case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.BaseIngEditPart(view);

			case RecipeML.diagram.edit.parts.BaseIngNameEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.BaseIngNameEditPart(view);

			case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.MethodEditPart(view);

			case RecipeML.diagram.edit.parts.MethodNameEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.MethodNameEditPart(view);

			case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.ModIngEditPart(view);

			case RecipeML.diagram.edit.parts.ModIngNameEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.ModIngNameEditPart(view);

			case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.AmountEditPart(view);

			case RecipeML.diagram.edit.parts.AmountNameEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.AmountNameEditPart(view);

			case RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart(view);

			case RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart(view);

			case RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.IngredientAmountEditPart(view);

			case RecipeML.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.WrappingLabelEditPart(view);

			case RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.AmountAmountofEditPart(view);

			case RecipeML.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new RecipeML.diagram.edit.parts.WrappingLabel2EditPart(view);

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
