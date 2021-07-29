/*
 * 
 */
package MyPantry.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MyPantryModelingAssistantProviderOfPantryEditPart
		extends MyPantry.diagram.providers.MyPantryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MyPantry.diagram.providers.MyPantryElementTypes.Ingredient_2001);
		return types;
	}

}
