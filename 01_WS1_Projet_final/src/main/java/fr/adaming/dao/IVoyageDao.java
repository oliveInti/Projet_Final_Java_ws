package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Voyage;

/**
 * Extention de l'interface G�n�rique
 * Contient les m�thodes CRUD
 * + [rien pour le moment]
 * @author projet blue
 *
 */
public interface IVoyageDao extends IGeneriqueDao<Voyage> {
	/**
	 * M�thode appelant la liste des voyages en BDD
	 * @return Liste des Voyages propos� par l'agence
	 */
	public List<Voyage> recupererTout();

	/**
	 * M�thode permettant de r�cup�rer le d�tail d'un voyage
	 * @param identifiant de l'objet Voyage � r�cup�rer en BDD
	 * @return un objet Voyage
	 */
	public Voyage recupererParId(int idVoyage);

	/**
	 * M�thode permettant de cr�er un voyage et de l'injecter en BDD
	 * @param l'objet Voyage � injecter en BDD
	 */
	public void creer(Voyage voyage);

	/**
	 * M�thode permettant de supprimer un voyage en BDD
	 * @param objet Voyage � supprimer de la BDD
	 */
	public void supprimer(Voyage voyage);

	/**
	 * M�thode permettant de mettre � jour un objet Voyage
	 * pr�sent en BDD
	 * @param objet Voyage � modifier
	 * @return objet Voyage modifier
	 */
	public Voyage modifier(Voyage voyage);

}
