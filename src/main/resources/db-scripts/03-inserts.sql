--liquibase formatted sql

--changeset rsaraphael:03

INSERT INTO aircraft (id, model, prefix) VALUES (1, 'EMBRAER-190', 'PJ-43');
INSERT INTO aircraft (id, model, prefix) VALUES (2, 'EMBRAER-E2-195', 'PJ-77');
INSERT INTO aircraft (id, model, prefix) VALUES (3, 'EMBRAER-E2-190', 'PJ-71');
INSERT INTO aircraft (id, model, prefix) VALUES (4, 'EMBRAER-E-175', 'PJ-73');
INSERT INTO aircraft (id, model, prefix) VALUES (5, 'EMBRAER-Legacy', 'PJ-72');

INSERT INTO location (id, city, state, country) VALUES (1, 'São José dos Campos', 'SP', 'Brazil');
INSERT INTO location (id, city, state, country) VALUES (2, 'Curitiba', 'PR', 'Brazil');
INSERT INTO location (id, city, state, country) VALUES (3, 'São Paulo', 'SP', 'Brazil');
INSERT INTO location (id, city, state, country) VALUES (4, 'Orlando', 'FL', 'United States of America');
INSERT INTO location (id, city, state, country) VALUES (5, 'Miami', 'FL', 'United States of America');
INSERT INTO location (id, city, state, country) VALUES (6, 'Fort Lauderdale', 'FL', 'United States of America');
INSERT INTO location (id, city, state, country) VALUES (7, 'Cabo Canaveral', 'FL', 'United States of America');

INSERT INTO pilot (id, name) VALUES (1, 'Joao da Silva');
INSERT INTO pilot (id, name) VALUES (2, 'Vandelei Prado');
INSERT INTO pilot (id, name) VALUES (3, 'Josefino Correa');
INSERT INTO pilot (id, name) VALUES (4, 'Jurandir Costa');
INSERT INTO pilot (id, name) VALUES (5, 'Luis Augusto');
INSERT INTO pilot (id, name) VALUES (6, 'Pedro Torres');
INSERT INTO pilot (id, name) VALUES (7, 'Mauro Dias');



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
INSERT INTO flight (id) VALUES (7843);
INSERT INTO flight (id) VALUES (7143);
INSERT INTO flight (id) VALUES (7243);
INSERT INTO flight (id) VALUES (7543);
INSERT INTO flight (id) VALUES (7743);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(1, '2018-04-11 10:00:00', '2018-04-11 16:00:00', 1, 1, 3478, 1, 2);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(2, '2018-04-17 7:00:00', '2018-04-18 17:00:00', 2, 2, 2043, 3, 4);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(3, '2018-05-11 10:00:00', '2018-07-11 16:00:00', 3, 3, 3478, 5, 6);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(4, '2018-04-11 10:00:00', '2018-08-11 16:00:00', 4, 4, 3478, 7, 1);

INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(5, '2018-07-11 10:00:00', '2018-08-11 16:00:00', 5, 5, 2044, 2, 3);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(6, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 6, 1, 2046, 4, 5);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(7, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 7, 2, 2777, 6, 7);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(8, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 1, 3, 7043, 1, 3);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(9, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 2, 4, 2743, 2, 4);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(10, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 3, 5, 7143, 5, 7);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(11, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 4, 1, 7243, 1, 7);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(12, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 5, 2, 7543, 2, 6);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(13, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 6, 3, 7743, 3, 5);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(14, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 7, 4, 2045, 7, 4);
           
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(15, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 1, 5, 2073, 7, 3);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(16, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 2, 1, 2013, 7, 2);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(17, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 3, 2, 2243, 7, 1);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(18, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 4, 3, 2843, 3, 1);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(19, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 5, 4, 7843, 3, 2);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(20, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 6, 5, 2777, 3, 3);
            
INSERT INTO itinerary (id, depart_time, arrive_time, pilot_id, aircraft_id, flight_id, origin, destination)
            values(21, '2018-06-11 10:00:00', '2018-08-11 16:00:00', 7, 1, 2777, 3, 7);
