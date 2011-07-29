package ar.com.imaginatic.nocv.web.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.persistence.repository.impl.hibernate.UserHibernateRepository;


public class UsersPage extends BasePage {
	
	
	public UsersPage() {
		
		initGui();
	}

	private void initGui() {
		
		IModel<List<User>> listModel = new LoadableDetachableModel<List<User>>() {
			@Override
			protected List<User> load() {
				return new UserHibernateRepository().findAll();
			}
		};
		
		ListView<User> list = new ListView<User>("user", listModel) {
			 
			@Override
			protected void populateItem(final ListItem<User> item) {
				User u = item.getModelObject();
				item.add(new Label("username", u.getUsername()));
			}
		};
		add(list);
	
	}
	

}
