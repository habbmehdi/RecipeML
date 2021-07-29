/*
* 
*/
package MyPantry.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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
public class MyPantryNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MyPantry.diagram.navigator.MyPantryNavigatorItem
				&& !isOwnView(((MyPantry.diagram.navigator.MyPantryNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MyPantry.diagram.navigator.MyPantryNavigatorGroup) {
			MyPantry.diagram.navigator.MyPantryNavigatorGroup group = (MyPantry.diagram.navigator.MyPantryNavigatorGroup) element;
			return MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MyPantry.diagram.navigator.MyPantryNavigatorItem) {
			MyPantry.diagram.navigator.MyPantryNavigatorItem navigatorItem = (MyPantry.diagram.navigator.MyPantryNavigatorItem) element;
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
		switch (MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view)) {
		case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?org.example.mypantry?Pantry", //$NON-NLS-1$
					MyPantry.diagram.providers.MyPantryElementTypes.Pantry_1000);
		case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?org.example.mypantry?Ingredient", //$NON-NLS-1$
					MyPantry.diagram.providers.MyPantryElementTypes.Ingredient_2001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MyPantry.diagram.providers.MyPantryElementTypes.isKnownElementType(elementType)) {
			image = MyPantry.diagram.providers.MyPantryElementTypes.getImage(elementType);
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
		if (element instanceof MyPantry.diagram.navigator.MyPantryNavigatorGroup) {
			MyPantry.diagram.navigator.MyPantryNavigatorGroup group = (MyPantry.diagram.navigator.MyPantryNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MyPantry.diagram.navigator.MyPantryNavigatorItem) {
			MyPantry.diagram.navigator.MyPantryNavigatorItem navigatorItem = (MyPantry.diagram.navigator.MyPantryNavigatorItem) element;
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
		switch (MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(view)) {
		case MyPantry.diagram.edit.parts.PantryEditPart.VISUAL_ID:
			return getPantry_1000Text(view);
		case MyPantry.diagram.edit.parts.IngredientEditPart.VISUAL_ID:
			return getIngredient_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPantry_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getIngredient_2001Text(View view) {
		IParser parser = MyPantry.diagram.providers.MyPantryParserProvider.getParser(
				MyPantry.diagram.providers.MyPantryElementTypes.Ingredient_2001,
				view.getElement() != null ? view.getElement() : view, MyPantry.diagram.part.MyPantryVisualIDRegistry
						.getType(MyPantry.diagram.edit.parts.IngredientNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return MyPantry.diagram.edit.parts.PantryEditPart.MODEL_ID
				.equals(MyPantry.diagram.part.MyPantryVisualIDRegistry.getModelID(view));
	}

}
