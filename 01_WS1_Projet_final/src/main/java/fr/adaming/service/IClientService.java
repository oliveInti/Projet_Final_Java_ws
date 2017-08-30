package fr.adaming.service;

import fr.adaming.model.Client;

/**
 * 
 * @author projet blue
 *
 */
public interface IClientService extends IGeneriqueService<Client>{

	
	public boolean isAdmin(Client client); 
	
	
}
