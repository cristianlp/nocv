package ar.com.imaginatic.nocv.domain;

import java.util.HashSet;
import java.util.Set;

import ar.com.imaginatic.nocv.domain.types.DisponibilidadHoraria_Enum;
import ar.com.imaginatic.nocv.domain.types.NoCVProfile_Enum;
import ar.com.imaginatic.nocv.domain.types.RolesIT_Enum;
import ar.com.imaginatic.nocv.util.Constants;

/*
 * Las instancias de esta clase representan el perfil "liviano" (no formal) de un usuario (instancia de la clase User)
 * 
 * */

public class NoCVProfile {

	private String oid;

	private User user;

	// Titulo mostrado en el listado de usuarios en la HomePage
	private String titulo;

	// Resumen (max X caracteres) que se muestra bajo el titulo descriptivo.
	private String resumen;

	// Funcionan como descriptores del perfil del usuario
	private Set<Skill> skills;

	// La disponibilidad horaria del usuario
	private DisponibilidadHoraria_Enum disponibilidadHorariaType;

	// Tipo del usuario: individual o empresa
	private NoCVProfile_Enum noCVProfileType;

	// Info no publica para ser contactado
	private Ubicacion ubicacion;

	// Atributos opcionales
	private boolean meInteresaParticiparEnProyectosLibres;
	private String heTrabajadoCon;
	private Set<RolesIT_Enum> rolesType;
	// Texto libre para completar el perfil
	private String observaciones;

	public NoCVProfile() {
		skills = new HashSet<Skill>();
		disponibilidadHorariaType = DisponibilidadHoraria_Enum.ENTRE_10_20_HS_SEMANALES;
		noCVProfileType = NoCVProfile_Enum.INDIVIDUAL;
		rolesType = new HashSet<RolesIT_Enum>();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public DisponibilidadHoraria_Enum getDisponibilidadHorariaType() {
		return disponibilidadHorariaType;
	}

	public void setDisponibilidadHorariaType(
			DisponibilidadHoraria_Enum disponibilidadHorariaType) {
		this.disponibilidadHorariaType = disponibilidadHorariaType;
	}

	public NoCVProfile_Enum getNoCVProfileType() {
		return noCVProfileType;
	}

	public void setNoCVProfileType(NoCVProfile_Enum noCVProfileType) {
		this.noCVProfileType = noCVProfileType;
	}

	public Set<RolesIT_Enum> getRolesType() {
		return rolesType;
	}

	public void setRolesType(Set<RolesIT_Enum> rolesType) {
		this.rolesType = rolesType;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

}
