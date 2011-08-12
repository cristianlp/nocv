package ar.com.imaginatic.nocv.web.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ar.com.imaginatic.nocv.domain.DisponibilidadHoraria;
import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.RoleIT;
import ar.com.imaginatic.nocv.domain.Skill;
import ar.com.imaginatic.nocv.domain.Ubicacion;
import ar.com.imaginatic.nocv.domain.User;

public class DTOFactory {

	public static UserDTO createDTOForUser(User user) {
		UserDTO dto = new UserDTO(user.getUsername(), user.getNombre(),
				user.getPassword(), user.getEmail());

		if (user.getNoCVProfile() != null) {
			NoCVProfileDTO noCVDTO = createDTOForNoCVProfile(user
					.getNoCVProfile());

			dto.setNoCVProfileDTO(noCVDTO);
		}

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

		dto.setDisponibilidadHorariaType(createDTOForDisponibilidadHorariaType(nocv
				.getDisponibilidadHorariaType()));
		dto.setNoCVType(nocv.getNoCVType());
		dto.setObservaciones(nocv.getObservaciones());
		dto.setResumen(nocv.getResumen());
		dto.setSkills(createDTOForSkills(nocv.getSkills()));
		dto.setTitulo(nocv.getTitulo());
		dto.setPais(nocv.getUbicacion().getPais());
		dto.setCiudad(nocv.getUbicacion().getCiudad());

		dto.setOid(nocv.getOid());

		return dto;

	}

	private static Collection<SkillDTO> createDTOForSkills(Collection<Skill> skills) {

		Collection<SkillDTO> result = new ArrayList<SkillDTO>();

		for (Iterator<Skill> iterator = skills.iterator(); iterator.hasNext();) {
			Skill skill = iterator.next();
			result.add(new SkillDTO(skill.getOid(), skill.getDescripcion()));
		}

		return result;
	}

	public static NoCVPublicProfileDTO createDTOForNoCVPublicProfile(User user) {
		NoCVProfile nocv = user.getNoCVProfile();
		NoCVPublicProfileDTO dto = new NoCVPublicProfileDTO(user.getUsername(),
				nocv.getTitulo(), nocv.getResumen(), nocv.getNoCVType(), nocv.getObservaciones(),
				nocv.getSkills(), nocv.getDisponibilidadHorariaType());

		return dto;
	}

	public static List<DisponibilidadHorariaDTO> createDTOForDisponibilidadHorariaTypes(
			List<DisponibilidadHoraria> types) {

		List<DisponibilidadHorariaDTO> result = new ArrayList<DisponibilidadHorariaDTO>();

		for (Iterator<DisponibilidadHoraria> iterator = types.iterator(); iterator
				.hasNext();) {
			DisponibilidadHoraria disponibilidadHoraria = iterator.next();

			result.add(createDTOForDisponibilidadHorariaType(disponibilidadHoraria));

		}

		return result;
	}

	public static DisponibilidadHorariaDTO createDTOForDisponibilidadHorariaType(
			DisponibilidadHoraria disponibilidadHoraria) {
		DisponibilidadHorariaDTO dto = new DisponibilidadHorariaDTO(
				disponibilidadHoraria.getOid(),
				disponibilidadHoraria.getDescripcion());
		return dto;
	}

	public static UbicacionDTO createDTOForUbicacion(Ubicacion ubicacion) {
		return new UbicacionDTO(ubicacion.getOid(), ubicacion.getCiudad(),
				ubicacion.getPais());
	}

	public static SkillDTO createDTOForSkill(Skill skill) {
		return new SkillDTO(skill.getOid(), skill.getDescripcion());
	}

	public static RoleITDTO createDTOForRoleIT(RoleIT role) {
		return new RoleITDTO(role.getOid(), role.getDescripcion());
	}
}
