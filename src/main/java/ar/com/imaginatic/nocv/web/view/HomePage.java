package ar.com.imaginatic.nocv.web.view;

import java.util.Date;

import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {
	
	//@SpringBean
	//private UserService userService;

	public HomePage() {
		initGui();
	}

	private void initGui() {
		add(new Label("helloLabel", "Hola Andrew"));
		add(new Label("currentTime", new Date().toString()));
	}

}
