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
import com.example.artgallery.model.Gallery;
import com.example.artgallery.model.Artist;

public interface GalleryRepository {
    ArrayList<Gallery> getGallaries();

    Gallery addGallery(Gallery gallery);

    Gallery getById(int galleryId);

    Gallery updateGallery(int galleryId, Gallery gallery);

    void deleteGallery(int galleryId);

    List<Artist> getGalleryArtist(int galleryId);
}