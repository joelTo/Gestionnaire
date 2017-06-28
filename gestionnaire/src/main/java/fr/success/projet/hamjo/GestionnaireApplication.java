package fr.success.projet.hamjo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import fr.success.projet.hamjo.model.CarBean;
import fr.success.projet.hamjo.model.DocAdmin;
import fr.success.projet.hamjo.model.Facture;
import fr.success.projet.hamjo.model.Proprietaire;
import fr.success.projet.hamjo.model.TypeArticle;
import fr.success.projet.hamjo.repositories.IDocumentadminRepositories;
import fr.success.projet.hamjo.repositories.IFactureRepositories;

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
	 * @throws Exception
	 * @throws FileNotFoundException
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

		 factureResource.save(new Facture("lave_Linge", "C:/document/lave_linge", new Date(), "DARTY", TypeArticle.ELECTROMENAGER, Proprietaire.ENSEMBLE, new Date(), new BigDecimal(456.00)));
		 factureResource.save(new Facture("Machine", "C:/document/Machine", new Date(), "DARTY", TypeArticle.ELECTROMENAGER, Proprietaire.ENSEMBLE, new Date(), new BigDecimal(145.00)));
		 factureResource.save(new Facture("Pese-personne", "C:/document/lave_linge", new Date(), "DARTY", TypeArticle.ELECTROMENAGER, Proprietaire.ENSEMBLE, new Date(), new BigDecimal(79.50)));
		 
		 documentResource.save(new DocAdmin("CARTE_IDENTITE", "C:/document/carte_identite_dou", new Date(), new Date(), Proprietaire.DOU));
		 documentResource.save(new DocAdmin("CARTE_IDENTITE", "C:/document/carte_identite_douna", new Date(), new Date(), Proprietaire.DOUNA));
		 documentResource.save(new DocAdmin("PASSEPORT", "C:/document/Passeport", new Date(), new Date(), Proprietaire.DOU));
		
	}

}
