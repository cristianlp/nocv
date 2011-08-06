package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.NoCVWorld;
import ar.com.imaginatic.nocv.domain.User;

public class NoCVDao extends HibernateDaoSupport implements INoCVDao {

	//Para automatizar algunas tareas mediante Hibernate
	private HibernateSchemaUtil hibernateSchemaUtil;

	public boolean saveNoCVProfile(NoCVProfile noCV) {
		getHibernateTemplate().save(noCV);
		
		//FIXME
		return true;
	}

	//NOCVProfile **********************************************************************************************
	
	public NoCVProfile findNoCVProfileById(String oid) {
		return (NoCVProfile) getHibernateTemplate().get(NoCVProfile.class, oid);
	}

	// The NOCV World ******************************************************************************************
	
	public NoCVWorld getNoCVWorld() {
		return getHibernateTemplate().get(NoCVWorld.class, "0");
	}
	
	// USER

	public void saveUser(User user) {
		getHibernateTemplate().save(user);
	}

	public List<User> findAllUsers() {

		List<User> l = getHibernateTemplate().findByNamedQuery("findAllUsers");

		return l;

	}

	@Override
	public User findUserById(String userOid) {
		// TODO Auto-generated method stub
		return (User) getHibernateTemplate().get(User.class, userOid);

	}

	// ********************************************************************************************************

	public void createSchema() {
		try {
			getHibernateTemplate().find("from User u");
			logger.info("La BD existe --> comienzo normal");
			System.out.println("no hubo excepcion ");
		} catch (Exception e) {
			System.out.println("creando esquema");
			logger.warn("La BD no existe --> se crea el esquema");
			hibernateSchemaUtil.createSchema();
		}
	}

	public HibernateSchemaUtil getHibernateSchemaUtil() {
		return hibernateSchemaUtil;
	}

	public void setHibernateSchemaUtil(HibernateSchemaUtil hibernateSchemaUtil) {
		this.hibernateSchemaUtil = hibernateSchemaUtil;
	}

}