package ar.com.imaginatic.nocv.web.dto;

import java.util.Set;

import ar.com.imaginatic.nocv.domain.Skill;
import ar.com.imaginatic.nocv.domain.Ubicacion;
import ar.com.imaginatic.nocv.domain.types.DisponibilidadHoraria_Enum;
import ar.com.imaginatic.nocv.domain.types.NoCVProfile_Enum;

public class NoCVProfileDTO {

	private String oid;
	
	private UserDTO user;

	private String titulo;
	private String resumen;
	private Set<Skill> skills;

	private DisponibilidadHoraria_Enum disponibilidadHorariaType;
	private NoCVProfile_Enum noCVProfileType;

	private Ubicacion ubicacion;

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

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

}
