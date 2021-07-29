/*
* 
*/
package RecipeML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MethodMethodCreatesCompartmentItemSemanticEditPolicy
		extends RecipeML.diagram.edit.policies.RecipeMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MethodMethodCreatesCompartmentItemSemanticEditPolicy() {
		super(RecipeML.diagram.providers.RecipeMLElementTypes.Method_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeML.diagram.providers.RecipeMLElementTypes.ModIng_3001 == req.getElementType()) {
			return getGEFWrapper(new RecipeML.diagram.edit.commands.ModIngCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
