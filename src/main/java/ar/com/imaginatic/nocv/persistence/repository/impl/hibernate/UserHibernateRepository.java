package ar.com.imaginatic.nocv.persistence.repository.impl.hibernate;

import java.util.ArrayList;
import java.util.List;

import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.persistence.repository.I_UserRepository;

public class UserHibernateRepository implements I_UserRepository {

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> users =  new ArrayList<User>();
		users.add(new User("juancho"));
		users.add(new User("peter"));
		
		return users;
	}

	@Override
	public User findById(String userOid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User user) {
		System.out.println("insertando --> " + user.getUsername());
		return null;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(String userOid) {
		// TODO Auto-generated method stub
		return false;
	}

}
