package com.formation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="conversions")
public class Conversion implements Serializable {
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="conversion_id")
		private int conversionId;
		@Column(name="montant_depart")
		private double montantDepart;
		@Column(name="monnaie_depart")
		private String monnaieDepart;
		@Column(name="monnaie_destination")
		private String monnaieDestination;
		@Column(name="montant_destination")
		private double montantDestination;
		@Column(name="date")
		private Date date;
		
		
		public Conversion() {
			
		}


		/**
		 * @param conversionId
		 * @param montantDepart
		 * @param monnaieDepart
		 * @param monnaieDestination
		 * @param montantDestination
		 * @param date
		 */
		public Conversion(int conversionId, double montantDepart, String monnaieDepart,
				String monnaieDestination, double montantDestination, Date date) {
			super();
			this.conversionId = conversionId;
			this.montantDepart = montantDepart;
			this.monnaieDepart = monnaieDepart;
			this.monnaieDestination = monnaieDestination;
			this.montantDestination = montantDestination;
			this.date = date;
		}
		

		/**
		 * CE CONSTRUCTEUR EST UTILISE DANS CONVERT CURRENCY
		 * @param montantDepart
		 * @param monnaieDepart
		 * @param monnaieDestination
		 * @param montantDestination
		 * @param date
		 */
		public Conversion(double montantDepart, String monnaieDepart, String monnaieDestination,
				double montantDestination, Date date) {
			super();
			this.montantDepart = montantDepart;
			this.monnaieDepart = monnaieDepart;
			this.monnaieDestination = monnaieDestination;
			this.montantDestination = montantDestination;
			this.date = date;
		}


		/**
		 * @return the conversionId
		 */
		public int getConversionId() {
			return conversionId;
		}


		/**
		 * @param conversionId the conversionId to set
		 */
		public void setConversionId(int conversionId) {
			this.conversionId = conversionId;
		}


		/**
		 * @return the montantDepart
		 */
		public double getMontantDepart() {
			return montantDepart;
		}


		/**
		 * @param montantDepart the montantDepart to set
		 */
		public void setMontantDepart(double montantDepart) {
			this.montantDepart = montantDepart;
		}


		/**
		 * @return the monnaieDepart
		 */
		public String getMonnaieDepart() {
			return monnaieDepart;
		}


		/**
		 * @param monnaieDepart the monnaieDepart to set
		 */
		public void setMonnaieDepart(String monnaieDepart) {
			this.monnaieDepart = monnaieDepart;
		}


		/**
		 * @return the monnaieDestination
		 */
		public String getMonnaieDestination() {
			return monnaieDestination;
		}


		/**
		 * @param monnaieDestination the monnaieDestination to set
		 */
		public void setMonnaieDestination(String monnaieDestination) {
			this.monnaieDestination = monnaieDestination;
		}


		/**
		 * @return the montantDestination
		 */
		public double getMontantDestination() {
			return montantDestination;
		}


		/**
		 * @param montantDestination the montantDestination to set
		 */
		public void setMontantDestination(double montantDestination) {
			this.montantDestination = montantDestination;
		}


		/**
		 * @return the date
		 */
		public Date getDate() {
			return date;
		}


		/**
		 * @param date the date to set
		 */
		public void setDate(Date date) {
			this.date = date;
		}


		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public String toString() {
			return "Conversion [conversionId=" + conversionId + ", montantDepart="
					+ montantDepart + ", monnaieDepart=" + monnaieDepart + ", monnaieDestination=" + monnaieDestination
					+ ", montantDestination=" + montantDestination + ", date=" + date + "]";
		}

		
		
	
}
