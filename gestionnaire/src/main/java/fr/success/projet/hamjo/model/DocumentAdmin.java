package fr.success.projet.hamjo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentAdmin")
public class DocumentAdmin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nomDoc", length = 5000, nullable = false)
	private String nomDoc;
	@Column(name = "dateValidite", length = 5000, nullable = true)
	private String dateValidite;
	@Column(name = "blob", length = 5000, nullable = true)
	private String Blob;

	public DocumentAdmin() {
		super();
	}

	public DocumentAdmin(String nomDoc, String dateValidite, String blob) {
		super();
		this.nomDoc = nomDoc;
		this.dateValidite = dateValidite;
		Blob = blob;
	}

	public DocumentAdmin(String nomDoc, String blob) {
		super();
		this.nomDoc = nomDoc;
		Blob = blob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomDoc() {
		return nomDoc;
	}

	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	public String getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(String dateValidite) {
		this.dateValidite = dateValidite;
	}

	public String getBlob() {
		return Blob;
	}

	public void setBlob(String blob) {
		Blob = blob;
	}

}
