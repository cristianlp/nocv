package ar.com.imaginatic.nocv.domain;

import java.util.Set;

/*
 * Las instancias de esta clase representan el perfil "liviano" (no formal) de un usuario (instancia de la clase User)
 * 
 * */

public class NoCVProfile {

	private String oid;

	// Titulo mostrado en el listado de usuarios en la HomePage
	private String titulo;

	// Resumen (max X caracteres) que se muestra bajo el titulo descriptivo.
	private String resumen;

	// Funcionan como descriptores del perfil del usuario
	private Set<Skill> skills;

	// La disponibilidad horaria del usuario
	// private DisponibilidadHoraria_Enum disponibilidadHorariaType;

	private DisponibilidadHoraria disponibilidadHorariaType;

	// Tipo del usuario: individual o empresa
	// private NoCVProfile_Enum noCVProfileType;

	private NoCVType noCVType;

	// Info no publica para ser contactado
	private Ubicacion ubicacion;

	// Atributos opcionales
	private boolean meInteresaParticiparEnProyectosLibres;
	private String heTrabajadoCon;
	// private Set<RoleIT> rolesType;

	// Texto libre para completar el perfil
	private String observaciones;

	// Se construye el objeto con los atributos obligatorios
	public NoCVProfile(String titulo, String resumen, Ubicacion ubicacion,
			DisponibilidadHoraria disponibilidadHoraria, Set<Skill> skills) {
		this.skills = skills;
		this.titulo = titulo;
		this.resumen = resumen;
		this.ubicacion = ubicacion;
		this.disponibilidadHorariaType = disponibilidadHoraria;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public boolean isMeInteresaParticiparEnProyectosLibres() {
		return meInteresaParticiparEnProyectosLibres;
	}

	public void setMeInteresaParticiparEnProyectosLibres(
			boolean meInteresaParticiparEnProyectosLibres) {
		this.meInteresaParticiparEnProyectosLibres = meInteresaParticiparEnProyectosLibres;
	}

	public String getHeTrabajadoCon() {
		return heTrabajadoCon;
	}

	public void setHeTrabajadoCon(String heTrabajadoCon) {
		this.heTrabajadoCon = heTrabajadoCon;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void addSkill(Skill skill) {
		skills.add(skill);
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public DisponibilidadHoraria getDisponibilidadHorariaType() {
		return disponibilidadHorariaType;
	}

	public void setDisponibilidadHorariaType(
			DisponibilidadHoraria disponibilidadHorariaType) {
		this.disponibilidadHorariaType = disponibilidadHorariaType;
	}

	public NoCVType getNoCVProfileType() {
		return noCVType;
	}

	public void setNoCVProfileType(NoCVType noCVProfileType) {
		this.noCVType = noCVProfileType;
	}

	public NoCVType getNoCVType() {
		return noCVType;
	}

	public void setNoCVType(NoCVType noCVType) {
		this.noCVType = noCVType;
	}

}
