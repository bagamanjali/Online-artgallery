package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Artwork;
import repository.ArtworkRepository;

@Service
public class ArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

    public Artwork saveArtwork(Artwork artwork) {
        return artworkRepository.save(artwork);
    }

    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll();
    }
}
