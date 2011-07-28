package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.imaginatic.nocv.domain.NoCV;


public class NoCVDao extends HibernateDaoSupport implements INoCVDao {
    
       
    public void saveNoCV(NoCV noCV) {
        getHibernateTemplate().merge(noCV);
    }
    
    public NoCV loadNoCV(long id) {
        return (NoCV) getHibernateTemplate().get(NoCV.class, id);
    }
    
    public List<NoCV> findNoCVs() {
        Object[] params = new Object[] {};
        return getHibernateTemplate().find("", params);
    }
    

    
    
}