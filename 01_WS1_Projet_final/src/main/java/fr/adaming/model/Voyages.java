package fr.adaming.model;

import java.util.Date;
import java.util.List;

public class Voyages {

	private int id_v;
	private String libelle;
	private String destination;
	private String description;
	private List<Date> datesDepart;
	private int duree;
	private String urlPhoto;
	private int prix;

	public Voyages() {
		super();

	}

	public Voyages(int id, String libelle, String destination, String description, List<Date> datesDepart, int duree,
			String urlPhoto, int prix) {
		super();
		this.id_v = id;
		this.libelle = libelle;
		this.destination = destination;
		this.description = description;
		this.datesDepart = datesDepart;
		this.duree = duree;
		this.urlPhoto = urlPhoto;
		this.prix = prix;
	}

	public Voyages(String libelle, String destination, String description, List<Date> datesDepart, int duree,
			String urlPhoto, int prix) {
		super();
		this.libelle = libelle;
		this.destination = destination;
		this.description = description;
		this.datesDepart = datesDepart;
		this.duree = duree;
		this.urlPhoto = urlPhoto;
		this.prix = prix;
	}

	public int getId() {
		return id_v;
	}

	public void setId(int id) {
		this.id_v = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Date> getDatesDepart() {
		return datesDepart;
	}

	public void setDatesDepart(List<Date> datesDepart) {
		this.datesDepart = datesDepart;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
