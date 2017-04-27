package fr.success.projet.hamjo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facture")
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "numFactureExterne", nullable = true)
	private int numFactureExterne;
	@Column(name = "nomEnseigne", length = 5000, nullable = false)
	private String nomEnseigne;
	@Column(name = "lieu", length = 5000, nullable = true)
	private String lieu;
	@Column(name = "element", nullable = false)
	private String element;
	@Column(name = "blob", length = 5000, nullable = true)
	private String blob;
	@Column(name = "dateValidite", length = 5000, nullable = true)
	private String dateValidite;
	@Column(name = "dateAchat", length = 5000, nullable = true)
	private String dateAchat;

	public Facture() {
		super();
	}

	public Facture(String nomEnseigne, String element, String blob) {
		super();
		this.nomEnseigne = nomEnseigne;
		this.element = element;
		this.blob = blob;
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

	public int getId() {
		return id;
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
