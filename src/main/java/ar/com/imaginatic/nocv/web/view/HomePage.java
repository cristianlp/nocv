package ar.com.imaginatic.nocv.web.view;

import java.util.Date;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends BasePage {
	
	//@SpringBean
	//private UserService userService;

	public HomePage() {
		initGui();
	}

	private void initGui() {
		add(new Label("helloLabel", "Hola Andrew"));
		add(new Label("currentTime", new Date().toString()));
		add(new BookmarkablePageLink("usersLink", UsersPage.class));
		add(new BookmarkablePageLink("newUserLink", NewUserPage.class));
	}

}
