/*
 * 
 */
package MyPantry.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
