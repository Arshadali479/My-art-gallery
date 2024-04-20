/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * 
 * import java.util.*;
 *
 */

// Write your code here
package com.example.artgallery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

import com.example.artgallery.repository.ArtJpaRepository;
import com.example.artgallery.repository.ArtRepository;
import com.example.artgallery.repository.ArtistJpaRepository;

import com.example.artgallery.model.Art;
import com.example.artgallery.model.Artist;

@Service
public class ArtJpaService implements ArtRepository {

    @Autowired
    private ArtJpaRepository artJpaRepository;

    @Autowired
    private ArtistJpaRepository artistJpaRepository;

    @Override
    public ArrayList<Art> getArts() {
        List<Art> artList = artJpaRepository.findAll();
        ArrayList<Art> arts = new ArrayList<>(artList);
        return arts;
    }

    @Override
    public Art addArt(Art art) {
        try {
            int artistId = art.getArtist().getArtistId();
            Artist artist = artistJpaRepository.findById(artistId).get();
            art.setArtist(artist);
            return artJpaRepository.save(art);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Art getById(int artId) {
        try {
            Art art = artJpaRepository.findById(artId).get();
            return art;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Art updateArt(int artId, Art art) {
        try {
            Art newArt = artJpaRepository.findById(artId).get();
            if (art.getArtTitle() != null) {
                newArt.setArtTitle(art.getArtTitle());
            }
            if (art.getTheme() != null) {
                newArt.setTheme(art.getTheme());
            }
            if (art.getArtist() != null) {
                int artistid = art.getArtist().getArtistId();

                Artist artist = artistJpaRepository.findById(artistid).get();
                newArt.setArtist(artist);
            }
            return artJpaRepository.save(newArt);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteArt(int artId) {
        try {
            artJpaRepository.deleteById(artId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }

    @Override
    public Artist getArtArtist(int artId) {
        try {
            Art art = artJpaRepository.findById(artId).get();
            return art.getArtist();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}