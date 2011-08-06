package ar.com.imaginatic.nocv.domain;

import java.util.ArrayList;
import java.util.Collection;

import ar.com.imaginatic.nocv.util.Constants;

public class NoCVWorld {

	private String oid;
	
	private NoCVWorld instance = null;

	private Collection<User> users;

	private NoCVWorld() {
		users = new ArrayList<User>();
		oid = Constants.getRamdomId();

	}

	public NoCVWorld getInstance() {
		if (instance == null)
			instance = new NoCVWorld();
		return instance;
	}

	public void addUser(String username, String nombre, String password, String email) {
		
		User user = new User(username, nombre, password, email);
		
		this.getUsers().add(user);
	}
	
	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

}
