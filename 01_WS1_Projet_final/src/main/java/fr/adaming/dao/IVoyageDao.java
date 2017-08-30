package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Voyage;

/**
 * Extention de l'interface Générique
 * Contient les méthodes CRUD
 * + [rien pour le moment]
 * @author projet blue
 *
 */
public interface IVoyageDao extends IGeneriqueDao<Voyage> {
	/**
	 * Méthode appelant la liste des voyages en BDD
	 * @return Liste des Voyages proposé par l'agence
	 */
	public List<Voyage> recupererTout();

	/**
	 * Méthode permettant de récupérer le détail d'un voyage
	 * @param identifiant de l'objet Voyage à récupérer en BDD
	 * @return un objet Voyage
	 */
	public Voyage recupererParId(int idVoyage);

	/**
	 * Méthode permettant de créer un voyage et de l'injecter en BDD
	 * @param l'objet Voyage à injecter en BDD
	 */
	public void creer(Voyage voyage);

	/**
	 * Méthode permettant de supprimer un voyage en BDD
	 * @param objet Voyage à supprimer de la BDD
	 */
	public void supprimer(Voyage voyage);

	/**
	 * Méthode permettant de mettre à jour un objet Voyage
	 * présent en BDD
	 * @param objet Voyage à modifier
	 * @return objet Voyage modifier
	 */
	public Voyage modifier(Voyage voyage);

}
