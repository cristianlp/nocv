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

import ar.com.imaginatic.nocv.domain.types.DisponibilidadHoraria_Enum;
import ar.com.imaginatic.nocv.web.dto.NoCVProfileDTO;
import ar.com.imaginatic.nocv.web.dto.UserDTO;
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

		IModel<NoCVProfileDTO> model = new CompoundPropertyModel<NoCVProfileDTO>(
				new LoadableDetachableModel<NoCVProfileDTO>() {

					@Override
					protected NoCVProfileDTO load() {
						return new NoCVProfileDTO();
					}
				});

		Form<NoCVProfileDTO> form = new Form<NoCVProfileDTO>("nocv_form", model) {

			UserDTO user;

			@Override
			protected void onSubmit() {
				NoCVProfileDTO nocv = getModelObject();

				if (userId != null)
					user = getNoCVService().getUserById(userId);
				else
					user = getNoCVSession().getUser();

				System.out.println("USUARIO -->" + user.getUsername());
				
				nocv.setUser(user);
				
				
				
				getNoCVService().addNoCVProfile(nocv);
				
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
