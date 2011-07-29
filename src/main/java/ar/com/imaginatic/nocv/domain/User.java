package ar.com.imaginatic.nocv.domain;

public class User {

	//FIXME ASIGNAR UN ID ARBITRARIO --> 4 TESTING
	public User(String username) {
		this.username = username;
		this.oid = "10";
	}
	

	public User() {
		
	}
	
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String oid;
	
	private String username;
	private String nombre;
	private String password;
	
	private NoCV cv;
	
	
	
}
