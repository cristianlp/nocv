package ar.com.imaginatic.nocv.web.view.pages;

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

import ar.com.imaginatic.nocv.web.dto.DisponibilidadHorariaDTO;
import ar.com.imaginatic.nocv.web.dto.NoCVProfileDTO;
import ar.com.imaginatic.nocv.web.dto.UserDTO;

public class UpdateNoCVProfilePage extends BasePage {

	private String userId;

	public UpdateNoCVProfilePage() {
		initGui(null);
	}

	public UpdateNoCVProfilePage(final PageParameters params) {
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
				
							
				
				
				UserDTO userDTO = getNoCVService().addNoCVProfile(user.getOid(), nocv);
				
				//TODO Mostrar info relacionada al nocv configurado para el usuario
				
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
	

	private DropDownChoice<DisponibilidadHorariaDTO> createDropDownChoiceForDisponibilidadHoraria() {
	  return new DropDownChoice<DisponibilidadHorariaDTO>("disponibilidadHorariaType", getNoCVService().getAllDisponibilidadHorariaTypes(), new IChoiceRenderer() {

          public Object getDisplayValue(Object status) {
          return ((DisponibilidadHorariaDTO) status).getDescripcion();
      }

          public String getIdValue(Object status, int index) {
                  return ((DisponibilidadHorariaDTO) status).getOid();
          }});

	}

}
