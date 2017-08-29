package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;

public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientDao clDao;
	


	public void setClDao(IClientDao clDao) {
		this.clDao = clDao;
	}

	@Override
	public List<Client> recupererTout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client recupererParId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creer(Client client) {
		clDao.creer(client);

	}

	@Override
	public void supprimer(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public Client modifier(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAdmin(Client client) {
		clDao.isAdmin(client);
		return false;
	}

}
