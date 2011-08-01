package ar.com.imaginatic.nocv.web.view.pages;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import ar.com.imaginatic.nocv.web.view.forms.NewUserForm;
import ar.com.imaginatic.nocv.web.view.forms.UpdateNoCVProfileForm;



public class HeaderPanel extends BasePanel {
	
	
	public HeaderPanel() {
		
		super("header");
		initGui();
	}

	private void initGui() {
		add(new BookmarkablePageLink("newUserLink", NewUserForm.class));
		add(new BookmarkablePageLink("profileLink", UpdateNoCVProfileForm.class));

	}
		
	

}
