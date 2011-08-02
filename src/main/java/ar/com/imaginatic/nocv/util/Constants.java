package ar.com.imaginatic.nocv.util;

import java.util.UUID;

public final class Constants {

	public static String getRamdomId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
}
