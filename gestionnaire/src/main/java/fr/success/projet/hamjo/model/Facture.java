package fr.success.projet.hamjo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Facture {

	@GeneratedValue
	@Id
	private int id;

	private int numFactureExterne;

	private String nomEnseigne;

	private String lieu;

	private String element;

	@Column(columnDefinition = "TEXT")
	private String blob;

	private String dateValidite;

	private String dateAchat;

	public int getId() {
		return id;
	}

	public Facture(String nomEnseigne, String element) {
		super();
		this.nomEnseigne = nomEnseigne;
		this.element = element;
	}

	public Facture(int numFactureExterne, String nomEnseigne, String lieu, String element, String blob,
			String dateValidite, String dateAchat) {
		super();
		this.numFactureExterne = numFactureExterne;
		this.nomEnseigne = nomEnseigne;
		this.lieu = lieu;
		this.element = element;
		this.blob = blob;
		this.dateValidite = dateValidite;
		this.dateAchat = dateAchat;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumFactureExterne() {
		return numFactureExterne;
	}

	public void setNumFactureExterne(int numFactureExterne) {
		this.numFactureExterne = numFactureExterne;
	}

	public String getNomEnseigne() {
		return nomEnseigne;
	}

	public void setNomEnseigne(String nomEnseigne) {
		this.nomEnseigne = nomEnseigne;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getBlob() {
		return blob;
	}

	public void setBlob(String blob) {
		this.blob = blob;
	}

	public String getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(String dateValidite) {
		this.dateValidite = dateValidite;
	}

	public String getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}

}
