/*
* 
*/
package MyPantry.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MyPantryNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof MyPantry.diagram.navigator.MyPantryNavigatorItem) {
			MyPantry.diagram.navigator.MyPantryNavigatorItem item = (MyPantry.diagram.navigator.MyPantryNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MyPantry.diagram.part.MyPantryVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
