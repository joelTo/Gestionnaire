package fr.success.projet.hamjo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.success.projet.hamjo.model.Facture;
import fr.success.projet.hamjo.repositories.FactureRepositories;

/**
 * Application PizzeriaApp démarré via Spring Boot.
 */
@SpringBootApplication
public class GestionnaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionnaireApplication.class, args);
		System.out.println("Test je suis entraon de marche");
	}

	@Autowired
	private FactureRepositories factureResource;

	@PostConstruct
	public void setDatabase() {

		factureResource.save(new Facture("DARTY", "MACHINE_A_LAVER"));
	}

}
