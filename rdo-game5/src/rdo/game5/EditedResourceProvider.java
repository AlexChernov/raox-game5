package rdo.game5;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class EditedResourceProvider implements IEditedResourceProvider {

	@Inject
	Provider<ResourceSet> resourceSetProvider;

	@Override
	public XtextResource createResource() {
		XtextResource resource = (XtextResource) resourceSetProvider.get()
				.createResource(URI.createURI("test.rao"));
		return resource;
	}
}
