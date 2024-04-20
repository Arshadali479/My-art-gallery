insert into artist(name, genre)
VALUES('Leonardo da Vinci', 'Renaissance');

insert into artist(name, genre)
VALUES('Vincent van Gogh', 'Post-Impressionism');

insert into artist(name, genre)
VALUES('Pablo Picass', 'Cubism');

insert into artist(name, genre)
VALUES('Edward Hopper', 'American Modernism');


insert into art(title, theme, artistId)
VALUES('The Flight Study', 'Studies of Bird Wings', 1);

insert into art(title, theme, artistId)
VALUES('Mona Lisa 2.0', 'Renaissance Portrait', 1);

insert into art(title, theme, artistId)
VALUES('Starry Countryside', 'Night Landscape', 2);

insert into art(title, theme, artistId)
VALUES('Sunflower Impressions', 'Floral', 2);

insert into art(title, theme, artistId)
VALUES('Cubist Self-Portrait', 'Abstract Portrait', 3);

insert into art(title, theme, artistId)
VALUES('Barcelona Abstracted', 'City Landscape', 3);

insert into art(title, theme, artistId)
VALUES('Downtown Solitude', 'Urban Scene', 4);

insert into art(title, theme, artistId)
VALUES('Night Cafe Redux', 'Modernist Interior', 4);



insert into gallery(name, location)
VALUES('Louvre Museum', 'Paris');

insert into gallery(name, location)
VALUES('Van Gogh Museum', 'Amsterdam');

insert into gallery(name, location)
VALUES('Museo Picasso', 'Barcelona');

insert into gallery(name, location)
VALUES('Whitney Museum of American Art', 'New York');


insert into artist_gallery(artistId, galleryId)
VALUES(1, 1);

insert into artist_gallery(artistId, galleryId)
VALUES(1, 2);

insert into artist_gallery(artistId, galleryId)
VALUES(2, 2);

insert into artist_gallery(artistId, galleryId)
VALUES(3, 3);

insert into artist_gallery(artistId, galleryId)
VALUES(3, 4);

insert into artist_gallery(artistId, galleryId)
VALUES(4, 4);