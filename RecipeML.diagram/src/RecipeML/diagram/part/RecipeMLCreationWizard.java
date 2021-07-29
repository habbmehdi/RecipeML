/*
 * 
 */
package RecipeML.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class RecipeMLCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected RecipeML.diagram.part.RecipeMLCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected RecipeML.diagram.part.RecipeMLCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(RecipeML.diagram.part.Messages.RecipeMLCreationWizardTitle);
		setDefaultPageImageDescriptor(RecipeML.diagram.part.RecipeMLDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewRecipeMLWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new RecipeML.diagram.part.RecipeMLCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"recipeml_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(RecipeML.diagram.part.Messages.RecipeMLCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(RecipeML.diagram.part.Messages.RecipeMLCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new RecipeML.diagram.part.RecipeMLCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"recipeml") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".recipeml_diagram".length()); //$NON-NLS-1$
					setFileName(RecipeML.diagram.part.RecipeMLDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "recipeml")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(RecipeML.diagram.part.Messages.RecipeMLCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(RecipeML.diagram.part.Messages.RecipeMLCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = RecipeML.diagram.part.RecipeMLDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						RecipeML.diagram.part.RecipeMLDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								RecipeML.diagram.part.Messages.RecipeMLCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						RecipeML.diagram.part.Messages.RecipeMLCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				RecipeML.diagram.part.RecipeMLDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
