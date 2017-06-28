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
@Table(name = "docadmin")
public class DocAdmin {
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "peremption")
	private Date peremption;

	@Enumerated(EnumType.STRING)
	@Column(name = "proprietaire", nullable = false)
	private Proprietaire proprietaire;

	public DocAdmin() {
		super();
	}

	public DocAdmin(String nom, String urlImage, Date date, Date peremption, Proprietaire proprietaire) {
		super();
		this.nom = nom;
		this.urlImage = urlImage;
		this.date = date;
		this.peremption = peremption;
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

	public Date getPeremption() {
		return peremption;
	}

	public void setPeremption(Date peremption) {
		this.peremption = peremption;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	@Override
	public String toString(){
		return "{"+nom+" "+urlImage+" "+date.toString()+" "+peremption.toString()+" "+proprietaire.toString()+"}";
		
		
	}

}
