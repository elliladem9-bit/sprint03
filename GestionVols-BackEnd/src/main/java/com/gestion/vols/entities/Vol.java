package com.gestion.vols.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVol;

	private String numeroVol;
	private String compagnie;
	private String destination;
	private double prixBillet;
	private LocalDate dateDepart;

	@ManyToOne
	private TypeVol type;

	public Vol() {
	}

	public Vol(String numeroVol, String compagnie, String destination, TypeVol type, double prixBillet,
			LocalDate dateDepart) {
		this.numeroVol = numeroVol;
		this.compagnie = compagnie;
		this.destination = destination;
		this.type = type;
		this.prixBillet = prixBillet;
		this.dateDepart = dateDepart;
	}

	public Long getIdVol() {
		return idVol;
	}

	public void setIdVol(Long idVol) {
		this.idVol = idVol;
	}

	public String getNumeroVol() {
		return numeroVol;
	}

	public void setNumeroVol(String numeroVol) {
		this.numeroVol = numeroVol;
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrixBillet() {
		return prixBillet;
	}

	public void setPrixBillet(double prixBillet) {
		this.prixBillet = prixBillet;
	}

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public TypeVol getType() {
		return type;
	}

	public void setType(TypeVol type) {
		this.type = type;
	}
}
