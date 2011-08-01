package ar.com.imaginatic.nocv.web.view.forms;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import ar.com.imaginatic.nocv.domain.NoCV;
import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.web.view.BasePage;
import ar.com.imaginatic.nocv.web.view.HomePage;

public class NoCVForm extends BasePage {

	public NoCVForm() {
		initGui();
	}

	private void initGui() {

		IModel<NoCV> model = new CompoundPropertyModel<NoCV>(
				new LoadableDetachableModel<NoCV>() {

					@Override
					protected NoCV load() {
						return new NoCV();
					}
				});

		Form<NoCV> form = new Form<NoCV>("nocv_form", model) {
			@Override
			protected void onSubmit() {
				NoCV nocv = getModelObject();
				
				
				//FIXME
				setResponsePage(HomePage.class);
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
