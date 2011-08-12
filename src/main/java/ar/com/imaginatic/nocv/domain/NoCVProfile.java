package ar.com.imaginatic.nocv.domain;

import java.util.Collection;
import java.util.Set;

import ar.com.imaginatic.nocv.util.Constants;

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
	private Collection<Skill> skills;

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

	
	public NoCVProfile() {}
	
	// Se construye el objeto con los atributos obligatorios
	public NoCVProfile(String titulo, String resumen, NoCVType type,
			Ubicacion ubicacion, DisponibilidadHoraria disponibilidadHoraria,
			Collection<Skill> skills) {
		this.skills = skills;
		this.titulo = titulo;
		this.resumen = resumen;
		this.noCVType = type;
		this.ubicacion = ubicacion;
		this.disponibilidadHorariaType = disponibilidadHoraria;
		
		this.oid=Constants.getRamdomId();
	}

	public String getOid() {
		return oid;
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

	public NoCVType getNoCVType() {
		return noCVType;
	}

	public void setNoCVType(NoCVType noCVType) {
		this.noCVType = noCVType;
	}

	public Collection<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Collection<Skill> skills) {
		this.skills = skills;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

}
