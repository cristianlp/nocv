package ar.com.imaginatic.nocv.web.view;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.settings.IResourceSettings;
import org.springframework.stereotype.Component;




@Component(value = "wicketApplication")
public class NoCVApplication extends WebApplication {

	private static final String DEFAULT_ENCODING = "UTF-8";
	
	//@Autowired
    //private ApplicationContext applicationContext;

	@Override
	protected void init() {
		super.init();

		
		/*addComponentInstantiationListener(new SpringComponentInjector(this, applicationContext, true));

		getMarkupSettings().setDefaultMarkupEncoding(DEFAULT_ENCODING);
		getRequestCycleSettings().setResponseRequestEncoding(DEFAULT_ENCODING);

		mountBookmarkablePages();
		mountErrorLandingPages();

		if (getConfigurationType().equals(WebApplication.DEPLOYMENT)) {
			getMarkupSettings().setStripWicketTags(true);
			getMarkupSettings().setStripComments(true);
			getMarkupSettings().setCompressWhitespace(true);
		}*/

	}

	private void mountBookmarkablePages() {

	}

	private void mountErrorLandingPages() {

	}

	

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return HomePage.class;
	}

	public static NoCVApplication get() {
		return (NoCVApplication) WebApplication.get();
	}

}
