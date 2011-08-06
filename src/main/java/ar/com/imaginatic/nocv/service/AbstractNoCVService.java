package ar.com.imaginatic.nocv.service;

import ar.com.imaginatic.nocv.persistence.dao.hibernate.INoCVDao;

public abstract class AbstractNoCVService {

	private INoCVDao dao;

	// private MailSender mailSender;
	// private PasswordEncoder passwordEncoder;

	public INoCVDao getDao() {
		return dao;
	}

	public void setDao(INoCVDao dao) {
		this.dao = dao;
	}

}
