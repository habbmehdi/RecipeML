/*
 * 
 */
package RecipeML.diagram.providers;

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
		ElementInitializers cached = RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
