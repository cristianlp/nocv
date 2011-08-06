package ar.com.imaginatic.nocv.domain.types;

public enum NoCVProfile_Enum {

	INDIVIDUAL ("INDIVIDUAL", "Usuario Particular"), 
	EMPRESA("EMPRESA", "Usuario empresa"); 
	
	private String value;
	private String descripcion;
	
	NoCVProfile_Enum(String value, String descripcion) {
		this.value = value;
		this.descripcion = descripcion;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
