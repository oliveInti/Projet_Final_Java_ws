package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Voyage;

public interface IVoyageService {

	public List<Voyage> recupererTout();

	public Voyage recupererParId(int id);

	public void creer(Voyage voyage);

	public void supprimer(Voyage voyage);

	public Voyage modifier(Voyage voyage);
}
