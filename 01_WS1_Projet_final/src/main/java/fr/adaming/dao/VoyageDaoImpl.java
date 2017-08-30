package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Voyage;

/**
 * 
 * @author projet blue
 *
 */
@Repository
public class VoyageDaoImpl implements IVoyageDao {

	@Autowired
	private SessionFactory sf;

	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	@Transactional
	public List<Voyage> recupererTout() {
		// ouvrir une session (bus de données -> bud)
		
		Session s = sf.getCurrentSession();
		// la requête HQL
		String req = "FROM Voyage";

		Query query = s.createQuery(req);

		// envoie de la requête et récupération du résultat
		@SuppressWarnings("unchecked")
		List<Voyage> liste = query.list();

		return liste;

	}

	@Override
	public Voyage recupererParId(int idVoyage) {
		Session s = sf.getCurrentSession();
		Voyage varVoyage = (Voyage) s.get(Voyage.class, idVoyage);
		return varVoyage;
	}

	@Override
	public void creer(Voyage voyage) {
		// ouvrir une session (bus de données -> bdd)
		Session s = sf.getCurrentSession();
		// ajouter l'employé dans le context Hibernate
		s.save(voyage);
	}

	@Override
	public void supprimer(Voyage voyage) {
		Session s = sf.getCurrentSession();
		s.delete(voyage);
	}

	@Override
	public Voyage modifier(Voyage voyage) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(voyage);
		return voyage;
	}

}
