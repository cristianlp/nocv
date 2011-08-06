package ar.com.imaginatic.nocv.web.view.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends BasePage {

	public HomePage() {
		initGui();
	}

	private void initGui() {

		Link<String> listUsersLink = new BookmarkablePageLink<String>(
				"listUsersLink", ListUsersPage.class);
		listUsersLink.add(new Label("listUsersLabel", "Listado de usuarios"));
		this.add(listUsersLink);

	}


}
