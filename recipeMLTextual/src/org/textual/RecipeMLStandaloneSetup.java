/*
 * generated by Xtext 2.23.0
 */
package org.textual;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class RecipeMLStandaloneSetup extends RecipeMLStandaloneSetupGenerated {

	public static void doSetup() {
		new RecipeMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}