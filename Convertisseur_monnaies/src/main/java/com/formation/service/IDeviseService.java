package com.formation.service;

import java.util.List;

import com.formation.entity.Devise;

public interface IDeviseService {

	List<Devise> getAllDevises();
	
	Devise getDeviseById(int deviseId);
    
//    boolean addDevise(Devise devise);
//    
//    void updateDevise(Devise devise);
//    
//    void deleteDevise(int deviseId);
}
