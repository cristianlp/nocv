package ar.com.imaginatic.nocv.web.dto;

public class UserDTO {

	private String oid;
	
	private String username;
	private String nombre;
	private String password;
	private String email;

	public UserDTO() {
		this(null, null, null);
	}

	public UserDTO(String username, String nombre, String email) {
		this(username, nombre, null, email);
	}

	public UserDTO(String username, String nombre, String apellido, String email) {
		this.username = username;
		this.nombre = nombre;
		this.password = apellido;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

}
