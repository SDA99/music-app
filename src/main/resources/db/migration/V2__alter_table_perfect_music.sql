ALTER TABLE perfect_music
ADD COLUMN image_url varchar(255);

DELETE FROM perfect_music;

insert into perfect_music (author, title, image_url) values ('Coldplay', 'Fix you', 'https://www.cgm.pl/wp-content/uploads/2021/10/Coldplay.jpg');
insert into perfect_music (author, title, image_url) values ('Coldplay', 'Paradise', 'https://www.cgm.pl/wp-content/uploads/2021/10/Coldplay.jpg');