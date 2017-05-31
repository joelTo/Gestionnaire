package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.Notice;
import fr.success.projet.hamjo.repositories.INoticeRepositories;

@RestController
@RequestMapping("/notices")
public class NoticeResource {
	@Autowired
	private INoticeRepositories Dao;

	@RequestMapping(method = RequestMethod.GET)
	public List<Notice> listAllDocumentAdmins() {
		return Dao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutDocumentAdmin(@RequestBody Notice document) {
		System.out.println("Je suis la ");
		Dao.save(document);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Notice getDocumentAdmin(@PathVariable Integer id) {
		return Dao.findById(id);
	}
}
