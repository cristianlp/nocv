package ar.com.imaginatic.nocv.web.view;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import ar.com.imaginatic.nocv.web.view.forms.NewUserForm;



public class HeaderPanel extends BasePanel {
	
	
	public HeaderPanel() {
		
		super("header");
		initGui();
	}

	private void initGui() {
		add(new BookmarkablePageLink("newUserLink", NewUserForm.class));
		add(new BookmarkablePageLink("profileLink", NoCVForm.class));

	}
		
	

}
