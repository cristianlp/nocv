package ar.com.imaginatic.nocv.web.view;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.com.imaginatic.nocv.service.NoCVService;

public abstract class BasePage extends WebPage {

	protected static final Logger logger = LoggerFactory
			.getLogger(BasePage.class);

	public BasePage() {
		add(new HeaderPanel().setRenderBodyOnly(true));
		add(new SidebarPanel().setRenderBodyOnly(true));
		add(new FooterPanel().setRenderBodyOnly(true));
	}

	public BasePage(PageParameters parameters) {
		super(parameters);
	}

	protected NoCVService getNoCVService() {
		return NoCVApplication.get().getNoCVService();
	}

}
