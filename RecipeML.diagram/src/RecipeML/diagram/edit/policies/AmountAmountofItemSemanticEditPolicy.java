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
public class AmountAmountofItemSemanticEditPolicy
		extends RecipeML.diagram.edit.policies.RecipeMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AmountAmountofItemSemanticEditPolicy() {
		super(RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
