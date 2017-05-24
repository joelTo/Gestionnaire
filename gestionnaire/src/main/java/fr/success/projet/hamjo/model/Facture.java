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

}
