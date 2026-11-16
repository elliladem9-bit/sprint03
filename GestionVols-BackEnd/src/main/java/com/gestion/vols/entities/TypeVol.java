package com.gestion.vols.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TypeVol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idType;

	private String nomType;
	private String descriptionType;

	public TypeVol() {
	}

	public TypeVol(String nomType, String descriptionType) {
		this.nomType = nomType;
		this.descriptionType = descriptionType;
	}

	public Long getIdType() {
		return idType;
	}

	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public String getNomType() {
		return nomType;
	}

	public void setNomType(String nomType) {
		this.nomType = nomType;
	}

	public String getDescriptionType() {
		return descriptionType;
	}

	public void setDescriptionType(String descriptionType) {
		this.descriptionType = descriptionType;
	}
}
