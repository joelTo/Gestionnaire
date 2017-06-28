package fr.success.projet.hamjo.model;

import java.math.BigDecimal;
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
@Table(name = "facture")
public class Facture {
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

	@Column(name = "magasin", length = 5000, nullable = false)
	private String magasin;

	@Enumerated(EnumType.STRING)
	@Column(name = "type", nullable = false)
	private TypeArticle type;

	@Enumerated(EnumType.STRING)
	@Column(name = "proprietaire", nullable = false)
	private Proprietaire proprietaire;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "garantie")
	private Date garantie;

	@Column(name = "prix", nullable = false)
	private BigDecimal prix;

	public Facture() {
		super();
	}

	public Facture(String nom, String urlImage, Date date, String magasin, TypeArticle type, Proprietaire proprietaire,
			Date garantie, BigDecimal prix) {
		super();
		this.nom = nom;
		this.urlImage = urlImage;
		this.date = date;
		this.magasin = magasin;
		this.type = type;
		this.proprietaire = proprietaire;
		this.garantie = garantie;
		this.prix = prix;
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

	public String getMagasin() {
		return magasin;
	}

	public void setMagasin(String magasin) {
		this.magasin = magasin;
	}

	public TypeArticle getType() {
		return type;
	}

	public void setType(TypeArticle type) {
		this.type = type;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Date getGarantie() {
		return garantie;
	}

	public void setGarantie(Date garantie) {
		this.garantie = garantie;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

}
