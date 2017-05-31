package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.FicheDePaie;
import fr.success.projet.hamjo.repositories.IFicheDePaieRepositories;

@RestController
@RequestMapping("/fichedepaies")
public class FicheDePaieResource {

	@Autowired
	private IFicheDePaieRepositories Dao;

	@RequestMapping(method = RequestMethod.GET)
	public List<FicheDePaie> listAll() {
		return Dao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutDocumentAdmin(@RequestBody FicheDePaie document) {
		System.out.println("Je suis la ");
		Dao.save(document);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public FicheDePaie getDocumentAdmin(@PathVariable Integer id) {
		return Dao.findById(id);
	}
}
