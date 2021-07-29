/*
* 
*/
package RecipeML.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class RecipeMLNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RecipeML.diagram.navigator.RecipeMLNavigatorItem
				&& !isOwnView(((RecipeML.diagram.navigator.RecipeMLNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof RecipeML.diagram.navigator.RecipeMLNavigatorGroup) {
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup group = (RecipeML.diagram.navigator.RecipeMLNavigatorGroup) element;
			return RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof RecipeML.diagram.navigator.RecipeMLNavigatorItem) {
			RecipeML.diagram.navigator.RecipeMLNavigatorItem navigatorItem = (RecipeML.diagram.navigator.RecipeMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?org.project.recipeml?Recipe", //$NON-NLS-1$
					RecipeML.diagram.providers.RecipeMLElementTypes.Recipe_1000);
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?org.project.recipeml?BaseIng", //$NON-NLS-1$
					RecipeML.diagram.providers.RecipeMLElementTypes.BaseIng_2001);
		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?org.project.recipeml?Method", //$NON-NLS-1$
					RecipeML.diagram.providers.RecipeMLElementTypes.Method_2002);
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
			return getImage("Navigator?Node?org.project.recipeml?ModIng", //$NON-NLS-1$
					RecipeML.diagram.providers.RecipeMLElementTypes.ModIng_3001);
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			return getImage("Navigator?Node?org.project.recipeml?Amount", //$NON-NLS-1$
					RecipeML.diagram.providers.RecipeMLElementTypes.Amount_3002);
		case RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID:
			return getImage("Navigator?Link?org.project.recipeml?Ingredient?amount", //$NON-NLS-1$
					RecipeML.diagram.providers.RecipeMLElementTypes.IngredientAmount_4010);
		case RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID:
			return getImage("Navigator?Link?org.project.recipeml?Amount?amountof", //$NON-NLS-1$
					RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RecipeML.diagram.providers.RecipeMLElementTypes.isKnownElementType(elementType)) {
			image = RecipeML.diagram.providers.RecipeMLElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof RecipeML.diagram.navigator.RecipeMLNavigatorGroup) {
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup group = (RecipeML.diagram.navigator.RecipeMLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RecipeML.diagram.navigator.RecipeMLNavigatorItem) {
			RecipeML.diagram.navigator.RecipeMLNavigatorItem navigatorItem = (RecipeML.diagram.navigator.RecipeMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {
		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID:
			return getRecipe_1000Text(view);
		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID:
			return getBaseIng_2001Text(view);
		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_2002Text(view);
		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID:
			return getModIng_3001Text(view);
		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID:
			return getAmount_3002Text(view);
		case RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID:
			return getIngredientAmount_4010Text(view);
		case RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID:
			return getAmountAmountof_4011Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getRecipe_1000Text(View view) {
		RecipeML.Recipe domainModelElement = (RecipeML.Recipe) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBaseIng_2001Text(View view) {
		IParser parser = RecipeML.diagram.providers.RecipeMLParserProvider.getParser(
				RecipeML.diagram.providers.RecipeMLElementTypes.BaseIng_2001,
				view.getElement() != null ? view.getElement() : view, RecipeML.diagram.part.RecipeMLVisualIDRegistry
						.getType(RecipeML.diagram.edit.parts.BaseIngNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethod_2002Text(View view) {
		IParser parser = RecipeML.diagram.providers.RecipeMLParserProvider.getParser(
				RecipeML.diagram.providers.RecipeMLElementTypes.Method_2002,
				view.getElement() != null ? view.getElement() : view, RecipeML.diagram.part.RecipeMLVisualIDRegistry
						.getType(RecipeML.diagram.edit.parts.MethodNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModIng_3001Text(View view) {
		IParser parser = RecipeML.diagram.providers.RecipeMLParserProvider.getParser(
				RecipeML.diagram.providers.RecipeMLElementTypes.ModIng_3001,
				view.getElement() != null ? view.getElement() : view, RecipeML.diagram.part.RecipeMLVisualIDRegistry
						.getType(RecipeML.diagram.edit.parts.ModIngNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAmount_3002Text(View view) {
		IParser parser = RecipeML.diagram.providers.RecipeMLParserProvider.getParser(
				RecipeML.diagram.providers.RecipeMLElementTypes.Amount_3002,
				view.getElement() != null ? view.getElement() : view, RecipeML.diagram.part.RecipeMLVisualIDRegistry
						.getType(RecipeML.diagram.edit.parts.AmountNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIngredientAmount_4010Text(View view) {
		IParser parser = RecipeML.diagram.providers.RecipeMLParserProvider.getParser(
				RecipeML.diagram.providers.RecipeMLElementTypes.IngredientAmount_4010,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAmountAmountof_4011Text(View view) {
		IParser parser = RecipeML.diagram.providers.RecipeMLParserProvider.getParser(
				RecipeML.diagram.providers.RecipeMLElementTypes.AmountAmountof_4011,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID
				.equals(RecipeML.diagram.part.RecipeMLVisualIDRegistry.getModelID(view));
	}

}
