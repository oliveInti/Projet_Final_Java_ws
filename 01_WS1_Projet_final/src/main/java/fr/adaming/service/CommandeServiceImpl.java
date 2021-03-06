package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.CommandeDaoImpl;
import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.model.Commande;

/**
 * 
 * @author projet blue
 *
 */
// Implémentation Service de l'interface générique service
@Service
@Transactional
public class CommandeServiceImpl implements ICommandeService {

	// @Autowired
	private IGeneriqueDao<Commande> coDao = new CommandeDaoImpl();

	public void setCoDao(IGeneriqueDao<Commande> coDao) {
		this.coDao = coDao;
	}

	@Override
	public List<Commande> recupererTout() {
		coDao.recupererTout();
		return null;
	}

	@Override
	public Commande recupererParId(int id_commande) {
		coDao.recupererParId(id_commande);
		return null;
	}

	// implémentation de la méthode créer une commande
	@Override
	public void creer(Commande commande) {
		coDao.creer(commande);

	}

	@Override
	public void supprimer(Commande commande) {
		coDao.supprimer(commande);

	}

	@Override
	public Commande modifier(Commande commande) {
		coDao.modifier(commande);
		return null;
	}

}
