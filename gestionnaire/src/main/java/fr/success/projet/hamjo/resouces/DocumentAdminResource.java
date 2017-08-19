package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.elasticsearch.common.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.DocAdmin;
import fr.success.projet.hamjo.repositories.IDocumentadminRepositories;
import fr.success.projet.hamjo.resouces.adapter.AdapterWebtoDocAdmin;
import fr.success.projet.hamjo.resouces.metier.DocumentBSImpl;

@RestController
@RequestMapping("/documents")
public class DocumentAdminResource {

	@Autowired
	private IDocumentadminRepositories documentDao;
	

	

	@RequestMapping(method = RequestMethod.GET)
	public List<DocAdmin> listAllDocumentAdmins() {
		return documentDao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void recuperationToSave(@RequestBody DocAdmin pDocumentAdmin) {
		DocAdmin retour = AdapterWebtoDocAdmin.fromWebtoDocAdmin(pDocumentAdmin);
		System.out.println(retour.toString());
		documentDao.save(retour);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public DocAdmin getDocumentAdmin(@PathVariable Integer id) {
		return documentDao.findById(id);
	}
}
