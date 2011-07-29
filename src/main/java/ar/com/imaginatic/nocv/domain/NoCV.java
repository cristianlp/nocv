package ar.com.imaginatic.nocv.domain;

import java.util.HashSet;
import java.util.Set;

public class NoCV {

	private static enum DisponibilidadHoraria {
		MENOS_10_HS_SEMANALES, ENTRE_10_20_HS_SEMANALES, MAS_DE_20_HS_SEMANALES
	}
	
	//Funcionan como descriptores del perfil del usuario
	private Set<Tag> tags;
	
	
	private DisponibilidadHoraria disponibilidadHoraria;
	
	//Info no publica para ser contactado
	private InfoContacto infoContacto;
	
	//Atributos opcionales
	private String valorHora;
	private boolean meInteresaParticiparEnProyectosLibres;
	private String heTrabajadoCon;
	private String quisieraTrabajarCon;
	
	//Texto libre para agregar info
	private String descripcion;

	
	public NoCV() {
		tags = new HashSet<Tag>();
		disponibilidadHoraria = DisponibilidadHoraria.ENTRE_10_20_HS_SEMANALES;
	}
	
	public DisponibilidadHoraria getDisponibilidadHoraria() {
		return disponibilidadHoraria;
	}

	public void setDisponibilidadHoraria(DisponibilidadHoraria disponibilidadHoraria) {
		this.disponibilidadHoraria = disponibilidadHoraria;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	public String getValorHora() {
		return valorHora;
	}

	public void setValorHora(String valorHora) {
		this.valorHora = valorHora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
