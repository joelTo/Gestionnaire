package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.Medical;
import fr.success.projet.hamjo.repositories.IMedicalRepositories;

@RestController
@RequestMapping("/medicals")
public class MedicalResources {
	@Autowired
	private IMedicalRepositories Dao;

	@RequestMapping(method = RequestMethod.GET)
	public List<Medical> listAllDocumentAdmins() {
		return Dao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutDocumentAdmin(@RequestBody Medical document) {
		System.out.println("Je suis la ");
		Dao.save(document);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Medical getDocumentAdmin(@PathVariable Integer id) {
		return Dao.findById(id);
	}
}
