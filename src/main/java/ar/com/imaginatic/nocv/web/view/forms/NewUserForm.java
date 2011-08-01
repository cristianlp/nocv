package ar.com.imaginatic.nocv.web.view.forms;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.web.view.NoCVSession;
import ar.com.imaginatic.nocv.web.view.pages.BasePage;
import ar.com.imaginatic.nocv.web.view.pages.HomePage;

public class NewUserForm extends BasePage {


	
	public NewUserForm() {
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
				
				//FIXME
				boolean b = getNoCVService().saveUser(u);
				
				getNoCVSession().setUser(u);
				
				setResponsePage(UpdateNoCVProfileForm.class);
			}

		};

		//TODO Externalizar el maximo y minimo valor para los inputs

		
		//Input Username
		final TextField<String> usernameField = new TextField<String>("username"); //Form", new PropertyModel<String>(this, "usernameForm"));
		usernameField.setRequired(true);
		//usernameField.add(StringValidator.minimumLength(3));
		//usernameField.add(StringValidator.maximumLength(50));

		
		//Input Nombre (opcional)
		final TextField<String> nombreField = new TextField<String>("nombre"); //Form", new PropertyModel<String>(this, "nombreForm")); 
		//nombreField.add(StringValidator.minimumLength(3));
		//nombreField.add(StringValidator.minimumLength(50));
		
		
		
		//Input Password
		final PasswordTextField passwordField = new PasswordTextField(
				"password"); //Form", new PropertyModel<String>(this, "passwordForm"));
		//passwordField.add(StringValidator.minimumLength(3));
		//passwordField.add(StringValidator.maximumLength(50));
		
		//Input Confirmacion Password
		final PasswordTextField passwordConfirmacionField = new PasswordTextField(
				"passwordConfirmacion"); //Form", new PropertyModel<String>(this, "passwordConfirmacionForm"));
		//passwordConfirmacionField.add(StringValidator.minimumLength(3));
		//passwordConfirmacionField.add(StringValidator.maximumLength(50));
		
		//form.add(new EqualPasswordInputValidator(passwordField, passwordConfirmacionField));
		
		form.add(usernameField);
		form.add(nombreField);
		form.add(passwordField);
		form.add(passwordConfirmacionField);
		
		Button submit = new Button("submit");
		form.add(submit);
		 
		add(form);
		
		
		

	}

	

}
