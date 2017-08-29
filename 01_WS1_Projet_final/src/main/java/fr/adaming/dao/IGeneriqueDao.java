package fr.adaming.dao;

import java.util.List;

public interface IGeneriqueDao<T>{
	
	public List<T> recupererTout();
	
	public T recupererParId(int i);
	
	public void creer(T t);
	
	public void supprimer(T t);
	
	public T modifier(T e);

}
