package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.BanqueAssuranceMaison;

public interface IBanqueAssuranceMaisonRepositories extends JpaRepository<BanqueAssuranceMaison, Serializable> {
	BanqueAssuranceMaison findById(Integer id);
}
