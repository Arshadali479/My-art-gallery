/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.artgallery.repository;

import java.util.*;

import com.example.artgallery.model.Artist;
import com.example.artgallery.model.Gallery;
import com.example.artgallery.model.Art;

public interface ArtistRepository {
    ArrayList<Artist> getArtist();

    Artist addArtist(Artist artist);

    Artist getById(int artistId);

    Artist updateArtist(int artistId, Artist artist);

    void deleteArtist(int artistId);

    List<Art> getArtistArt(int artistId);

    List<Gallery> getArtistGallery(int artistId);
}