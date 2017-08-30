package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;


/**
 * 
 * @author projet blue
 *
 */
@Repository
public class ClientDaoImpl implements IClientDao {

	@Autowired
	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	//récupérer tous les clients de la base de donnée (BD)
	@Override
	public List<Client> recupererTout() {
		// ouvrir une session 
		Session s = sf.getCurrentSession();
		// la requête HQL
		String req = "FROM Client";

		Query query = s.createQuery(req);

		// envoie de la requête et récupération du résultat
		@SuppressWarnings("unchecked")
		List<Client> listeClients = query.list();
		
		return listeClients;
	}

	//récupérer un client de la BD selon un id particulier
	@Override
	public Client recupererParId(int idclient) {
		Session s = sf.getCurrentSession();
		Client varClient = (Client) s.get(Client.class, idclient);
		return varClient;
	}
	
	//Création d'un client
	@Override
	public void creer(Client client) {
		Session s = sf.getCurrentSession();
		s.save(client);

	}

	//Suppression d'un client
	@Override
	public void supprimer(Client client) {
		Session s = sf.getCurrentSession();
		s.delete(client);

	}

	//Modification d'un client
	@Override
	public Client modifier(Client client) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(client);
		return null;
	}

	//Vérification du rôle d'un client : voir si il est administrateur ou non
	@Override
	public boolean isAdmin(Client client) {
		Session s = sf.getCurrentSession();
		String req = "FROM Client as c WHERE mail=? AND admin='true'";
		Query query = s.createQuery(req);
		query.setParameter(1, client.getMail());
		
		List<Client> clients = query.list();
		int verif = clients.size();
		
		return (verif==1);
	}

}
