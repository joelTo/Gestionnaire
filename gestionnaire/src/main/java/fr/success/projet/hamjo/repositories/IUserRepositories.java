package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.UserJo;

public interface IUserRepositories extends JpaRepository<UserJo, Serializable> {
	UserJo findById(int id);
}
