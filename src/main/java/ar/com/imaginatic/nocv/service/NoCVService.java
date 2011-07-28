package ar.com.imaginatic.nocv.service;

import ar.com.imaginatic.nocv.persistence.dao.hibernate.INoCVDao;

public class NoCVService {

	public INoCVDao getDao() {
		return dao;
	}

	public void setDao(INoCVDao dao) {
		this.dao = dao;
	}

	private INoCVDao dao;
	
}
