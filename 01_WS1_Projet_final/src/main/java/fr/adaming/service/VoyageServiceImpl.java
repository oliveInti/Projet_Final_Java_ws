package fr.adaming.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.dao.VoyageDaoImpl;
import fr.adaming.model.Commande;
import fr.adaming.model.DateDepart;
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
		
		System.out.println("JE SUIS LAAAAAA");
		
		List<Voyage> resultat = new ArrayList<>();
		
		DateDepart dd1 = new DateDepart("01-01-2018");
		DateDepart dd2 = new DateDepart("02-02-2018");
		DateDepart dd3 = new DateDepart("03-03-2018");
		DateDepart dd4 = new DateDepart("04-04-2018");
		
		List<DateDepart> dV1 = Arrays.asList(dd1,dd2);
		List<DateDepart> dV2 = Arrays.asList(dd3,dd3);
		
		
		Voyage v1 = new Voyage("Paris à 2", "Paris", "Paris en amoureux, c'est cool", dV1, 5, "toto", 642, 1);
		Voyage v2 = new Voyage("Mickey", "Paris", "Viens claqué ton flouz chez la sourie", dV2, 2, "toto", 123, 1);
		
		resultat.add(v1);
		resultat.add(v2);
		
		return resultat;
		//return voyageDao.recupererTout();
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
