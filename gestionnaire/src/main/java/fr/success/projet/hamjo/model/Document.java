package fr.success.projet.hamjo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name", length = 5000, nullable = false)
	private String name;
	@Column(name = "datevalidite", length = 5000, nullable = true)
	private String datevalidite;
	@Column(name = "blob", length = 5000, nullable = true)
	private String blob;
	@Column(name = "proprietaire", length = 5000, nullable = true)
	private String proprietaire;
	@Column(name = "categorie", length = 5000, nullable = true)
	private String categorie;

	public Document() {
		super();
	}

	public Document(String name) {
		super();
		this.name = name;

	}

	public Document(String name, String blob) {
		super();
		this.name = name;
		this.blob = blob;
	}

	public Document(String name, String blob, String proprietaire, String categorie) {
		super();
		this.name = name;
		this.blob = blob;
		this.proprietaire = proprietaire;
		this.categorie = categorie;
	}

	public Document(String name, String dateValidite, String blob, String proprietaire, String categorie) {
		super();
		this.name = name;
		this.datevalidite = dateValidite;
		this.blob = blob;
		this.proprietaire = proprietaire;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getDateValidite() {
		return datevalidite;
	}

	public void setDateValidite(String dateValidite) {
		this.datevalidite = dateValidite;
	}

	public String getBlob() {
		return blob;
	}

	public void setBlob(String blob) {
		this.blob = blob;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}
