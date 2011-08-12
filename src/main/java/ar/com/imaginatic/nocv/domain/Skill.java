package ar.com.imaginatic.nocv.domain;

import ar.com.imaginatic.nocv.util.Constants;

public class Skill {

	private String oid;
	private String descripcion;

	public Skill() {
	}

	public Skill(String descripcion) {
		this.descripcion = descripcion;
		this.oid = Constants.getRamdomId();
	}

	public String getOid() {
		return oid;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

}
