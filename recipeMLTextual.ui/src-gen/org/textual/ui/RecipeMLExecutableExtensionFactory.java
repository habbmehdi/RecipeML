/*
 * generated by Xtext 2.23.0
 */
package org.textual.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import recipeMLTextual.ui.internal.RecipeMLTextualActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RecipeMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(RecipeMLTextualActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		RecipeMLTextualActivator activator = RecipeMLTextualActivator.getInstance();
		return activator != null ? activator.getInjector(RecipeMLTextualActivator.ORG_TEXTUAL_RECIPEML) : null;
	}

}
