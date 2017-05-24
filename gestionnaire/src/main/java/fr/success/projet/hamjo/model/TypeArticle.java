package fr.success.projet.hamjo.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeArticle {
	ALIMENT("Alimentaire"), ELECTROMENAGER("Electromenager"), VETEMENT("Vetement"), AUTRES("Autres");

	private String typeArticle;

	private TypeArticle(String typeArticle) {
		this.typeArticle = typeArticle;
	}

	@JsonValue
	public String getNomProprio() {
		return typeArticle;
	}

	@Override
	public String toString() {
		return typeArticle;
	}
}
