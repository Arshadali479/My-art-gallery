create table artist(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    genre TEXT
);

create table art(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title TEXT,
    theme TEXT,
    artistId INTEGER,
    FOREIGN KEY (artistId) REFERENCES artist(id)
);

create table gallery(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    location TEXT
);

create table artist_gallery(
    artistId INTEGER,
    galleryId INTEGER,
    PRIMARY KEY (artistId, galleryId),
    FOREIGN KEY (artistId) REFERENCES artist(id),
    FOREIGN KEY (galleryId) REFERENCES gallery(id)
);