/*
 * generated by Xtext 2.23.0
 */
package org.textual.serializer;

import RecipeML.Amount;
import RecipeML.BaseIng;
import RecipeML.Method;
import RecipeML.ModIng;
import RecipeML.Recipe;
import RecipeML.RecipeMLPackage;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.textual.services.RecipeMLGrammarAccess;

@SuppressWarnings("all")
public class RecipeMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RecipeMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RecipeMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RecipeMLPackage.AMOUNT:
				sequence_Amount(context, (Amount) semanticObject); 
				return; 
			case RecipeMLPackage.BASE_ING:
				sequence_BaseIng(context, (BaseIng) semanticObject); 
				return; 
			case RecipeMLPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case RecipeMLPackage.MOD_ING:
				sequence_ModIng(context, (ModIng) semanticObject); 
				return; 
			case RecipeMLPackage.RECIPE:
				sequence_Recipe(context, (Recipe) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Amount returns Amount
	 *
	 * Constraint:
	 *     (quantity=EFloat? unit=EString? amountof=[Ingredient|EString])
	 */
	protected void sequence_Amount(ISerializationContext context, Amount semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ingredient returns BaseIng
	 *     BaseIng returns BaseIng
	 *
	 * Constraint:
	 *     (name=EString count=EFloat? unit=EString?)
	 */
	protected void sequence_BaseIng(ISerializationContext context, BaseIng semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (step=EInt? name=EString (uses+=Amount uses+=Amount*)? time=EInt? (creates+=ModIng creates+=ModIng*)?)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ingredient returns ModIng
	 *     ModIng returns ModIng
	 *
	 * Constraint:
	 *     (name=EString count=EFloat? unit=EString?)
	 */
	protected void sequence_ModIng(ISerializationContext context, ModIng semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recipe returns Recipe
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         serves=EInt? 
	 *         baseings+=BaseIng 
	 *         baseings+=BaseIng* 
	 *         methods+=Method 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_Recipe(ISerializationContext context, Recipe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}