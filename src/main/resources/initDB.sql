CREATE TABLE IF NOT EXISTS master
(
    id    BIGSERIAL PRIMARY KEY ,
    player_id  BIGSERIAL ,
    login VARCHAR(20) NOT NULL ,
    password VARCHAR(20)  NOT NULL
);