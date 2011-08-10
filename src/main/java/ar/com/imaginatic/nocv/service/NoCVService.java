package ar.com.imaginatic.nocv.service;

import java.util.Collection;
import java.util.List;

import ar.com.imaginatic.nocv.web.dto.DisponibilidadHorariaDTO;
import ar.com.imaginatic.nocv.web.dto.NoCVProfileDTO;
import ar.com.imaginatic.nocv.web.dto.NoCVPublicProfileDTO;
import ar.com.imaginatic.nocv.web.dto.UserDTO;

public interface NoCVService {

	
	//USER
	public boolean addUser(UserDTO user);
	public Collection<UserDTO> getAllUsers();
	public UserDTO getUserById(String oid);
	
	
	//NOCVProfile
	public UserDTO addNoCVProfile(String userOid, NoCVProfileDTO noCV);
	public NoCVPublicProfileDTO getPublicProfileByUserId(String userOid);
	
	public List<DisponibilidadHorariaDTO> getAllDisponibilidadHorariaTypes();
	
	
}
