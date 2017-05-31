package fr.success.projet.hamjo.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.success.projet.hamjo.model.Notice;

public interface INoticeRepositories extends JpaRepository<Notice, Serializable> {
	Notice findById(Integer id);
}
