package ar.com.imaginatic.nocv.web.view.pages;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;



public class HeaderPanel extends BasePanel {
	
	
	public HeaderPanel() {
		
		super("header");
		initGui();
	}

	private void initGui() {
		add(new BookmarkablePageLink("newUserLink", NewUserPage.class));
		add(new BookmarkablePageLink("profileLink", UpdateNoCVProfilePage.class,  new PageParameters("user=1")));

	}
		
	

}
