package com.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.formation.dao.IDeviseDAO;
import com.formation.entity.Devise;

@Service
public class DeviseService implements IDeviseService {
	
	@Autowired
	private IDeviseDAO deviseDAO;
	
	@Override
	public Devise getDeviseById(int deviseId) {
		Devise obj = deviseDAO.getDeviseById(deviseId);
		return obj;
	}

	@Override
	public List<Devise> getAllDevises() {
		return deviseDAO.getAllDevises();
	}

//	@Override
//	public synchronized boolean addArticle(Article article) {
//		if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
//			return false;
//		}else {
//			articleDAO.addArticle(article);
//			return true;
//		}
//	}
//
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
	

}
