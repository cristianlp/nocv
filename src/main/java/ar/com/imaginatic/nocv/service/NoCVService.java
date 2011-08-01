package ar.com.imaginatic.nocv.service;

import java.util.List;

import ar.com.imaginatic.nocv.domain.User;

public interface NoCVService {

	public boolean saveUser(User user);
	public List<User> findAllUsers();
	
}
