package fr.success.projet.hamjo.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeMedical {
	ORDONNANCE("Ordonnance"), ATTESTATION("Attestation"), FEUILLE_DE_SOINS("Feuille de Soin"), AUTRES("Autres");

	private String nomCateg;

	private TypeMedical(String nomCateg) {
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
