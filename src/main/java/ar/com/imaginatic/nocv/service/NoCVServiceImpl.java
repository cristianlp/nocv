package ar.com.imaginatic.nocv.service;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.util.Constants;
import ar.com.imaginatic.nocv.web.dto.DTOFactory;
import ar.com.imaginatic.nocv.web.dto.NoCVProfileDTO;
import ar.com.imaginatic.nocv.web.dto.UserDTO;

public class NoCVServiceImpl extends AbstractNoCVService implements NoCVService {

	private static final Logger logger = LoggerFactory
			.getLogger(NoCVServiceImpl.class);

	// USER
	public boolean addUser(UserDTO userDTO) {
		// TODO chequear que no exista, etc, etc

		// Code Complete --> enviar la menor cantidad de datos --> menos
		// acoplamiento
		this.getDao()
				.getNoCVWorld()
				.addUser(userDTO.getUsername(), userDTO.getNombre(),
						userDTO.getPassword(), userDTO.getEmail());

		// FIXME
		return true;

	}

	public Collection<UserDTO> getAllUsers() {
		List<User> users = this.getDao().findAllUsers();
		Collection <UserDTO> dtos = DTOFactory.createDTOForUsers(users);
		
		return dtos;
		
	}

	@Override
	public UserDTO getUserById(String oid) {

		User user = this.getDao().findUserById(oid);
		UserDTO dto = DTOFactory.createDTOForUser(user);
		
		return dto;
	}

	// NOCVProfile

	public boolean addNoCVProfile(NoCVProfileDTO noCVDTO) {

		NoCVProfile noCV = this.getDao().findNoCVProfileById(noCVDTO.getOid());

		String oid = Constants.getRamdomId();
		noCV.setOid(oid);

		this.getDao().saveNoCVProfile(noCV);

		// FIXME
		return true;
	}

}
