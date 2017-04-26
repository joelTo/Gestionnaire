package fr.success.projet.hamjo.repositories;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import fr.success.projet.hamjo.model.Facture;

public interface FactureRepositories extends CrudRepository<Facture, Serializable> {

	Facture findByNumFactureExterne(int num);

	Collection<Facture> findByNomEnseigne(String nomEnseigne);

	Facture findByElement(String element);
}
