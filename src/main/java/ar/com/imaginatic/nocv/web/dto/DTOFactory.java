package ar.com.imaginatic.nocv.web.dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.User;

public class DTOFactory {

	public static UserDTO createDTOForUser(User user) {
		UserDTO dto = new UserDTO(user.getUsername(), user.getNombre(),
				user.getPassword(), user.getEmail());
		dto.setOid(user.getOid());

		return dto;

	}

	public static Collection<UserDTO> createDTOForUsers(Collection<User> users) {
		Set<UserDTO> result = new HashSet<UserDTO>();
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = iterator.next();
			result.add(createDTOForUser(user));

		}

		return result;

	}

	public static NoCVProfileDTO createDTOForNoCVProfile(NoCVProfile nocv) {
		NoCVProfileDTO dto = new NoCVProfileDTO();

		dto.setDisponibilidadHorariaType(nocv.getDisponibilidadHorariaType());
		dto.setNoCVProfileType(nocv.getNoCVProfileType());
		dto.setObservaciones(nocv.getObservaciones());
		dto.setResumen(nocv.getResumen());
		dto.setSkills(nocv.getSkills());
		dto.setTitulo(nocv.getTitulo());
		dto.setUbicacion(nocv.getUbicacion());

		dto.setOid(nocv.getOid());

		return dto;

	}

}
