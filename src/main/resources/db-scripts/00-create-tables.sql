--liquibase formatted sql

--changeset rsaraphael:01

CREATE TABLE Flight (
    id        serial primary key,
    name       varchar(100)
);

CREATE TABLE Aircraft (
    id        serial primary key,
    model       varchar(100)
);

CREATE TABLE Pilot (
    id        serial primary key,
    name       varchar(100)
);


CREATE TABLE City (
    id        serial primary key,
    name       varchar(100)
);

CREATE TABLE Itinerary (
    id        serial primary key,
    time      timestamp,
    type      varchar(30)
);