package ar.com.imaginatic.nocv.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.com.imaginatic.nocv.domain.DisponibilidadHoraria;
import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.NoCVType;
import ar.com.imaginatic.nocv.domain.Skill;
import ar.com.imaginatic.nocv.domain.Ubicacion;
import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.util.Constants;
import ar.com.imaginatic.nocv.util.SkillsParser;
import ar.com.imaginatic.nocv.web.dto.DTOFactory;
import ar.com.imaginatic.nocv.web.dto.DisponibilidadHorariaDTO;
import ar.com.imaginatic.nocv.web.dto.NoCVProfileDTO;
import ar.com.imaginatic.nocv.web.dto.NoCVPublicProfileDTO;
import ar.com.imaginatic.nocv.web.dto.UserDTO;

public class NoCVServiceImpl extends AbstractNoCVService implements NoCVService {

	private static final Logger logger = LoggerFactory
			.getLogger(NoCVServiceImpl.class);

	// USER
	public boolean addUser(UserDTO userDTO) {
		// TODO chequear que no exista, etc, etc

		// Code Complete --> enviar la menor cantidad de datos --> menos
		// acoplamiento
		this.getDao().saveUser(userDTO.getUsername(), userDTO.getNombre(),
				userDTO.getPassword(), userDTO.getEmail(), false);

		// FIXME
		return true;

	}

	public Collection<UserDTO> getAllUsers() {
		List<User> users = this.getDao().findAllActiveUsers();
		
		
		
		Collection<UserDTO> dtos = DTOFactory.createDTOForUsers(users);

		return dtos;

	}

	@Override
	public UserDTO getUserById(String oid) {

		User user = this.getDao().findUserById(oid);

		// TODO CHEQUEAR NOCV != NULL

		UserDTO dto = DTOFactory.createDTOForUser(user);

		return dto;
	}

	// NOCVProfile

	public UserDTO addNoCVProfile(String userOid, NoCVProfileDTO noCVDTO) {

		User user = this.getDao().findUserById(userOid);

		DisponibilidadHoraria dh = this.getDao().findDisponibilidadHorariaById(
				noCVDTO.getDisponibilidadHorariaType().getOid());

		// FIXME
		NoCVType type = this.getDao().findNoCVType("1");

		Ubicacion ubicacion = new Ubicacion(noCVDTO.getPais(),
				noCVDTO.getCiudad(), noCVDTO.getObservacionesUbicacion());
		ubicacion.setOid(Constants.getRamdomId());

		Collection<Skill> skills = SkillsParser.parse(noCVDTO.getSkills());
		// Set<RoleIT> roles = RoleITParser.parse(noCVDTO.getRolesIT());

		NoCVProfile nocv = new NoCVProfile(noCVDTO.getTitulo(),
				noCVDTO.getResumen(), type, ubicacion, dh, skills);

		// SE ACTIVA EL USUARIO
		user.setActivo(true);
		user.setNoCVProfile(nocv);

		UserDTO dto = DTOFactory.createDTOForUser(user);

		return dto;
	}

	public NoCVPublicProfileDTO getPublicProfileByUserId(String userOid) {
		User user = this.getDao().findUserById(userOid);
		NoCVPublicProfileDTO dto = DTOFactory
				.createDTOForNoCVPublicProfile(user);

		return dto;

	}

	public List<DisponibilidadHorariaDTO> getAllDisponibilidadHorariaTypes() {
		List<DisponibilidadHoraria> types = this.getDao()
				.findAllDisponibilidadHoraria();
		List<DisponibilidadHorariaDTO> dtos = DTOFactory
				.createDTOForDisponibilidadHorariaTypes(types);

		return dtos;
	}

}
