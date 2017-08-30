package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.dao.VoyageDaoImpl;
import fr.adaming.model.Voyage;

@Service
@Transactional
public class VoyageServiceImpl implements IVoyageService {

	// @Autowired
	private IGeneriqueDao<Voyage> voyageDao = new VoyageDaoImpl();

	public void setVoyageDao(IGeneriqueDao<Voyage> voyageDao) {
		this.voyageDao = voyageDao;
	}

	@Override
	public List<Voyage> recupererTout() {
		return voyageDao.recupererTout();
	}

	@Override
	public Voyage recupererParId(int i) {
		return voyageDao.recupererParId(i);
	}

	@Override
	public void creer(Voyage v) {
		voyageDao.creer(v);
	}

	@Override
	public void supprimer(Voyage v) {
		voyageDao.supprimer(v);
	}

	@Override
	public Voyage modifier(Voyage v) {
		return voyageDao.modifier(v);
	}

}
