/*
* 
*/
package RecipeML.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class RecipeMLNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public RecipeMLNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<RecipeML.diagram.navigator.RecipeMLNavigatorItem> result = new ArrayList<RecipeML.diagram.navigator.RecipeMLNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof RecipeML.diagram.navigator.RecipeMLNavigatorGroup) {
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup group = (RecipeML.diagram.navigator.RecipeMLNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof RecipeML.diagram.navigator.RecipeMLNavigatorItem) {
			RecipeML.diagram.navigator.RecipeMLNavigatorItem navigatorItem = (RecipeML.diagram.navigator.RecipeMLNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (RecipeML.diagram.part.RecipeMLVisualIDRegistry.getVisualID(view)) {

		case RecipeML.diagram.edit.parts.RecipeEditPart.VISUAL_ID: {
			LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem> result = new LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup links = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_Recipe_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), RecipeML.diagram.part.RecipeMLVisualIDRegistry
					.getType(RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), RecipeML.diagram.part.RecipeMLVisualIDRegistry
					.getType(RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID: {
			LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem> result = new LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem>();
			Node sv = (Node) view;
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup outgoinglinks = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_BaseIng_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup incominglinks = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_BaseIng_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RecipeML.diagram.edit.parts.MethodEditPart.VISUAL_ID: {
			LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem> result = new LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), RecipeML.diagram.part.RecipeMLVisualIDRegistry
					.getType(RecipeML.diagram.edit.parts.MethodMethodCreatesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, RecipeML.diagram.part.RecipeMLVisualIDRegistry
					.getType(RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), RecipeML.diagram.part.RecipeMLVisualIDRegistry
					.getType(RecipeML.diagram.edit.parts.MethodMethodUsesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, RecipeML.diagram.part.RecipeMLVisualIDRegistry
					.getType(RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID: {
			LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem> result = new LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem>();
			Node sv = (Node) view;
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup outgoinglinks = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_ModIng_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup incominglinks = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_ModIng_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID: {
			LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem> result = new LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem>();
			Node sv = (Node) view;
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup incominglinks = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_Amount_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup outgoinglinks = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_Amount_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RecipeML.diagram.edit.parts.IngredientAmountEditPart.VISUAL_ID: {
			LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem> result = new LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup target = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_IngredientAmount_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup source = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_IngredientAmount_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RecipeML.diagram.edit.parts.AmountAmountofEditPart.VISUAL_ID: {
			LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem> result = new LinkedList<RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup target = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_AmountAmountof_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RecipeML.diagram.navigator.RecipeMLNavigatorGroup source = new RecipeML.diagram.navigator.RecipeMLNavigatorGroup(
					RecipeML.diagram.part.Messages.NavigatorGroupName_AmountAmountof_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.BaseIngEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.ModIngEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RecipeML.diagram.part.RecipeMLVisualIDRegistry
							.getType(RecipeML.diagram.edit.parts.AmountEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return RecipeML.diagram.edit.parts.RecipeEditPart.MODEL_ID
				.equals(RecipeML.diagram.part.RecipeMLVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<RecipeML.diagram.navigator.RecipeMLNavigatorItem> createNavigatorItems(Collection<View> views,
			Object parent, boolean isLeafs) {
		ArrayList<RecipeML.diagram.navigator.RecipeMLNavigatorItem> result = new ArrayList<RecipeML.diagram.navigator.RecipeMLNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new RecipeML.diagram.navigator.RecipeMLNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<RecipeML.diagram.navigator.RecipeMLNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem) {
			RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem abstractNavigatorItem = (RecipeML.diagram.navigator.RecipeMLAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
