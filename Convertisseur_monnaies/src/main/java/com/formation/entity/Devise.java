package com.formation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="devises")
public class Devise implements Serializable {
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="devise_id")
		private int deviseId;
		@Column(name="nom")
		private String nom;
		@Column(name="valeur_usd")
		private double valeurUSD;
		
		public Devise() {
			
		}
		
		/**
		 * @param deviseId
		 * @param nom
		 * @param valeurUSD
		 */
		public Devise(int deviseId, String nom, double valeurUSD) {
			super();
			this.deviseId = deviseId;
			this.nom = nom;
			this.valeurUSD = valeurUSD;
		}

		/**
		 * @return the deviseId
		 */
		public int getDeviseId() {
			return deviseId;
		}

		/**
		 * @param deviseId the deviseId to set
		 */
		public void setDeviseId(int deviseId) {
			this.deviseId = deviseId;
		}

		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/**
		 * @return the valeurUSD
		 */
		public double getValeurUSD() {
			return valeurUSD;
		}

		/**
		 * @param valeurUSD the valeurUSD to set
		 */
		public void setValeurUSD(double valeurUSD) {
			this.valeurUSD = valeurUSD;
		}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Devise [deviseId=" + deviseId + ", nom=" + nom + ", valeurUSD=" + valeurUSD + "]";
		}
		
		
		
		
		
}
