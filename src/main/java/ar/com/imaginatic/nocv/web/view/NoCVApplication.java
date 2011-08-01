package ar.com.imaginatic.nocv.web.view;

import javax.servlet.ServletContext;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ar.com.imaginatic.nocv.service.NoCVService;




@Component(value = "wicketApplication")
public class NoCVApplication extends WebApplication {

	private static final String DEFAULT_ENCODING = "UTF-8";
	
	
	private NoCVService noCVService;
	private ApplicationContext applicationContext;

	
	 public NoCVService getNoCVService() {
	        return noCVService;
	    }

	 public void setNoCVService(NoCVService noCVService) {
		this.noCVService = noCVService;
	}

	public ApplicationContext getApplicationContext() {
	        return applicationContext;
	    }
	
	@Override
	protected void init() {
		super.init();

		
		ServletContext sc = getServletContext();
        applicationContext = WebApplicationContextUtils.getWebApplicationContext(sc);        
        noCVService = (NoCVService) applicationContext.getBean("noCVService");
		
        //mountBookmarkablePage("/login", LoginPage.class);
        //mountBookmarkablePage("/logout", LogoutPage.class);
		
		/*addComponentInstantiationListener(new SpringComponentInjector(this, applicationContext, true));

		getMarkupSettings().setDefaultMarkupEncoding(DEFAULT_ENCODING);
		getRequestCycleSettings().setResponseRequestEncoding(DEFAULT_ENCODING);


		if (getConfigurationType().equals(WebApplication.DEPLOYMENT)) {
			getMarkupSettings().setStripWicketTags(true);
			getMarkupSettings().setStripComments(true);
			getMarkupSettings().setCompressWhitespace(true);
		}*/

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
