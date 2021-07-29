/*
 * 
 */
package MyPantry.diagram.preferences;

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
		MyPantry.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		MyPantry.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		MyPantry.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		MyPantry.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		MyPantry.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
