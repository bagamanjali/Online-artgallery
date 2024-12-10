package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Artwork;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {}
