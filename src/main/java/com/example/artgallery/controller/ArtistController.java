/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.artgallery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.artgallery.service.ArtistJpaService;
import com.example.artgallery.model.Artist;
import com.example.artgallery.model.Art;
import com.example.artgallery.model.Gallery;

@RestController
public class ArtistController {

    @Autowired
    public ArtistJpaService artistJpaService;

    @GetMapping("/galleries/artists")
    public ArrayList<Artist> getArtist() {
        return artistJpaService.getArtist();
    }

    @PostMapping("/galleries/artists")
    public Artist addArtist(@RequestBody Artist artist) {
        return artistJpaService.addArtist(artist);
    }

    @GetMapping("/galleries/artists/{artistId}")
    public Artist getById(@PathVariable("artistId") int artistId) {
        return artistJpaService.getById(artistId);
    }

    @PutMapping("/galleries/artists/{artistId}")
    public Artist updateArtist(@PathVariable("artistId") int artistId, @RequestBody Artist artist) {
        return artistJpaService.updateArtist(artistId, artist);
    }

    @DeleteMapping("/galleries/artists/{artistId}")
    public void deleteArtist(@PathVariable("artistId") int artistId) {
        artistJpaService.deleteArtist(artistId);
    }

    @GetMapping("/artists/{artistId}/arts")
    public List<Art> getArtistArt(@PathVariable("artistId") int artistId) {
        return artistJpaService.getArtistArt(artistId);
    }

    @GetMapping("/artists/{artistId}/galleries")
    public List<Gallery> getArtistGallery(@PathVariable("artistId") int artistId) {
        return artistJpaService.getArtistGallery(artistId);
    }
}