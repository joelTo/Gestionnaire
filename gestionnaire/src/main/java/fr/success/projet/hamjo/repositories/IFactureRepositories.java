package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.Facture;

public interface IFactureRepositories extends JpaRepository<Facture, Serializable> {

	Facture findById(int id);

	// Facture findByNumFactureExterne(int num);

	// Collection<Facture> findByNomEnseigne(String nomEnseigne);

	// Facture findByElement(String element);
}
