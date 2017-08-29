package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.model.Commande;

// Implémentation Service de l'interface générique service
public class CommandeServiceImpl implements IGeneriqueService<Commande> {

	@Autowired
	private IGeneriqueDao<Commande> coDao;

	public void setCoDao(IGeneriqueDao<Commande> coDao) {
		this.coDao = coDao;
	}

	@Override
	public List<Commande> recupererTout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande recupererParId(int id_c) {
		// TODO Auto-generated method stub
		return null;
	}

	// implémentation de la méthode créer pour une commande
	@Override
	public void creer(Commande c) {

		coDao.creer(c);

	}

	@Override
	public void supprimer(Commande c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Commande modifier(Commande c) {
		// TODO Auto-generated method stub
		return null;
	}

}
