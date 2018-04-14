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


INSERT INTO flight (id) VALUES (3478);
INSERT INTO flight (id) VALUES (2043);
INSERT INTO flight (id) VALUES (2044);
INSERT INTO flight (id) VALUES (2046);
INSERT INTO flight (id) VALUES (2045);
INSERT INTO flight (id) VALUES (2777);
INSERT INTO flight (id) VALUES (7043);
INSERT INTO flight (id) VALUES (2743);
INSERT INTO flight (id) VALUES (2073);
INSERT INTO flight (id) VALUES (2013);
INSERT INTO flight (id) VALUES (2243);
INSERT INTO flight (id) VALUES (2843);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(1, '2018-04-11 10:00:00', '2018-04-11 16:00:00', 1, 1, 3478, 1, 2);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(2, '2018-04-17 7:00:00', '2018-04-18 17:00:00', 2, 2, 2043, 3, 4);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(3, '2018-05-11 10:00:00', '2018-07-11 16:00:00', 1, 1, 3478, 4, 2);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(4, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 2, 2, 3478, 3, 1);

