package ar.com.imaginatic.nocv.domain;

/*
 * Las instancias de esta clase representan los usuarios del sistema
 * 
 * */

public class User {

	private String oid;

	private String username;
	private String nombre;
	private String password;
	private String passwordConfirmacion;

	private String email;

	private boolean activo;

	private NoCVProfile noCVProfile;

	public User(String username, String password, String email, boolean estado) {
		this(username, null, password, email, estado);
	}

	public User(String username, String nombre, String password, String email,
			boolean activo) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.activo = activo;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmacion() {
		return passwordConfirmacion;
	}

	public void setPasswordConfirmacion(String passwordConfirmacion) {
		this.passwordConfirmacion = passwordConfirmacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public NoCVProfile getNoCVProfile() {
		return noCVProfile;
	}

	public void setNoCVProfile(NoCVProfile noCVProfile) {
		this.noCVProfile = noCVProfile;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
