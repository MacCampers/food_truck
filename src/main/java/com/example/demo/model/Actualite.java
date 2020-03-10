package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actualite")
public class Actualite {
	@Id
	@GeneratedValue
	private int id;
	
	private String title, imageUrl, description, dateCreation, dateFinValidité;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateFinValidité() {
		return dateFinValidité;
	}

	public void setDateFinValidité(String dateFinValidité) {
		this.dateFinValidité = dateFinValidité;
	}

	public Actualite(int id, String title, String imageUrl, String description, String dateCreation,
			String dateFinValidité) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.description = description;
		this.dateCreation = dateCreation;
		this.dateFinValidité = dateFinValidité;
	}

	public Actualite() {
	}

	@Override
	public String toString() {
		return "Actualite [id=" + id + ", title=" + title + ", imageUrl=" + imageUrl + ", description=" + description
				+ ", dateCreation=" + dateCreation + ", dateFinValidité=" + dateFinValidité + "]";
	}

}
