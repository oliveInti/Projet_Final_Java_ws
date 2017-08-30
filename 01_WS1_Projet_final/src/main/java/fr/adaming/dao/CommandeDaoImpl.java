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

//Impl�mentation DAO de l'interface g�n�rique DAO
public class CommandeDaoImpl implements IGeneriqueDao<Commande> {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Commande> recupererTout() {
		// ouvrir une session (bus de donn�es -> bud)
		Session s = sf.getCurrentSession();
		// la requ�te HQL
		String req = "FROM Commande";

		Query query = s.createQuery(req);

		// envoie de la requ�te et r�cup�ration du r�sultat
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

	// impl�mentation de la m�thode cr�er pour une commande
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
