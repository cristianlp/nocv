package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import java.util.List;

import ar.com.imaginatic.nocv.domain.User;

public interface INoCVDao {

	public void saveUser(User user);
	
	public List<User> findAllUsers();
	public User findUserById(String oid);
	
}
