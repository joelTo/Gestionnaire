package fr.success.projet.hamjo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

import fr.success.projet.hamjo.model.Facture;
import fr.success.projet.hamjo.repositories.FactureRepositories;

/**
 * Application PizzeriaApp démarré via Spring Boot.
 */
@SpringBootApplication
public class GestionnaireApplication {
	@Configuration
	static class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {
		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("douna").password("mafemme").roles("USER").and().withUser("dou")
					.password("tonmari").roles("USER", "HERO");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(GestionnaireApplication.class, args);
		System.out.println("Test je suis entraon de marche");
	}

	@Autowired
	private FactureRepositories factureResource;

	@PostConstruct
	public void setDatabase() {

		factureResource.save(new Facture("DARTY", "Lave", "1111111"));
	}

}
