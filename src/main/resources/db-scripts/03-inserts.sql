--liquibase formatted sql

--changeset rsaraphael:03

INSERT INTO aircraft (id, model, prefix) VALUES (1, 'EMBRAER-190', 'PJ-43');
INSERT INTO aircraft (id, model, prefix) VALUES (2, 'EMBRAER-E2', 'PJ-77');

INSERT INTO location (id, city, state, country) VALUES (1, 'São José dos Campos', 'SP', 'Brazil');
INSERT INTO location (id, city, state, country) VALUES (2, 'Curitiba', 'PR', 'Brazil');
INSERT INTO location (id, city, state, country) VALUES (3, 'São Paulo', 'SP', 'Brazil');
INSERT INTO location (id, city, state, country) VALUES (4, 'Orlando', 'FL', 'United States of America');

INSERT INTO pilot (id, name) VALUES (1, 'Joao da Silva');
INSERT INTO pilot (id, name) VALUES (2, 'Vandelei Prado');


INSERT INTO flight (id,  origin, destination) VALUES (3478, 1, 2);
INSERT INTO flight (id,  origin, destination) VALUES (2043, 3, 4);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id)
            values(1, '2018-04-11 10:00:00', '2018-04-11 16:00:00', 1, 1, 3478);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id)
            values(2, '2018-04-17 7:00:00', '2018-04-18 17:00:00', 2, 2, 2043);

