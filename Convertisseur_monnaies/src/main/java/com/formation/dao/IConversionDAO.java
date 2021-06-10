package com.formation.dao;

import java.util.List;

import com.formation.entity.Conversion;
import com.formation.entity.Devise;

public interface IConversionDAO {

	List<Conversion> getAllConversions();
	
//	List<Conversion> getAllConversions(int userId);
	
	Conversion getConversionById(int conversionId);
	
	void addConversion(Conversion conversion);
	
//	void updateConversion(Conversion conversion);
//	
//	void deleteConversion(int conversionId);

//	boolean conversionExists(int conversionid);
}
