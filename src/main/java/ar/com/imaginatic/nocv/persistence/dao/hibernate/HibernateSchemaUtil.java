package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class HibernateSchemaUtil {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String driverClassName;

	private String url;

	private String username;

	private String password;

	private String hibernateDialect;
	
	private String[] mappingResources;

	public void createSchema() {
		Configuration cfg = new Configuration();

		cfg.setProperty("hibernate.connection.driver_class", driverClassName);
		cfg.setProperty("hibernate.connection.url", url);
		cfg.setProperty("hibernate.connection.username", username);
		cfg.setProperty("hibernate.connection.password", password);

		cfg.setProperty("hibernate.dialect", hibernateDialect);

		for (String resource : mappingResources) {
            cfg.addResource(resource);
        } 
		
		logger.info("COMIENZO CREACION DEL ESQUEMA DE BASE DE DATOS");
		new SchemaExport(cfg).drop(true, true);
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);
		logger.info("FIN CREACION DEL ESQUEMA DE BASE DE DATOS");
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHibernateDialect() {
		return hibernateDialect;
	}

	public void setHibernateDialect(String hibernateDialect) {
		this.hibernateDialect = hibernateDialect;
	}

	public String[] getMappingResources() {
		return mappingResources;
	}

	public void setMappingResources(String[] mappingResources) {
		this.mappingResources = mappingResources;
	}
}
