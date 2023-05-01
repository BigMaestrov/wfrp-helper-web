
create TABLE IF NOT EXISTS master
(
    master_id bigint PRIMARY KEY,
    login character varying(20) NOT NULL,
    password character varying(20) NOT NULL
);

create TABLE IF NOT EXISTS player
(
    player_id bigint PRIMARY KEY,
    master_id bigint NOT NULL REFERENCES master(master_id),
    login character varying(20) NOT NULL,
    password character varying(20) NOT NULL
);

create TABLE IF NOT EXISTS wallet
(
    wallet_id bigint PRIMARY KEY,
    crons integer NOT NULL,
    password character varying(20) NOT NULL
);

create TABLE IF NOT EXISTS items
(
    items_id bigint PRIMARY KEY,
    weight integer NOT NULL
);

create TABLE IF NOT EXISTS item
(
    item_id bigint PRIMARY KEY,
    items_id bigint NOT NULL REFERENCES items(items_id),
    name character varying(20) NOT NULL,
    weight integer NOT NULL,
    value integer NOT NULL,
    pickup_date character varying(20) NOT NULL
);

create TABLE IF NOT EXISTS inventory
(
    inventory_id bigint PRIMARY KEY,
    wallet_id bigint NOT NULL REFERENCES wallet(wallet_id),
    items_id bigint NOT NULL REFERENCES items(items_id)
);

create TABLE IF NOT EXISTS start_characteristics
(
    start_characteristics_id bigint PRIMARY KEY,
    movement integer NOT NULL,
    weaponSkill integer NOT NULL,
    ballisticSkill integer NOT NULL,
    strength integer NOT NULL,
    toughness integer NOT NULL,
    initiative integer NOT NULL,
    dexterity integer NOT NULL,
    leadership integer NOT NULL,
    intelligence integer NOT NULL,
    willPower integer NOT NULL,
    fellowship integer NOT NULL
);

create TABLE IF NOT EXISTS characteristics
(
    characteristics_id bigint PRIMARY KEY,
    movement integer NOT NULL,
    weaponSkill integer NOT NULL,
    ballisticSkill integer NOT NULL,
    strength integer NOT NULL,
    toughness integer NOT NULL,
    initiative integer NOT NULL,
    dexterity integer NOT NULL,
    leadership integer NOT NULL,
    intelligence integer NOT NULL,
    willPower integer NOT NULL,
    fellowship integer NOT NULL
);

create TABLE IF NOT EXISTS resilience
(
    resilience_id bigint PRIMARY KEY,
    resilience text NOT NULL,
    resolve text NOT NULL,
    motivation text NOT NULL
);

create TABLE IF NOT EXISTS ambitions
(
    ambitions_id bigint PRIMARY KEY,
    short_ambitions text NOT NULL,
    long_ambitions text NOT NULL
);

create TABLE IF NOT EXISTS description
(
    description_id bigint PRIMARY KEY,
    resilience_id bigint NOT NULL REFERENCES resilience(resilience_id),
    ambitions_id bigint NOT NULL REFERENCES ambitions(ambitions_id),
    description text NOT NULL
);

create TABLE IF NOT EXISTS experience
(
    experience_id bigint PRIMARY KEY,
    current_exp integer NOT NULL,
    spent_exp integer NOT NULL,
    total_exp integer NOT NULL
);
create TABLE IF NOT EXISTS fate
(
    fate_id bigint PRIMARY KEY,
    fate integer NOT NULL,
    fortune integer NOT NULL
);
create TABLE IF NOT EXISTS basic_skills
(
    basic_skills_id bigint PRIMARY KEY,
    art integer NOT NULL,
    athletics  integer NOT NULL,
    bribery  integer NOT NULL,
    charm  integer NOT NULL,
    charmAnimal  integer NOT NULL,
    climb  integer NOT NULL,
    cool  integer NOT NULL,
    consumeAlcohol  integer NOT NULL,
    dodge  integer NOT NULL,
    drive  integer NOT NULL,
    endurance  integer NOT NULL,
    entertain  integer NOT NULL,
    gamble  integer NOT NULL,
    gossip  integer NOT NULL,
    haggle  integer NOT NULL,
    intimidate  integer NOT NULL,
    intuition  integer NOT NULL,
    leadership  integer NOT NULL,
    melle  integer NOT NULL,
    navigation  integer NOT NULL,
    outDoorSurvival  integer NOT NULL,
    perception  integer NOT NULL,
    ride  integer NOT NULL,
    row  integer NOT NULL,
    stealth  integer NOT NULL
);
create TABLE IF NOT EXISTS start_basic_skills
(
    start_basic_skills_id bigint PRIMARY KEY,
    art integer NOT NULL,
    athletics  integer NOT NULL,
    bribery  integer NOT NULL,
    charm  integer NOT NULL,
    charmAnimal  integer NOT NULL,
    climb  integer NOT NULL,
    cool  integer NOT NULL,
    consumeAlcohol  integer NOT NULL,
    dodge  integer NOT NULL,
    drive  integer NOT NULL,
    endurance  integer NOT NULL,
    entertain  integer NOT NULL,
    gamble  integer NOT NULL,
    gossip  integer NOT NULL,
    haggle  integer NOT NULL,
    intimidate  integer NOT NULL,
    intuition  integer NOT NULL,
    leadership  integer NOT NULL,
    melle  integer NOT NULL,
    navigation  integer NOT NULL,
    outDoorSurvival  integer NOT NULL,
    perception  integer NOT NULL,
    ride  integer NOT NULL,
    row  integer NOT NULL,
    stealth  integer NOT NULL
);

create TABLE IF NOT EXISTS playable_сharacter
(
    playable_сharacter_id bigint PRIMARY KEY,
    name character varying(20) NOT NULL,
    player_id bigint NOT NULL REFERENCES player(player_id),
    inventory_id bigint NOT NULL REFERENCES inventory(inventory_id),
    start_characteristics_id bigint NOT NULL REFERENCES start_characteristics(start_characteristics_id),
    characteristics_id bigint NOT NULL REFERENCES characteristics(characteristics_id),
    description_id bigint NOT NULL REFERENCES description(description_id),
    basic_skills_id bigint NOT NULL REFERENCES basic_skills(basic_skills_id),
    start_basic_skills_id bigint NOT NULL REFERENCES start_basic_skills(start_basic_skills_id),
    fate_id bigint NOT NULL REFERENCES fate(fate_id)
);