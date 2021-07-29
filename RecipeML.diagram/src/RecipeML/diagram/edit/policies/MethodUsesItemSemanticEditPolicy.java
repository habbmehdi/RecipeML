/*
* 
*/
package RecipeML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class MethodUsesItemSemanticEditPolicy
		extends RecipeML.diagram.edit.policies.RecipeMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MethodUsesItemSemanticEditPolicy() {
		super(RecipeML.diagram.providers.RecipeMLElementTypes.MethodUses_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
