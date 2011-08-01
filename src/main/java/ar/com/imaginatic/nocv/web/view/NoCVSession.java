package ar.com.imaginatic.nocv.web.view;

import java.io.Serializable;

import org.apache.wicket.Request;
import org.apache.wicket.protocol.http.WebSession;

import ar.com.imaginatic.nocv.domain.User;

public class NoCVSession extends WebSession implements Serializable{

	
	private User user;


	private static final long serialVersionUID = 1L;

	public NoCVSession(Request request) {
		super(request);
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
