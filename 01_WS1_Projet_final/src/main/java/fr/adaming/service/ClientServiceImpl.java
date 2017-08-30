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
		clDao.recupererTout();
		return null;
	}

	@Override
	public Client recupererParId(int i) {
		clDao.recupererParId(i);
		return null;
	}

	@Override
	public void creer(Client client) {
		clDao.creer(client);

	}

	@Override
	public void supprimer(Client client) {
		clDao.supprimer(client);

	}

	@Override
	public Client modifier(Client client) {
		clDao.modifier(client);
		return null;
	}

	@Override
	public boolean isAdmin(Client client) {
		clDao.isAdmin(client);
		return false;
	}

}
