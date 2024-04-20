/*
 * You can use the following import statements
 *
 * import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 * 
 * import javax.persistence.*;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.artgallery.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "art")
public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int artId;

    @Column(name = "title")
    private String artTitle;

    @Column(name = "theme")
    private String theme;

    @ManyToOne
    @JoinColumn(name = "artistId")

    private Artist artist;

    public Art() {
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public int getArtId() {
        return artId;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }
}