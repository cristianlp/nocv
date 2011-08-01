package ar.com.imaginatic.nocv.domain;

import java.util.HashSet;
import java.util.Set;

import ar.com.imaginatic.nocv.util.Constants;

/*
 * Las instancias de esta clase representan el perfil "liviano" (no formal) de un usuario (instancia de la clase User)
 * 
 * */

public class NoCV {

	private String oid;
	
	private User user;


	// Funcionan como descriptores del perfil del usuario
	private Set<Tag> tags;

	private Constants.DisponibilidadHoraria disponibilidadHoraria;

	// Info no publica para ser contactado
	private InfoContacto infoContacto;

	// Atributos opcionales
	private boolean meInteresaParticiparEnProyectosLibres;
	private String heTrabajadoCon;
	private Constants.Roles_IT misRoles;

	// Texto libre para agregar completar el perfil
	private String resumen;

	public NoCV() {
		tags = new HashSet<Tag>();
		disponibilidadHoraria = Constants.DisponibilidadHoraria.ENTRE_10_20_HS_SEMANALES;
	}

	public Constants.DisponibilidadHoraria getDisponibilidadHoraria() {
		return disponibilidadHoraria;
	}

	public void setDisponibilidadHoraria(
			Constants.DisponibilidadHoraria disponibilidadHoraria) {
		this.disponibilidadHoraria = disponibilidadHoraria;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public InfoContacto getInfoContacto() {
		return infoContacto;
	}

	public void setInfoContacto(InfoContacto infoContacto) {
		this.infoContacto = infoContacto;
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

	public Constants.Roles_IT getMisRoles() {
		return misRoles;
	}

	public void setMisRoles(Constants.Roles_IT misRoles) {
		this.misRoles = misRoles;
	}

}
