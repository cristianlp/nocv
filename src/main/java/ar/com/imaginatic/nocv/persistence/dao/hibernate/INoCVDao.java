package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import java.util.List;

import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.NoCVWorld;
import ar.com.imaginatic.nocv.domain.User;

public interface INoCVDao {

	public NoCVWorld getNoCVWorld();
	
	public void saveUser(User user);
	
	public List<User> findAllUsers();
	public User findUserById(String oid);
	
	
	//NoCVProfile
	public boolean saveNoCVProfile(NoCVProfile noCV);
	public NoCVProfile findNoCVProfileById(String oid);
}
