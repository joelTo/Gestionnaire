package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.DocAdmin;

public interface IDocumentadminRepositories extends JpaRepository<DocAdmin, Serializable> {
	DocAdmin findById(Integer id);
}
