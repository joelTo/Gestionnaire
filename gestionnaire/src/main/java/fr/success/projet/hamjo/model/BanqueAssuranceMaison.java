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

import com.opencsv.bean.CsvBindByName;

@Entity
@Table(name = "banqueassurancemaison")
public class BanqueAssuranceMaison {
	@CsvBindByName
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@CsvBindByName
	@Column(name = "nom", length = 5000, nullable = false)
	private String nom;

	@CsvBindByName
	@Column(name = "url", length = 5000)
	private String urlImage;

	@CsvBindByName
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date date;

	@CsvBindByName
	@Column(name = "companie", length = 5000, nullable = false)
	private String companie;

	@CsvBindByName
	@Enumerated(EnumType.STRING)
	@Column(name = "type", nullable = false)
	private TypeDocument type;

	@CsvBindByName
	@Enumerated(EnumType.STRING)
	@Column(name = "proprietaire", nullable = false)
	private Proprietaire proprietaire;

	public BanqueAssuranceMaison() {
		super();
	}

	public BanqueAssuranceMaison(String nom, String urlImage, Date date, String companie, TypeDocument type,
			Proprietaire proprietaire) {
		super();
		this.nom = nom;
		this.urlImage = urlImage;
		this.date = date;
		this.companie = companie;
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

	public String getCompanie() {
		return companie;
	}

	public void setCompanie(String companie) {
		this.companie = companie;
	}

	public TypeDocument getType() {
		return type;
	}

	public void setType(TypeDocument type) {
		this.type = type;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

}
