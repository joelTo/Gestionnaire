package fr.success.projet.hamjo.resouces.adapter;

import java.util.Date;

import fr.success.projet.hamjo.model.DocAdmin;
import fr.success.projet.hamjo.model.Proprietaire;

public final class AdapterWebtoDocAdmin {
	/**
	 * Permet de garder la classe static 
	 * PCC
	 * 
	 */
	private AdapterWebtoDocAdmin(){
		
	}
	/**
	 * 
	 * Convertisseur Web to DocAdmin
	 * @return
	 */
	public static DocAdmin fromWebtoDocAdmin(final DocAdmin pDocAdmin ){
		DocAdmin retour = new DocAdmin();
		retour.setDate(pDocAdmin.getDate());
		retour.setNom(pDocAdmin.getNom());
		retour.setPeremption(pDocAdmin.getPeremption());
		retour.setProprietaire(Proprietaire.AUTRES);
		retour.setUrlImage(pDocAdmin.getUrlImage());
		return retour;
	}
}
