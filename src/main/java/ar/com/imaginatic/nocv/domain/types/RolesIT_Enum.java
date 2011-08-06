package ar.com.imaginatic.nocv.domain.types;

public enum RolesIT_Enum {
	DESARROLLADOR ("DESARROLLADOR", "Desarrollador de Software"), 
	ARQUITECTO ("ARQUITECTO", "Arquitecto de Software"), 
	ANALISTA_FUNCIONAL("ANALISTA_FUNCIONAL", "Analista funcional"), 
	TESTER ("TESTER", "Tester"),
	LIDER_PROYECTO("LIDER_PROYECTO", "Lider de proyectos"),
	DBA ("DBA", "Administrador de base de datos"),
	CONSULTOR ("CONSULTOR", "Consultor IT");
	
	private String value;
	private String descripcion;
	
	RolesIT_Enum(String value, String descripcion) {
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
