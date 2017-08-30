package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Commande;

public interface ICommandeService {

	public List<Commande> recupererTout();

	public Commande recupererParId(int id);

	public void creer(Commande commande);

	public void supprimer(Commande commande);

	public Commande modifier(Commande commande);

}
