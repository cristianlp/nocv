package ar.com.imaginatic.nocv.persistence.dao.hibernate;

import java.util.List;

import ar.com.imaginatic.nocv.domain.DisponibilidadHoraria;
import ar.com.imaginatic.nocv.domain.NoCVProfile;
import ar.com.imaginatic.nocv.domain.NoCVWorld;
import ar.com.imaginatic.nocv.domain.User;

public interface INoCVDao {

	public NoCVWorld getNoCVWorld();
	
	public void saveUser(String username, String nombre, String password, String email, boolean activo);
	
	public List<User> findAllActiveUsers();
	public User findUserById(String oid);
	
	
	//NoCVProfile
	public boolean saveNoCVProfile(NoCVProfile noCV);
	public NoCVProfile findNoCVProfileById(String oid);


	public List<DisponibilidadHoraria> findAllDisponibilidadHoraria();

	public DisponibilidadHoraria findDisponibilidadHorariaById(String oid);
}
