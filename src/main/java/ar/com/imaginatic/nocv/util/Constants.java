package ar.com.imaginatic.nocv.util;

import java.util.UUID;

public final class Constants {

	public static String PENDIENTE = "PENDIENTE";
	public static String CONFIRMADO = "CONFIRMADO";
	
	public static String getRamdomId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
}
