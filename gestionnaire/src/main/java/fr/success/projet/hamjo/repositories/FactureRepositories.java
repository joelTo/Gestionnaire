package fr.success.projet.hamjo.repositories;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import fr.success.projet.hamjo.model.Facture;

public interface FactureRepositories extends CrudRepository<Facture, Serializable> {

	Facture findByNumFactureExterne(int num);

	@RestResource(path = "by-enseigne")
	Collection<Facture> findByNomEnseigne(@Param("nomEnseigne") String nomEnseigne);

	Facture findByElement(String element);
}
