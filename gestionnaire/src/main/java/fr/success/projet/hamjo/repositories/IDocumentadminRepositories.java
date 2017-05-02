package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.DocumentAdmin;

public interface IDocumentadminRepositories extends JpaRepository<DocumentAdmin, Serializable> {
	DocumentAdmin findById(int id);
}
