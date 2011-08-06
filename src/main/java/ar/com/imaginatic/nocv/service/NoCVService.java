package ar.com.imaginatic.nocv.service;

import java.util.Collection;

import ar.com.imaginatic.nocv.web.dto.NoCVProfileDTO;
import ar.com.imaginatic.nocv.web.dto.UserDTO;

public interface NoCVService {

	
	//USER
	public boolean addUser(UserDTO user);
	public Collection<UserDTO> getAllUsers();
	public UserDTO getUserById(String oid);
	
	
	//NOCVProfile
	public boolean addNoCVProfile(NoCVProfileDTO noCV);
	
}
