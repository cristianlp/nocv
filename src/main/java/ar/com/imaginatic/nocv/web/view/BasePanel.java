package ar.com.imaginatic.nocv.web.view;

import org.apache.wicket.markup.html.panel.Panel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.com.imaginatic.nocv.service.NoCVService;


public class BasePanel extends Panel {
    
    protected static final Logger logger = LoggerFactory.getLogger(BasePanel.class);
    
    protected NoCVService getNoCVService() {
        return NoCVApplication.get().getNoCVService();
    }          
    
    
    public BasePanel(String id) {
        super(id);
    }       
    
}
