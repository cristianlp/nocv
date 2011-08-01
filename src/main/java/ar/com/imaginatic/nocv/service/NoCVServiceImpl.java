package ar.com.imaginatic.nocv.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.com.imaginatic.nocv.domain.User;
import ar.com.imaginatic.nocv.persistence.dao.hibernate.INoCVDao;
import ar.com.imaginatic.nocv.util.Constants;

public class NoCVServiceImpl implements NoCVService{

	private static final Logger logger = LoggerFactory.getLogger(NoCVServiceImpl.class);
	
	private INoCVDao dao;
	//private MailSender mailSender;
	//private PasswordEncoder passwordEncoder;
	
	public INoCVDao getDao() {
		return dao;
	}

	public void setDao(INoCVDao dao) {
		this.dao = dao;
	}
	
	public boolean saveUser(User user) {
		//TODO chequear que no exista, etc, etc
		
		String oid = Constants.generateRamdomId();
		user.setOid(oid);
		
		this.dao.saveUser(user);
		
		//FIXME
		return true;
		
	}

	public List<User> findAllUsers() {
		return this.dao.findAllUsers();
	}
	
	
}
