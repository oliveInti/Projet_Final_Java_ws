package fr.adaming.dao;

import fr.adaming.model.Client;

public interface IClientDao extends IGeneriqueDao<Client>{
	
	public boolean isAdmin(Client client); 

}
