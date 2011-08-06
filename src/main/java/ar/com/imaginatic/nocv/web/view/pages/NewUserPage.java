package ar.com.imaginatic.nocv.web.view.pages;

import ar.com.imaginatic.nocv.web.view.forms.NewUserForm;

public class NewUserPage extends BasePage{

	
	public NewUserPage() {
		initGui();
	}
	
	
	private void initGui() {
		
		this.add(new NewUserForm("NewUserForm", this));
		
	}
	
}
