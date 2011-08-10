package ar.com.imaginatic.nocv.web.view.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import ar.com.imaginatic.nocv.web.dto.UserDTO;


public class ListUsersPage extends BasePage {
	
	
	public ListUsersPage() {
		
		initGui();
	}

	private void initGui() {
		
		IModel<List<UserDTO>> listModel = new LoadableDetachableModel<List<UserDTO>>() {
			@Override
			protected List<UserDTO> load() {
				return new ArrayList(getNoCVService().getAllUsers());
			}
		};
		
		ListView<UserDTO> list = new ListView<UserDTO>("user", listModel) {
			 
			@Override
			protected void populateItem(final ListItem<UserDTO> item) {
				UserDTO u = item.getModelObject();

				item.add(new Label("usernameLabel", u.getUsername()));
				
				Link<String> viewUserLink = new BookmarkablePageLink<String>(
						"viewUserLink", ViewUserPublicNoCVProfilePage.class, new PageParameters("user=" + u.getOid()));
						
				viewUserLink.add(new Label("viewUserLinkLabel", "Ver Perfil"));
				item.add(viewUserLink);
				
			}
		};
		add(list);
	
	}
	

}
