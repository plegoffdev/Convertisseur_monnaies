package com.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.calculate.CalculateService;
import com.formation.dao.IDeviseDAO;
import com.formation.entity.Conversion;
import com.formation.entity.Devise;
import com.formation.service.IConversionService;
import com.formation.service.IDeviseService;

@Component
public class TestAppli {
	
	@Autowired
	private IDeviseService deviseService;
	
	@Autowired
	private IConversionService conversionService;
	
	@Autowired
	private CalculateService calculateService;
		
	public void launchtest() {
		
//		System.out.println("");
//		System.out.println("");
//		System.out.println("/*********** TEST GET ALL DEVISES ( deviseService.getAllDevises() )**************/");
//		System.out.println("");
//		// recuperation tableau de devises
//		List<Devise> list = deviseService.getAllDevises();
//		// parcours et affichage console de la list de devises
//		for (Devise devise : list) {
//			System.out.println(devise);
//		}
//		
//		System.out.println("");
//		System.out.println("");
//		System.out.println("/*********** TEST GET ALL CONVERSIONS ( conversionService.getAllConversionss() ) **************/");
//		System.out.println("");
//		
//		// recuperation tableau de devises
//		List<Conversion> listConv = conversionService.getAllConversions();
//				// parcours et affichage console de la list de devises
//				for (Conversion conversion : listConv) {
//					System.out.println(conversion);
//				}
//		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("/*********** TEST CONVERT CURRENCY ( calculateService.convertCurrency() ) **************/");
		System.out.println("");
		
		System.out.println("test avec montant = 100 , deviseDepart = 'EUR' , deviseDestination ='USD':");
		System.out.println("");
		Conversion conv1 =calculateService.convertCurrency(100, "EUR", "USD");
			
		System.err.println("retour de l'objet Conversion APRES CALCUL de calculateService.convertCurrency(): \n"+"=> "+conv1);
		
		

//		System.out.println("");
//		System.out.println("/*********** TEST ADD CONVERSION ( conversionService.addConversion() )**************/");
//		System.out.println("");
//		
//		conversionService.addConversion(conv1);
//		System.out.println("");
//		
		
		
		
		System.out.println("");
		System.out.println("");
		
		
	}


}
