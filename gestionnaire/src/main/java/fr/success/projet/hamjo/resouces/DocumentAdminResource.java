package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.Document;
import fr.success.projet.hamjo.repositories.IDocumentadminRepositories;

@RestController
@RequestMapping("/documents")
public class DocumentAdminResource {

	@Autowired
	private IDocumentadminRepositories documentDao;

	@RequestMapping(method = RequestMethod.GET)
	public List<Document> listAllDocumentAdmins() {
		return documentDao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutDocumentAdmin(@RequestBody Document documentAdmin) {
		System.out.println("Je suis la ");
		documentDao.save(documentAdmin);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Document getDocumentAdmin(@PathVariable Integer id) {
		return documentDao.findById(id);
	}
}
