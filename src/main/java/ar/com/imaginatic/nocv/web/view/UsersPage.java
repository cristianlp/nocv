package ar.com.imaginatic.nocv.web.view;

import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import ar.com.imaginatic.nocv.domain.User;


public class UsersPage extends BasePage {
	
	
	public UsersPage() {
		
		initGui();
	}

	private void initGui() {
		
		IModel<List<User>> listModel = new LoadableDetachableModel<List<User>>() {
			@Override
			protected List<User> load() {
				return getNoCVService().findAllUsers();
			}
		};
		
		ListView<User> list = new ListView<User>("user", listModel) {
			 
			@Override
			protected void populateItem(final ListItem<User> item) {
				User u = item.getModelObject();
				item.add(new Label("username", u.getUsername()));
				
				item.add(new BookmarkablePageLink<Void>("viewUserLink",
						ViewUserPage.class, new PageParameters("user=" + u.getOid())));
			}
		};
		add(list);
	
	}
	

}
