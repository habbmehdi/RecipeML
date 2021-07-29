/*
 * 
 */
package RecipeML.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RecipeMLModelingAssistantProviderOfAmountEditPart
		extends RecipeML.diagram.providers.RecipeMLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RecipeML.diagram.edit.parts.AmountEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RecipeML.diagram.edit.parts.AmountEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RecipeML.diagram.edit.parts.AmountEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RecipeML.diagram.edit.parts.AmountEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RecipeML.diagram.edit.parts.BaseIngEditPart) {
			types.add(RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011);
		}
		if (targetEditPart instanceof RecipeML.diagram.edit.parts.ModIngEditPart) {
			types.add(RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RecipeML.diagram.edit.parts.AmountEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RecipeML.diagram.edit.parts.AmountEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011) {
			types.add(RecipeML.diagram.providers.RecipeMLElementTypes.BaseIng_2001);
			types.add(RecipeML.diagram.providers.RecipeMLElementTypes.ModIng_3001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RecipeML.diagram.edit.parts.AmountEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RecipeML.diagram.edit.parts.AmountEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RecipeML.diagram.providers.RecipeMLElementTypes.IngredientAmount_4010);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RecipeML.diagram.edit.parts.AmountEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RecipeML.diagram.edit.parts.AmountEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RecipeML.diagram.providers.RecipeMLElementTypes.IngredientAmount_4010) {
			types.add(RecipeML.diagram.providers.RecipeMLElementTypes.BaseIng_2001);
			types.add(RecipeML.diagram.providers.RecipeMLElementTypes.ModIng_3001);
		}
		return types;
	}

}
