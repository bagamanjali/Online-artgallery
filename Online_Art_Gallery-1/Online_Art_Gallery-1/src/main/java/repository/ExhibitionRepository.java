package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Exhibition;

public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {}
