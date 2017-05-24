package fr.success.projet.hamjo.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Proprietaire {
	DOUNA("Edwina"), DOU("Joel"), ENSEMBLE("Douna&Dou"), AUTRES("Autres");

	private String nomProprietaire;

	private Proprietaire(String nomProprio) {
		this.nomProprietaire = nomProprio;
	}

	@JsonValue
	public String getNomProprio() {
		return nomProprietaire;
	}

	@Override
	public String toString() {
		return nomProprietaire;
	}
}
