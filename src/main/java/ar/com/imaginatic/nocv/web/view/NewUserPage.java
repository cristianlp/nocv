package ar.com.imaginatic.nocv.web.view;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.persistence.repository.impl.hibernate.UserHibernateRepository;

public class NewUserPage extends BasePage {

	public NewUserPage() {
		initGui();
	}

	private void initGui() {

		IModel<User> model = new CompoundPropertyModel<User>(
				new LoadableDetachableModel<User>() {

					@Override
					protected User load() {
						return new User();
					}
				});

		Form<User> form = new Form<User>("newuser_form", model) {
			@Override
			protected void onSubmit() {
				User u = getModelObject();
				UserHibernateRepository repo = new UserHibernateRepository();
				repo.save(u);
				setResponsePage(UsersPage.class);
			}

		};
		
		TextField<String> titleField = new TextField<String>("username");
		titleField.setRequired(true);
		 
		form.add(titleField);
		
		Button submit = new Button("submit");
		form.add(submit);
		 
		add(form);
		
		
		

	}

}
