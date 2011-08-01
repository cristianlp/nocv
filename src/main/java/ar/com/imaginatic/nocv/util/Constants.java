package ar.com.imaginatic.nocv.util;

import java.util.UUID;

public class Constants {

	public static enum DisponibilidadHoraria {
		MENOS_10_HS_SEMANALES, ENTRE_10_20_HS_SEMANALES, MAS_DE_20_HS_SEMANALES
	}
	
	public static enum Roles_IT {
		DESARROLLADOR, ARQUITECTO, ANALISTA_FUNCIONAL, TESTER, LIDER_PROYECTO, DBA, CONSULTOR 
	}
	
	public static String generateRamdomId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
}
