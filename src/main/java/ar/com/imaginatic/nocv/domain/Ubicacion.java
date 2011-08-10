package ar.com.imaginatic.nocv.domain;

public class Ubicacion {

	private String oid;

	private String pais;
	private String ciudad;
	private String observaciones;

	public Ubicacion(String pais, String ciudad) {
		this(pais, ciudad, null);
	}

	public Ubicacion(String pais, String ciudad, String observaciones) {
		this.pais = pais;
		this.ciudad = ciudad;
		this.observaciones = observaciones;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
