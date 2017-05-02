package fr.success.projet.hamjo.repositories;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class IFactureRepositoriesTest {

	@Autowired
	private IFactureRepositories repository;

	// @Test
	// public void testFindByNomEnseigne() {
	// // repository.save(new Facture("DARTY", "Machine_à_laver"));
	// assertEquals(repository.findByElement("Machine_à_laver").getNomEnseigne(),
	// "DARTY");
	// }

}
