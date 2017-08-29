package fr.adaming.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.adaming.model.Commande;

//Implémentation DAO de l'interface générique DAO
public class CommandeDaoImpl implements IGeneriqueDao<Commande> {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Commande> recupererTout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande recupererParId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	// implémentation de la méthode créer pour une commande
	@Override
	public void creer(Commande c) {

		Session s = sf.getCurrentSession();

		s.save(c);

	}

	@Override
	public void supprimer(Commande t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Commande modifier(Commande e) {
		// TODO Auto-generated method stub
		return null;
	}

}
