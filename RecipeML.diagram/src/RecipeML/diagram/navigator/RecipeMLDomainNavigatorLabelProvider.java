/*
* 
*/
package RecipeML.diagram.navigator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class RecipeMLDomainNavigatorLabelProvider implements ICommonLabelProvider {

	/**
	* @generated
	*/
	private AdapterFactoryLabelProvider myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof RecipeML.diagram.navigator.RecipeMLDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider
					.getImage(((RecipeML.diagram.navigator.RecipeMLDomainNavigatorItem) element).getEObject());
		}
		return null;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof RecipeML.diagram.navigator.RecipeMLDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider
					.getText(((RecipeML.diagram.navigator.RecipeMLDomainNavigatorItem) element).getEObject());
		}
		return null;
	}

	/**
	* @generated
	*/
	public void addListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.addListener(listener);
	}

	/**
	* @generated
	*/
	public void dispose() {
		myAdapterFactoryLabelProvider.dispose();
	}

	/**
	* @generated
	*/
	public boolean isLabelProperty(Object element, String property) {
		return myAdapterFactoryLabelProvider.isLabelProperty(element, property);
	}

	/**
	* @generated
	*/
	public void removeListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.removeListener(listener);
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

}
