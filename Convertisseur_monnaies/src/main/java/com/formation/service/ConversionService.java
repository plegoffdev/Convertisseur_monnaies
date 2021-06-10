package com.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dao.IConversionDAO;
import com.formation.entity.Conversion;

@Service
public class ConversionService implements IConversionService {
	
	@Autowired
	private IConversionDAO conversionDAO;
	
	@Override
	public List<Conversion> getAllConversions() {
		return conversionDAO.getAllConversions();
	}

	@Override
	public Conversion getConversionById(int conversionId) {
		Conversion obj = conversionDAO.getConversionById(conversionId);
		return obj;
	}

		@Override
	public synchronized boolean addConversion(Conversion conversion) {
//		if (conversionDAO.conversionExists(conversion.getConversionId())) {
//			return false;
//		}else {
			conversionDAO.addConversion(conversion);
			return true;
//		}
	}

//	@Override
//	public void updateArticle(Article article) {
//		articleDAO.updateArticle(article);
//
//	}
//
//	@Override
//	public void deleteArticle(int articleId) {
//		articleDAO.deleteArticle(articleId);
//
//	}
		
//		public boolean conversionExists(int conversionId) {
//			return conversionDAO.conversionExists(conversionId);
//		};
	

}