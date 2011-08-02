package ar.com.imaginatic.nocv.web.view.forms;

import java.util.Arrays;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.domain.types.DisponibilidadHoraria_Enum;
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

		IModel<NoCVProfile> model = new CompoundPropertyModel<NoCVProfile>(
				new LoadableDetachableModel<NoCVProfile>() {

					@Override
					protected NoCVProfile load() {
						return new NoCVProfile();
					}
				});

		Form<NoCVProfile> form = new Form<NoCVProfile>("nocv_form", model) {

			User user;

			@Override
			protected void onSubmit() {
				NoCVProfile nocv = getModelObject();

				if (user != null)
					user = getNoCVService().findUserById(userId);
				else
					user = getNoCVSession().getUser();

				System.out.println("USUARIO -->" + user.getUsername());
				
				nocv.setUser(user);

				// FIXME
				setResponsePage(HomePage.class);
			}

		};

		// TODO Externalizar el maximo y minimo valor para los inputs

		// Input TITULO
		final TextField<String> tituloField = new TextField<String>("titulo");
		tituloField.setRequired(true);
		// tituloField.add(StringValidator.minimumLength(3));
		// tituloField.add(StringValidator.maximumLength(100));

		// Input RESUMEN
		final TextArea<String> resumenField = new TextArea<String>("resumen");
		// resumenField.add(StringValidator.minimumLength(3));
		// resumenField.add(StringValidator.minimumLength(250));
		
		//final TextField<String> skillField = new TextField<String>("skill");

		form.add(tituloField);
		form.add(resumenField);
		//form.add(skillField);

		form.add(this.createDropDownChoiceForDisponibilidadHoraria());
		
		Button submit = new Button("submit_profile");
		form.add(submit);

		add(form);

	}
	

	private DropDownChoice createDropDownChoiceForDisponibilidadHoraria() {
	  return new DropDownChoice("disponibilidadHorariaType", Arrays.asList(DisponibilidadHoraria_Enum.values()), new IChoiceRenderer() {

          public Object getDisplayValue(Object status) {
          return ((DisponibilidadHoraria_Enum) status).getDescripcion();
      }

          public String getIdValue(Object status, int index) {
                  return ((DisponibilidadHoraria_Enum) status).getValue();
          }});

	}

}
