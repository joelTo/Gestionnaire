package fr.success.projet.hamjo.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeDocument {

	BANQUE("Banque"), ASSURANCE("Assurance"), MAISON("Maison"), AUTRES("Autres");

	private String nomCateg;

	private TypeDocument(String nomCateg) {
		this.nomCateg = nomCateg;
	}

	@JsonValue
	public String getNomCateg() {
		return nomCateg;
	}

	@Override
	public String toString() {
		return nomCateg;
	}
}
