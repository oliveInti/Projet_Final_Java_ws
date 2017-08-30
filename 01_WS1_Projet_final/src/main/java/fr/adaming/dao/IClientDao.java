package fr.adaming.dao;

import fr.adaming.model.Client;

/**
 * 
 * @author projet blue
 *
 */
public interface IClientDao extends IGeneriqueDao<Client>{
	
	public boolean isAdmin(Client client); 

}
