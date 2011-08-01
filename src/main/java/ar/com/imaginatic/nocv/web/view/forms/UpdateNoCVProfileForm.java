package ar.com.imaginatic.nocv.web.view.forms;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.validation.validator.StringValidator;

import ar.com.imaginatic.nocv.domain.NoCV;
import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.web.view.pages.BasePage;
import ar.com.imaginatic.nocv.web.view.pages.HomePage;

public class UpdateNoCVProfileForm extends BasePage {

	private String userId;
	
	
	public UpdateNoCVProfileForm() {
		initGui(null);
	}
	
	public UpdateNoCVProfileForm(final PageParameters params) {
		userId = params.getString("user");
		initGui(userId);
	}

	private void initGui(final String userId) {

		IModel<NoCV> model = new CompoundPropertyModel<NoCV>(
				new LoadableDetachableModel<NoCV>() {

					@Override
					protected NoCV load() {
						return new NoCV();
					}
				});

		Form<NoCV> form = new Form<NoCV>("nocv_form", model) {
			
			User user;
			
			@Override
			protected void onSubmit() {
				NoCV nocv = getModelObject();

				if (user != null)
					user = getNoCVService().findUserById(userId);
				else
					user = getNoCVSession().getUser();
				
				

				nocv.setUser(user);
				
				// FIXME
				setResponsePage(HomePage.class);
			}

		};

		// TODO Externalizar el maximo y minimo valor para los inputs

		// Input TITULO
		final TextField<String> tituloField = new TextField<String>("titulo");
		tituloField.setRequired(true);
		//tituloField.add(StringValidator.minimumLength(3));
		//tituloField.add(StringValidator.maximumLength(100));

		// Input RESUMEN
		final TextField<String> resumenField = new TextField<String>("resumen");
		//resumenField.add(StringValidator.minimumLength(3));
		//resumenField.add(StringValidator.minimumLength(250));

		form.add(tituloField);
		form.add(resumenField);

		Button submit = new Button("submit_profile");
		form.add(submit);

		add(form);

	}

}
