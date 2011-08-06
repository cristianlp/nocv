package ar.com.imaginatic.nocv.domain.types;

public enum DisponibilidadHoraria_Enum {

	MENOS_10_HS_SEMANALES ("MENOS_10", "Menos de 10 horas Semanales"), 
	ENTRE_10_20_HS_SEMANALES("ENTRE_10_20", "Entre 10 y 20 horas semanales"), 
	MAS_DE_20_HS_SEMANALES ("MAS_20", "Más de 20 horas semanales");
	
	private String value;
	private String descripcion;
	
	DisponibilidadHoraria_Enum(String value, String descripcion) {
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
