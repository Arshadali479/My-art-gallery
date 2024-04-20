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

import com.example.artgallery.model.Art;
import com.example.artgallery.model.Artist;

public interface ArtRepository {
    ArrayList<Art> getArts();

    Art addArt(Art art);

    Art getById(int artId);

    Art updateArt(int artId, Art art);

    void deleteArt(int artId);

    Artist getArtArtist(int artId);
}