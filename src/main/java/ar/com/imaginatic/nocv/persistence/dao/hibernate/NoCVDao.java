package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.imaginatic.nocv.domain.NoCV;
import ar.com.imaginatic.nocv.domain.User;


public class NoCVDao extends HibernateDaoSupport implements INoCVDao {
    
       
    public void saveNoCV(NoCV noCV) {
        getHibernateTemplate().merge(noCV);
    }
    
    public NoCV loadNoCV(long id) {
        return (NoCV) getHibernateTemplate().get(NoCV.class, id);
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