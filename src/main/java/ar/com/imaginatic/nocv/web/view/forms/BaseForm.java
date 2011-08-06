package ar.com.imaginatic.nocv.web.view.forms;

import org.apache.wicket.markup.html.form.Form;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseForm extends Form<Object>{

	protected static final Logger logger = LoggerFactory
	.getLogger(BaseForm.class);
	
	private static final long serialVersionUID = 1L;

	
	public BaseForm(String id) {
		super(id);
		
	}


	
	
}
