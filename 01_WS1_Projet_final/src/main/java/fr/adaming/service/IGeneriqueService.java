package fr.adaming.service;

import java.util.List;

public interface IGeneriqueService<T> {

	public List<T> recupererTout();

	public T recupererParId(int i);

	public void creer(T t);

	public void supprimer(T t);

	public T modifier(T e);

}
