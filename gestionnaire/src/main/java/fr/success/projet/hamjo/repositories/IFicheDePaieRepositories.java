package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.FicheDePaie;

public interface IFicheDePaieRepositories extends JpaRepository<FicheDePaie, Serializable> {
	FicheDePaie findById(Integer id);
}
