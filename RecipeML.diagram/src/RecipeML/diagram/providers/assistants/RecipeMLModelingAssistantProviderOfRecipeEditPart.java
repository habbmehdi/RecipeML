/*
 * 
 */
package RecipeML.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RecipeMLModelingAssistantProviderOfRecipeEditPart
		extends RecipeML.diagram.providers.RecipeMLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RecipeML.diagram.providers.RecipeMLElementTypes.BaseIng_2001);
		types.add(RecipeML.diagram.providers.RecipeMLElementTypes.Method_2002);
		return types;
	}

}
