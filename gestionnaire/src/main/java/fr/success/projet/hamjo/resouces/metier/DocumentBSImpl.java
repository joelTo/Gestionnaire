package fr.success.projet.hamjo.resouces.metier;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.DocAdmin;
import fr.success.projet.hamjo.repositories.IDocumentadminRepositories;


public class DocumentBSImpl {

	@Autowired
	private IDocumentadminRepositories documentDao;

	


	
	public void ajoutDocumentAdmin(final DocAdmin documentAdmin) {
		
		System.out.println(documentAdmin.toString());
		
	}

	
	protected DocAdmin convertionBOtoDTO(final DocAdmin pDocAdmin ){
		DocAdmin retour = new DocAdmin(); 
		retour.setDate(new Date(pDocAdmin.toString()));
		
		return retour;
	}
}
