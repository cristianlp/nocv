package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.User;


public class NoCVDao extends HibernateDaoSupport implements INoCVDao {
    
       
    public void saveNoCV(NoCVProfile noCV) {
        getHibernateTemplate().merge(noCV);
    }
    
    public NoCVProfile loadNoCV(long id) {
        return (NoCVProfile) getHibernateTemplate().get(NoCVProfile.class, id);
    }
    
    
    //USER
    
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
		return null;
	}
    

    
    
}