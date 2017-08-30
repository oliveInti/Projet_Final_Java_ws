package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.adaming.model.Commande;
/**
 * 
 * @author projet blue
 *
 */

//Implémentation DAO de l'interface générique DAO
public class CommandeDaoImpl implements IGeneriqueDao<Commande> {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Commande> recupererTout() {
		// ouvrir une session (bus de données -> bud)
		Session s = sf.getCurrentSession();
		// la requête HQL
		String req = "FROM Commande";

		Query query = s.createQuery(req);

		// envoie de la requête et récupération du résultat
		@SuppressWarnings("unchecked")
		List<Commande> listeCommandes = query.list();

		return listeCommandes;
	}

	@Override
	public Commande recupererParId(int idCommande) {
		Session s = sf.getCurrentSession();
		Commande varCommande = (Commande) s.get(Commande.class, idCommande);
		return varCommande;
	}

	// implémentation de la méthode créer pour une commande
	@Override
	public void creer(Commande commande) {
		Session s = sf.getCurrentSession();
		s.save(commande);
	}

	@Override
	public void supprimer(Commande commande) {
		Session s = sf.getCurrentSession();
		s.delete(commande);

	}

	@Override
	public Commande modifier(Commande commande) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(commande);
		return null;
	}

}
