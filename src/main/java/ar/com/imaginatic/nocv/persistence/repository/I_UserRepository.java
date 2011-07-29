package ar.com.imaginatic.nocv.persistence.repository;

import java.util.List;

import ar.com.imaginatic.nocv.domain.User;

public interface I_UserRepository {

	public List<User> findAll();

	public User findById(String userOid);

	public User save(User user);

	public boolean update(User user);

	public boolean deleteById(String userOid);

}
