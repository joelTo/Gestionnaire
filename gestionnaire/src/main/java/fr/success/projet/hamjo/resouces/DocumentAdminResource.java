package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.DocumentAdmin;
import fr.success.projet.hamjo.repositories.IDocumentadminRepositories;

@RestController
@RequestMapping("/documents")
public class DocumentAdminResource {

	@Autowired
	private IDocumentadminRepositories documentDao;

	@RequestMapping(method = RequestMethod.GET)
	public List<DocumentAdmin> listAllDocumentAdmins() {
		return documentDao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutDocumentAdmin(@RequestBody DocumentAdmin DocumentAdmin) {
		System.out.println("Je suis la ");
		documentDao.save(DocumentAdmin);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public DocumentAdmin getDocumentAdmin(@PathVariable Integer id) {
		return documentDao.findById(id);
	}
}
