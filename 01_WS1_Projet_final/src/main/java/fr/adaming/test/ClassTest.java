package fr.adaming.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.adaming.dao.ClientDaoImpl;
import fr.adaming.dao.VoyageDaoImpl;
import fr.adaming.model.Client;
import fr.adaming.model.Commande;
import fr.adaming.model.DateDepart;
import fr.adaming.model.Voyage;

public class ClassTest {

	public static void main(String[] args) {
		
		Client cl1 = new Client("AAA", "aaa", "a@a.a", "aaa", true);
		Client cl2 = new Client("BBB", "bbb", "b@b.b", "bbb", false);
		Client cl3 = new Client("CCC", "ccc", "c@c.c", "ccc", false);
		
		DateDepart dd1 = new DateDepart("01-01-2018");
		DateDepart dd2 = new DateDepart("02-02-2018");
		DateDepart dd3 = new DateDepart("03-03-2018");
		DateDepart dd4 = new DateDepart("04-04-2018");
		
		List<DateDepart> dV1 = Arrays.asList(dd1,dd2);
		List<DateDepart> dV2 = Arrays.asList(dd3,dd3);
		
		
		Voyage v1 = new Voyage("Paris à 2", "Paris", "Paris en amoureux, c'est cool", dV1, 5, "toto", 642, 1);
		Voyage v2 = new Voyage("Mickey", "Paris", "Viens claqué ton flouz chez la sourie", dV2, 2, "toto", 123, 1);
		
		Commande c1 = new Commande(cl2, v1, "Lyon", 2, 2, 542);
		Commande c2 = new Commande(cl3, v2, "Lyon", 2, 2, 542);

		ClientDaoImpl clDao = new ClientDaoImpl();
		
		VoyageDaoImpl vDao = new VoyageDaoImpl();
		
//		clDao.creer(cl1);
//		clDao.creer(cl2);
//		clDao.creer(cl3);
		
		vDao.creer(v1);
	}
}