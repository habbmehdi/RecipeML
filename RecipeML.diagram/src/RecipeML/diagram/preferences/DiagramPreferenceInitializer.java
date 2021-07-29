/*
 * 
 */
package RecipeML.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		RecipeML.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		RecipeML.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		RecipeML.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		RecipeML.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		RecipeML.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
