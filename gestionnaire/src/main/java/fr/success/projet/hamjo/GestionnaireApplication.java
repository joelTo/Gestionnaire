package fr.success.projet.hamjo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
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

	public static void main(String[] args) throws FileNotFoundException, Exception {
		SpringApplication.run(GestionnaireApplication.class, args);
		System.out.println("Test je suis entraon de marche");

		String[] items1 = { "book", "coin", "pencil" };
		String[] items2 = { "pen", "chair", "lamp" };
		String[] items3 = { "ball", "bowl", "spectacles" };

		List<String[]> entries = new ArrayList<>();
		entries.add(items1);
		entries.add(items2);
		entries.add(items3);

		String fileName2 = "src/main/resources/items.csv";

		try (CSVWriter writer = new CSVWriter(new FileWriter(fileName2))) {
			writer.writeAll(entries);
		}

		String fileName = "src/main/resources/cars.csv";

		try (CSVReader reader = new CSVReader(new FileReader(fileName))) {

			HeaderColumnNameMappingStrategy<CarBean> strategy = new HeaderColumnNameMappingStrategy<>();
			strategy.setType(CarBean.class);

			CsvToBean<CarBean> csvToBean = new CsvToBean<>();
			List<CarBean> beanList = csvToBean.parse(strategy, reader);

			for (CarBean bean : beanList) {
				System.out.println(bean);
			}
		}

	}

	@Autowired
	private IFactureRepositories factureResource;

	@Autowired
	private IDocumentadminRepositories documentResource;

	@PostConstruct
	public void setDatabase() {

		// factureResource.save(new Facture("DARTY", "Lave", "1111111"));
		// factureResource.save(new Facture("DARTY", "Machine", "11122211"));
		// factureResource.save(new Facture("DARTY", "piscine", "1155511"));
		//
		// documentResource.save(new DocAdmin("CARTE_IDENTITE", "33"));
		// documentResource.save(new DocAdmin("PASSEPORT", "444"));
		//
		// UserResources.save(new UserJo("joel", 26));
		// UserResources.save(new UserJo("Edwina", 26));
	}

}
