package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.Document;

public interface IDocumentadminRepositories extends JpaRepository<Document, Serializable> {
	Document findById(int id);
}
