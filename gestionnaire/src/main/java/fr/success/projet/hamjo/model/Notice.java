package fr.success.projet.hamjo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notice")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nom", length = 5000, nullable = false)
	private String nom;

	@Column(name = "url", length = 5000)
	private String urldocument;

	public Notice() {
		super();
	}

	public Notice(String nom, String urldocument) {
		super();
		this.nom = nom;
		this.urldocument = urldocument;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrldocument() {
		return urldocument;
	}

	public void setUrldocument(String urldocument) {
		this.urldocument = urldocument;
	}

}
