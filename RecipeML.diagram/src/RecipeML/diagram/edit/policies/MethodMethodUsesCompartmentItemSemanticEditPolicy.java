/*
* 
*/
package RecipeML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MethodMethodUsesCompartmentItemSemanticEditPolicy
		extends RecipeML.diagram.edit.policies.RecipeMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MethodMethodUsesCompartmentItemSemanticEditPolicy() {
		super(RecipeML.diagram.providers.RecipeMLElementTypes.Method_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeML.diagram.providers.RecipeMLElementTypes.Amount_3002 == req.getElementType()) {
			return getGEFWrapper(new RecipeML.diagram.edit.commands.AmountCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
