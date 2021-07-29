/*
 * 
 */
package MyPantry.diagram.part;

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
public class MyPantryCreationWizard extends Wizard implements INewWizard {

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
	protected MyPantry.diagram.part.MyPantryCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected MyPantry.diagram.part.MyPantryCreationWizardPage domainModelFilePage;

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
		setWindowTitle(MyPantry.diagram.part.Messages.MyPantryCreationWizardTitle);
		setDefaultPageImageDescriptor(MyPantry.diagram.part.MyPantryDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewMyPantryWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new MyPantry.diagram.part.MyPantryCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"mypantry_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(MyPantry.diagram.part.Messages.MyPantryCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(MyPantry.diagram.part.Messages.MyPantryCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new MyPantry.diagram.part.MyPantryCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"mypantry") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".mypantry_diagram".length()); //$NON-NLS-1$
					setFileName(MyPantry.diagram.part.MyPantryDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "mypantry")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(MyPantry.diagram.part.Messages.MyPantryCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(MyPantry.diagram.part.Messages.MyPantryCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = MyPantry.diagram.part.MyPantryDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						MyPantry.diagram.part.MyPantryDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								MyPantry.diagram.part.Messages.MyPantryCreationWizardOpenEditorError, null,
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
						MyPantry.diagram.part.Messages.MyPantryCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				MyPantry.diagram.part.MyPantryDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
