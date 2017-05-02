package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.Facture;
import fr.success.projet.hamjo.repositories.IFactureRepositories;

@RestController
@RequestMapping("/factures")
public class FactureResouce {
	@Autowired
	private IFactureRepositories FactureDao;

	@RequestMapping(method = RequestMethod.GET)
	public List<Facture> listAllFactures() {
		return FactureDao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutFacture(@RequestBody Facture Facture) {
		System.out.println("Je suis la ");
		FactureDao.save(Facture);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Facture getFacture(@PathVariable Integer id) {
		return FactureDao.findById(id);
	}
}
