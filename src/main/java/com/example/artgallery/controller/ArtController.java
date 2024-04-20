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

import com.example.artgallery.service.ArtJpaService;
import com.example.artgallery.model.Art;
import com.example.artgallery.model.Artist;

@RestController
public class ArtController {

    @Autowired
    public ArtJpaService artJpaService;

    @GetMapping("/galleries/artists/arts")
    public ArrayList<Art> getArts() {
        return artJpaService.getArts();
    }

    @PostMapping("/galleries/artists/arts")
    public Art addArt(@RequestBody Art art) {
        return artJpaService.addArt(art);
    }

    @GetMapping("/galleries/artists/arts/{artId}")
    public Art getById(@PathVariable("artId") int artId) {
        return artJpaService.getById(artId);
    }

    @PutMapping("/galleries/artists/arts/{artId}")
    public Art updateArt(@PathVariable("artId") int artId, @RequestBody Art art) {
        return artJpaService.updateArt(artId, art);
    }

    @DeleteMapping("/galleries/artists/arts/{artId}")
    public void deleteArt(@PathVariable("artId") int artId) {
        artJpaService.deleteArt(artId);
    }

    @GetMapping("/arts/{artId}/artist")
    public Artist getArtArtist(@PathVariable("artId") int artId) {
        return artJpaService.getArtArtist(artId);
    }
}