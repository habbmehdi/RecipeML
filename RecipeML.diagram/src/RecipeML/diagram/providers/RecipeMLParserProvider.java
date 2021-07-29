/*
 * 
 */
package RecipeML.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RecipeMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser baseIngName_5001Parser;

	/**
	* @generated
	*/
	private IParser getBaseIngName_5001Parser() {
		if (baseIngName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipeML.RecipeMLPackage.eINSTANCE.getIngredient_Name() };
			RecipeML.diagram.parsers.MessageFormatParser parser = new RecipeML.diagram.parsers.MessageFormatParser(
					features);
			baseIngName_5001Parser = parser;
		}
		return baseIngName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser methodName_5003Parser;

	/**
	* @generated
	*/
	private IParser getMethodName_5003Parser() {
		if (methodName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipeML.RecipeMLPackage.eINSTANCE.getMethod_Name() };
			RecipeML.diagram.parsers.MessageFormatParser parser = new RecipeML.diagram.parsers.MessageFormatParser(
					features);
			methodName_5003Parser = parser;
		}
		return methodName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser modIngName_5002Parser;

	/**
	* @generated
	*/
	private IParser getModIngName_5002Parser() {
		if (modIngName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipeML.RecipeMLPackage.eINSTANCE.getIngredient_Name() };
			RecipeML.diagram.parsers.MessageFormatParser parser = new RecipeML.diagram.parsers.MessageFormatParser(
					features);
			modIngName_5002Parser = parser;
		}
		return modIngName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser amountName_5004Parser;

	/**
	* @generated
	*/
	private IParser getAmountName_5004Parser() {
		if (amountName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipeML.RecipeMLPackage.eINSTANCE.getAmount_Name() };
			RecipeML.diagram.parsers.MessageFormatParser parser = new RecipeML.diagram.parsers.MessageFormatParser(
					features);
			amountName_5004Parser = parser;
		}
		return amountName_5004Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RecipeML.diagram.edit.parts.BaseIngNameEditPart.VISUAL_ID:
			return getBaseIngName_5001Parser();
		case RecipeML.diagram.edit.parts.MethodNameEditPart.VISUAL_ID:
			return getMethodName_5003Parser();
		case RecipeML.diagram.edit.parts.ModIngNameEditPart.VISUAL_ID:
			return getModIngName_5002Parser();
		case RecipeML.diagram.edit.parts.AmountNameEditPart.VISUAL_ID:
			return getAmountName_5004Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RecipeML.diagram.providers.RecipeMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
