package com.formation.calculate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.formation.entity.Conversion;
import com.formation.entity.Devise;
import com.formation.service.ConversionService;
import com.formation.service.DeviseService;

@Service
public class CalculateService {
	
	@Autowired
	private DeviseService deviseService;
	@Autowired
	private ConversionService conversionService;
	
	/**
	 * METHODE CONVERTISSANT UN MONTANT D'UNE MONNAIE VERS UNE AUTRE MONNAIE
	 * @param montantDepart
	 * @param deviseDepart
	 * @param deviseDestination
	 * @return conversion (de type Conversion)
	 */
	public Conversion convertCurrency(double montantDepart, String deviseDepart, String deviseDestination) {
		
		double valeurUSD_deviseDepart= 0;
		double valeurUSD_deviseDestination=0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("methode: calculateService.convertCurrency:");
		System.out.println("date initialisée: "+dateFormat.format(date));
		
		
		System.out.println("devise depart: "+deviseDepart);
		System.out.println("devise destination: "+deviseDestination);
		
		// recuperation tableau de devises
		List<Devise> list = deviseService.getAllDevises();
		// parcours et affichage console de la list de devises
		for (Devise devise : list) {
			if(devise.getNom().equals(deviseDepart)) {
				System.out.println("valeur en dollar de la devise de depart: "+devise.getValeurUSD());
				valeurUSD_deviseDepart=devise.getValeurUSD();
			}
			if(devise.getNom().equals(deviseDestination)) {
				System.out.println("valeur en dollar de la devise de destination: "+devise.getValeurUSD());
				valeurUSD_deviseDestination=devise.getValeurUSD();
			}
		}
		
		//calcul de conversion
		double montantDestination = montantDepart * valeurUSD_deviseDepart / valeurUSD_deviseDestination;
		
		System.out.println("");
		System.out.println("montantDepart * valeurUSD_deviseDepart / valeurUSD_deviseDestination;");
		System.out.println("détail du calcul => "+montantDepart+" * "+valeurUSD_deviseDepart+"/"+valeurUSD_deviseDestination);
		
		//creation de l'objet conversion
		Conversion conversion = new Conversion(montantDepart, deviseDepart, deviseDestination, montantDestination, date);
		
//		conversion.setMontantDepart(montantDepart);
//		conversion.setMonnaieDepart(deviseDepart);
//		conversion.setMonnaieDestination(deviseDestination);
//		conversion.setMontantDestination(montantDestination);
//		conversion.setDate(date);
		
		
		return conversion;
	}
	
	/**
	 * METHODE QUI PERSISTE EN BASE UNE CONVERSION
	 * @param Conversion conversion
	 */
	public void addConversion (Conversion conversion) {
		conversionService.addConversion(conversion);
	}

}
