package ar.com.imaginatic.nocv.domain;

public class Ubicacion {

	private Pais pais;
	private Ciudad ciudad;

	public Ubicacion(Pais pais, Ciudad ciudad) {
		this.pais = pais;
		this.ciudad = ciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}
