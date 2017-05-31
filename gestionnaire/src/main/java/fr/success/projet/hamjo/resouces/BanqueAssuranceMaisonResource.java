package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.BanqueAssuranceMaison;
import fr.success.projet.hamjo.repositories.IBanqueAssuranceMaisonRepositories;

@RestController
@RequestMapping("/banqueassurancemaisons")
public class BanqueAssuranceMaisonResource {

	@Autowired
	private IBanqueAssuranceMaisonRepositories Dao;

	@RequestMapping(method = RequestMethod.GET)
	public List<BanqueAssuranceMaison> listAllDocumentAdmins() {
		return Dao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutDocumentAdmin(@RequestBody BanqueAssuranceMaison document) {
		System.out.println("Je suis la ");
		Dao.save(document);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public BanqueAssuranceMaison getDocumentAdmin(@PathVariable Integer id) {
		return Dao.findById(id);
	}
}
