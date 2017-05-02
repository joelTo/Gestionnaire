package fr.success.projet.hamjo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.success.projet.hamjo.model.DocumentAdmin;
import fr.success.projet.hamjo.model.Facture;
import fr.success.projet.hamjo.repositories.IDocumentadminRepositories;
import fr.success.projet.hamjo.repositories.IFactureRepositories;

/**
 * Application PizzeriaApp démarré via Spring Boot.
 */
@SpringBootApplication
public class GestionnaireApplication {

	/**
	 * La Securité de l'application est genere ici
	 * 
	 * @param args
	 */
	// @Configuration
	// static class SecurityConfig extends GlobalAuthenticationConfigurerAdapter
	// {
	// @Override
	// public void init(AuthenticationManagerBuilder auth) throws Exception {
	// auth.inMemoryAuthentication().withUser("douna").password("mafemme").roles("USER").and().withUser("dou")
	// .password("tonmari").roles("USER", "HERO");
	// }
	// }

	public static void main(String[] args) {
		SpringApplication.run(GestionnaireApplication.class, args);
		System.out.println("Test je suis entraon de marche");
	}

	@Autowired
	private IFactureRepositories factureResource;

	@Autowired
	private IDocumentadminRepositories documentResource;

	@PostConstruct
	public void setDatabase() {

		factureResource.save(new Facture("DARTY", "Lave", "1111111"));
		factureResource.save(new Facture("DARTY", "Machine", "11122211"));
		factureResource.save(new Facture("DARTY", "piscine", "1155511"));

		documentResource.save(new DocumentAdmin("CARTE_IDENTITE", "33"));
		documentResource.save(new DocumentAdmin("PASSEPORT", "444"));
	}

}
