package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Client;

/**
 * 
 * @author projet blue
 *
 */
public interface IClientService {

	public List<Client> recupererTout();

	public Client recupererParId(int id);

	public void creer(Client client);

	public void supprimer(Client client);

	public Client modifier(Client client);

	public boolean isAdmin(Client client);

}
