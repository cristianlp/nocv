package ar.com.imaginatic.nocv.web.view;

import java.io.Serializable;

import org.apache.wicket.Request;
import org.apache.wicket.protocol.http.WebSession;

import ar.com.imaginatic.nocv.web.dto.UserDTO;

public class NoCVSession extends WebSession implements Serializable{

	
	private UserDTO user;


	private static final long serialVersionUID = 1L;

	public NoCVSession(Request request) {
		super(request);
	}

	
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	
}
