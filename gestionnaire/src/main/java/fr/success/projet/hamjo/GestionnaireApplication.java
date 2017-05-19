package fr.success.projet.hamjo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import fr.success.projet.hamjo.model.Document;
import fr.success.projet.hamjo.model.Facture;
import fr.success.projet.hamjo.model.UserJo;
import fr.success.projet.hamjo.repositories.IDocumentadminRepositories;
import fr.success.projet.hamjo.repositories.IFactureRepositories;
import fr.success.projet.hamjo.repositories.IUserRepositories;

/**
 * Application PizzeriaApp démarré via Spring Boot.
 */
@SpringBootApplication
public class GestionnaireApplication {

	/**
	 * Activation de CORS pour tous les domaines.
	 * 
	 * @return Configurateur Spring MVC.
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {

				registry.addMapping("/**").allowedOrigins("*");

			}
		};
	}

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

	@Autowired
	private IUserRepositories UserResources;

	@PostConstruct
	public void setDatabase() {

		factureResource.save(new Facture("DARTY", "Lave", "1111111"));
		factureResource.save(new Facture("DARTY", "Machine", "11122211"));
		factureResource.save(new Facture("DARTY", "piscine", "1155511"));

		documentResource.save(new Document("CARTE_IDENTITE", "33"));
		documentResource.save(new Document("PASSEPORT", "444"));

		UserResources.save(new UserJo("joel", 26));
		UserResources.save(new UserJo("Edwina", 26));
	}

}
