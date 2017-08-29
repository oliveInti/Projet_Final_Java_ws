package fr.adaming.model;

public class Commande {

	private int id;
	private Client client;
	private Voyage voyage;
	private String agence;
	private int nbAdulte;
	private int nbEnfant;
	private int prixTotal;

	public Commande() {
		super();

	}

	public Commande(int id, Client client, Voyage voyage, String agence, int nbAdulte, int nbEnfant, int prixTotal) {
		super();
		this.id = id;
		this.client = client;
		this.voyage = voyage;
		this.agence = agence;
		this.nbAdulte = nbAdulte;
		this.nbEnfant = nbEnfant;
		this.prixTotal = prixTotal;
	}

	public Commande(Client client, Voyage voyage, String agence, int nbAdulte, int nbEnfant, int prixTotal) {
		super();
		this.client = client;
		this.voyage = voyage;
		this.agence = agence;
		this.nbAdulte = nbAdulte;
		this.nbEnfant = nbEnfant;
		this.prixTotal = prixTotal;
	}

	public Commande(Voyage voyage, String agence, int nbAdulte, int nbEnfant, int prixTotal) {
		super();
		this.voyage = voyage;
		this.agence = agence;
		this.nbAdulte = nbAdulte;
		this.nbEnfant = nbEnfant;
		this.prixTotal = prixTotal;
	}

	public Commande(String agence, int nbAdulte, int nbEnfant, int prixTotal) {
		super();
		this.agence = agence;
		this.nbAdulte = nbAdulte;
		this.nbEnfant = nbEnfant;
		this.prixTotal = prixTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public int getNbAdulte() {
		return nbAdulte;
	}

	public void setNbAdulte(int nbAdulte) {
		this.nbAdulte = nbAdulte;
	}

	public int getNbEnfant() {
		return nbEnfant;
	}

	public void setNbEnfant(int nbEnfant) {
		this.nbEnfant = nbEnfant;
	}

	public int getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", " + (client != null ? "client=" + client + ", " : "")
				+ (voyage != null ? "voyage=" + voyage + ", " : "") + (agence != null ? "agence=" + agence + ", " : "")
				+ "nbAdulte=" + nbAdulte + ", nbEnfant=" + nbEnfant + ", prixTotal=" + prixTotal + "]";
	}

}
