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
@Table(name = "fichedepaie")
public class FicheDePaie {
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
	@Column(name = "proprietaire", nullable = false)
	private Proprietaire proprietaire;
}
