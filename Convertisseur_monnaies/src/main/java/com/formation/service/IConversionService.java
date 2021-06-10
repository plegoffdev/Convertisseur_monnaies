package com.formation.service;

import java.util.List;

import com.formation.entity.Conversion;
import com.formation.entity.Devise;

public interface IConversionService {
	
	
	List<Conversion> getAllConversions();
	
	Conversion getConversionById(int conversionId);
	
	boolean addConversion(Conversion conversion);
	
//	void updateConversion(Conversion conversion);
//	
//	void deleteConversion(int conversionId);

//	boolean conversionExists(int conversionId);

}
