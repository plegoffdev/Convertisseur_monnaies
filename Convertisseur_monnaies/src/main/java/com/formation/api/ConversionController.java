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

import com.formation.calculate.CalculateService;
import com.formation.entity.Conversion;
import com.formation.entity.Devise;
import com.formation.service.ConversionService;
import com.formation.service.IDeviseService;

@Controller
@RequestMapping("conversions")
public class ConversionController {
	
		@Autowired
		private CalculateService calculateService;
		
		@Autowired
		private ConversionService conversionService;
		
//		@GetMapping("devise/{id}")
//		public ResponseEntity<Devise> getArticleById(@PathVariable("id") Integer id) {
//			Devise article = deviseService.getDeviseById(id);
//			return new ResponseEntity<Devise>(article, HttpStatus.OK);
//		}
		
		@GetMapping("getall")
		public ResponseEntity<List<Conversion>> getAllConversions() {
			List<Conversion> list = conversionService.getAllConversions();
			return new ResponseEntity<List<Conversion>>(list, HttpStatus.OK);
		}
		
		@PostMapping("convert")
		public ResponseEntity<Conversion> calculateService(@RequestBody Conversion conversionData,
				UriComponentsBuilder builder) {
			Conversion conv= calculateService.convertCurrency(conversionData.getMontantDepart(), conversionData.getMonnaieDepart(), conversionData.getMonnaieDestination());
			System.err.println("calcul conversion dans mapping convert"+conv);
			calculateService.addConversion(conv);
			return new ResponseEntity<Conversion>(conv, HttpStatus.OK);
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
