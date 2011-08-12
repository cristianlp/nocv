package ar.com.imaginatic.nocv.web.dto;

import java.util.Collection;

import ar.com.imaginatic.nocv.domain.NoCVType;

public class NoCVProfileDTO {

	private String oid;

	private String titulo;
	private String resumen;
	private Collection<SkillDTO> skills;

	private DisponibilidadHorariaDTO disponibilidadHorariaType;
	private NoCVType noCVType;
	// private Set<RoleITDTO> rolesIT;

	// UBICACION
	private String pais;
	private String ciudad;
	private String observacionesUbicacion;

	private String observaciones;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public DisponibilidadHorariaDTO getDisponibilidadHorariaType() {
		return disponibilidadHorariaType;
	}

	public void setDisponibilidadHorariaType(
			DisponibilidadHorariaDTO disponibilidadHorariaType) {
		this.disponibilidadHorariaType = disponibilidadHorariaType;
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

	public String getObservacionesUbicacion() {
		return observacionesUbicacion;
	}

	public void setObservacionesUbicacion(String observacionesUbicacion) {
		this.observacionesUbicacion = observacionesUbicacion;
	}

	public NoCVType getNoCVType() {
		return noCVType;
	}

	public void setNoCVType(NoCVType noCVType) {
		this.noCVType = noCVType;
	}

	public Collection<SkillDTO> getSkills() {
		return skills;
	}

	public void setSkills(Collection<SkillDTO> skills) {
		this.skills = skills;
	}

}
