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
public class AmountAmountItemSemanticEditPolicy
		extends RecipeML.diagram.edit.policies.RecipeMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AmountAmountItemSemanticEditPolicy() {
		super(RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmount_4009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
