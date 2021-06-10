package com.formation.dao;

import java.util.List;

import com.formation.entity.Devise;

public interface IDeviseDAO {
	
	List<Devise> getAllDevises();
	
	Devise getDeviseById(int deviseId);
	
//	void addDevise(Devise devise);
//	
//	void updateDevise(Devise devise);
//	
//	void deleteDevise(int deviseId);
//
//	boolean deviseExists(String nom);

}
