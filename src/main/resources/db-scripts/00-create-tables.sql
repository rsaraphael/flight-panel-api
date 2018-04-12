--liquibase formatted sql

--changeset rsaraphael:01

CREATE TABLE Flight (
    id        serial primary key
);

CREATE TABLE Aircraft (
    id        serial primary key,
    model     varchar(100),
    prefix    varchar(100)
);

CREATE TABLE Pilot (
    id        serial primary key,
    name      varchar(100)
);


CREATE TABLE Location (
    id        serial primary key,
    city       varchar(100),
    state      varchar(100),
    country    varchar(100)
);

CREATE TABLE Itinerary (
    id               serial primary key,
    DEPART_TIME      timestamp without time zone,
    ARRIVE_TIME      timestamp without time zone
);