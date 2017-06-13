package fr.success.projet.hamjo.dao;

import java.util.List;

public interface daoInteface {
	
	// CRUD
	//Creation de la liste 
	List<Object> all(Object pObject);
	
	//Ajouter un object
	Object ajout(Object pObject);
	
	//Supprimer un objet
	Boolean supprimer (int pNumero, Object pObject);
	
	//Mise a jour Object
	Object maj(Object pObject, int pNumero);
	

}
