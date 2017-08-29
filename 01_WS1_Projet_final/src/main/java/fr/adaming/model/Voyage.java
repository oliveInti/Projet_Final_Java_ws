package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voyages")
public class Voyage implements Serializable{

	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	private int id_v;
	
	private String libelle;
	private String destination;
	private String description;
	private List<Date> datesDepart;
	private int duree;
	private String urlPhoto;
	private int prix;
	private int categorie;

	public Voyage() {
		super();

	}

	public Voyage(int id_v, String libelle, String destination, String description, List<Date> datesDepart, int duree,
			String urlPhoto, int prix, int categorie) {
		super();
		this.id_v = id_v;
		this.libelle = libelle;
		this.destination = destination;
		this.description = description;
		this.datesDepart = datesDepart;
		this.duree = duree;
		this.urlPhoto = urlPhoto;
		this.prix = prix;
		this.categorie = categorie;
	}

	public Voyage(String libelle, String destination, String description, List<Date> datesDepart, int duree,
			String urlPhoto, int prix, int categorie) {
		super();
		this.libelle = libelle;
		this.destination = destination;
		this.description = description;
		this.datesDepart = datesDepart;
		this.duree = duree;
		this.urlPhoto = urlPhoto;
		this.prix = prix;
		this.categorie = categorie;
	}

	public int getId_v() {
		return id_v;
	}

	public void setId_v(int id_v) {
		this.id_v = id_v;
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

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Voyage [id_v=" + id_v + ", " + (libelle != null ? "libelle=" + libelle + ", " : "")
				+ (destination != null ? "destination=" + destination + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (datesDepart != null ? "datesDepart=" + datesDepart + ", " : "") + "duree=" + duree + ", "
				+ (urlPhoto != null ? "urlPhoto=" + urlPhoto + ", " : "") + "prix=" + prix + ", categorie=" + categorie
				+ "]";
	}

}