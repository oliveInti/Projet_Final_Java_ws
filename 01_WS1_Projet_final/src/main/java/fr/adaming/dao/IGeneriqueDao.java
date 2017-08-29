package fr.adaming.dao;

import java.util.List;

// Interface g�n�rique d�finissant les m�thodes CRUD utilis�es par toutes les classes
public interface IGeneriqueDao<T> {

	public List<T> recupererTout();

	public T recupererParId(int i);

	public void creer(T t);

	public void supprimer(T t);

	public T modifier(T e);

}
