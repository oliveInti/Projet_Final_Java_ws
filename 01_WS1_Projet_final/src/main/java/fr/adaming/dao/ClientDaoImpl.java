package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;



@Repository
public class ClientDaoImpl implements IClientDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Client> recupererTout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client recupererParId(int client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creer(Client client) {
		Session s = sf.getCurrentSession();
		s.save(client);

	}

	@Override
	public void supprimer(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public Client modifier(Client e) {
		// TODO Auto-generated method stub
		return null;
	}

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
