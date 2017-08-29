package fr.adaming.model;

public class Client {

	private int id_c;
	private String nom;
	private String prenom;
	private String mail;
	private String mdp;
	private Boolean admin;

	public Client() {
		super();

	}

	public Client(int id_c, String nom, String prenom, String mail, String mdp, Boolean admin) {
		super();
		this.id_c = id_c;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.mdp = mdp;
		this.admin = admin;
	}

	public Client(String nom, String prenom, String mail, String mdp, Boolean admin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.mdp = mdp;
		this.admin = admin;
	}

	public int getId_c() {
		return id_c;
	}

	public void setId_c(int id_c) {
		this.id_c = id_c;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

}
