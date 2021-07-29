
/*
 * 
 */
package MyPantry.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MyPantryPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(MyPantry.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createIngredient1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createIngredient1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MyPantry.diagram.part.Messages.Ingredient1CreationTool_title,
				MyPantry.diagram.part.Messages.Ingredient1CreationTool_desc,
				Collections.singletonList(MyPantry.diagram.providers.MyPantryElementTypes.Ingredient_2001));
		entry.setId("createIngredient1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyPantry.diagram.providers.MyPantryElementTypes
				.getImageDescriptor(MyPantry.diagram.providers.MyPantryElementTypes.Ingredient_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
