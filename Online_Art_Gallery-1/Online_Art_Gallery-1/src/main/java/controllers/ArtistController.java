package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Artwork;
import services.ArtworkService;

@RestController
@RequestMapping("/artist")
public class ArtistController {
    @Autowired
    private ArtworkService artworkService;

    @PostMapping("/upload")
    public Artwork uploadArtwork(@RequestBody Artwork artwork) {
        return artworkService.saveArtwork(artwork);
    }
}
