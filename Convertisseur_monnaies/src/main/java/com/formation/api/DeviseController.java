package com.formation.api;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.formation.entity.Devise;
import com.formation.service.IDeviseService;

@Controller
@RequestMapping("devises")
public class DeviseController {
	
		@Autowired
		private IDeviseService deviseService;
		
		@GetMapping("devise/{id}")
		public ResponseEntity<Devise> getArticleById(@PathVariable("id") Integer id) {
			Devise article = deviseService.getDeviseById(id);
			return new ResponseEntity<Devise>(article, HttpStatus.OK);
		}
		
		@GetMapping("getall")
		public ResponseEntity<List<Devise>> getAllDevises() {
			List<Devise> list = deviseService.getAllDevises();
			return new ResponseEntity<List<Devise>>(list, HttpStatus.OK);
		}
		
		
//		@PostMapping("article")
//		public ResponseEntity<Void> addArticle(@RequestBody Article article,
//				UriComponentsBuilder builder) {
//			boolean flag = articleService.addArticle(article);
//			if (flag == false) {
//	    	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//	    }
//			
//	        HttpHeaders headers = new HttpHeaders();
//	        headers.setLocation(builder.path("/article/{id}")
//	        		.buildAndExpand(article.getArticleId()).toUri());
//	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//		}
//		
//		
//		
//		@PutMapping("article")
//		public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
//			articleService.updateArticle(article);
//			return new ResponseEntity<Article>(article, HttpStatus.OK);
//		}
//		@DeleteMapping("article/{id}")
//		public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
//			articleService.deleteArticle(id);
//			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//		}
//		
//		@PostMapping("articlemulti")
//		public ResponseEntity<List<Article>> addMultiArticles(@RequestBody List<Article> articlesList) {
//			articleService.addMultiArticles(articlesList);
//			return new ResponseEntity<List<Article>>(articlesList, HttpStatus.OK);
//			
//		}

}
