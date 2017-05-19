
package fr.success.projet.hamjo.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.success.projet.hamjo.model.UserJo;
import fr.success.projet.hamjo.repositories.IUserRepositories;

@RestController
@RequestMapping("/users")
public class UserResources {
	@Autowired
	private IUserRepositories userDao;

	@RequestMapping(method = RequestMethod.GET)
	public List<UserJo> listAllFactures() {
		return userDao.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void ajoutFacture(@RequestBody UserJo user) {
		System.out.println("Je suis la ");
		userDao.save(user);
	}
}
