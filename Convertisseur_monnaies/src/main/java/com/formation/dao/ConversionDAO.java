package com.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.entity.Conversion;

@Transactional
@Repository
public class ConversionDAO implements IConversionDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
//	@Override
//	public List<Conversion> getAllConversions(int userId){
//		return null;
//	};

	@Override
	public Conversion getConversionById(int conversionId) {
		return entityManager.find(Conversion.class, conversionId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Conversion> getAllConversions() {
		String hql = "FROM Conversion conv ORDER BY conv.conversionId";
		return (List<Conversion>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void addConversion(Conversion conversion) {
		entityManager.persist(conversion);

	}

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

//	@Override
//	public boolean conversionExists(int conversionid) {
//		String hql = "FROM Conversion conv WHERE conv.conversion_id = :conversionid";
//	    int count = entityManager.createQuery(hql).setParameter("conversionid", conversionid)
//	            .getResultList().size();
//	    if(count >0) {
//	    	return true;
//	    }else {
//	    	return false;
//	    }
//	}
	
	
	
}
