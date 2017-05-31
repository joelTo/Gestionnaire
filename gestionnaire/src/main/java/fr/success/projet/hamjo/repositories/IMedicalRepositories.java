package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.Medical;

public interface IMedicalRepositories extends JpaRepository<Medical, Serializable> {
	Medical findById(Integer id);
}