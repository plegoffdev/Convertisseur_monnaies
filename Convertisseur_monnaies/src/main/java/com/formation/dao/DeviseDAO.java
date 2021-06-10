package com.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.entity.Devise;

@Transactional
@Repository
public class DeviseDAO implements IDeviseDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Devise getDeviseById(int deviseId) {
		return entityManager.find(Devise.class, deviseId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Devise> getAllDevises() {
		String hql = "FROM Devise dev ORDER BY dev.deviseId";
		return (List<Devise>) entityManager.createQuery(hql).getResultList();
	}

//	@Override
//	public void addArticle(Article article) {
//		entityManager.persist(article);
//
//	}
//
//	@Override
//	public void updateArticle(Article article) {
//		Article artcl = getArticleById(article.getArticleId());
//		artcl.setTitle(article.getTitle());
//		artcl.setCategory(article.getCategory());
//		entityManager.flush();
//
//	}
	
//	@Override
//	public void updateArticle(Article article) {//A implementer
//	Article a = entityManager.find(Article.class, article.getArticleId()); // return null if entity doesn't exist
//	if( a == null) {
//	System.err.println("update failed : no ArticleId exists in persistence context");
//	}else {
//	a = entityManager.merge(article); //--> set persistence context in given entity state
//	System.err.println("update success");
//	}
//
//	}
//
//	@Override
//	public void deleteArticle(int articleId) {
//		entityManager.remove(getArticleById(articleId));
//
//	}
//
//	@Override
//	public boolean articleExists(String title, String category) {
//		String hql = "FROM Article as a WHERE a.title = :title and a.category = :category";
//	    int count = entityManager.createQuery(hql).setParameter("title", title)
//	            .setParameter("category", category).getResultList().size();
//	    if(count >0) {
//	    	return true;
//	    }else {
//	    	return false;
//	    }
//	}
	
	

}
