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

import com.example.artgallery.service.GalleryJpaService;
import com.example.artgallery.model.Gallery;
import com.example.artgallery.model.Artist;

@RestController
public class GalleryController {

    @Autowired
    public GalleryJpaService galleryJpaService;

    @GetMapping("/galleries")
    public ArrayList<Gallery> getGallaries() {
        return galleryJpaService.getGallaries();
    }

    @PostMapping("/galleries")
    public Gallery addGallery(@RequestBody Gallery gallery) {
        return galleryJpaService.addGallery(gallery);
    }

    @GetMapping("/galleries/{galleryId}")
    public Gallery getById(@PathVariable("galleryId") int galleryId) {
        return galleryJpaService.getById(galleryId);
    }

    @PutMapping("/galleries/{galleryId}")
    public Gallery updateGallery(@PathVariable("galleryId") int galleryId, @RequestBody Gallery gallery) {
        return galleryJpaService.updateGallery(galleryId, gallery);
    }

    @DeleteMapping("/galleries/{galleryId}")
    public void deleteGallery(@PathVariable("galleryId") int galleryId) {
        galleryJpaService.deleteGallery(galleryId);
    }

    @GetMapping("/galleries/{galleryId}/artists")
    public List<Artist> getGalleryArtist(@PathVariable("galleryId") int galleryId) {
        return galleryJpaService.getGalleryArtist(galleryId);
    }
}