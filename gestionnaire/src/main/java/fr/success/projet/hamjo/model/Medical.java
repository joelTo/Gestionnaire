package fr.success.projet.hamjo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "medical")
public class Medical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nom", length = 5000, nullable = false)
	private String nom;

	@Column(name = "url", length = 5000)
	private String urlImage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date date;

	@Enumerated(EnumType.STRING)
	@Column(name = "type", nullable = false)
	private TypeMedical type;

	@Enumerated(EnumType.STRING)
	@Column(name = "proprietaire", nullable = false)
	private Proprietaire proprietaire;

	public Medical() {
		super();
	}

	public Medical(String nom, String urlImage, Date date, TypeMedical type, Proprietaire proprietaire) {
		super();
		this.nom = nom;
		this.urlImage = urlImage;
		this.date = date;
		this.type = type;
		this.proprietaire = proprietaire;
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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TypeMedical getType() {
		return type;
	}

	public void setType(TypeMedical type) {
		this.type = type;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

}
