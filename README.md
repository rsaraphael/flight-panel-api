

# flight-panel-api

Flight panel API provides an API to find and list flights of Fly Airlines.

**This solution uses Spring Boot, Lombok, PostgreSQL, Liquibase, Docker and Docker Compose.**

Live demo at http://flight-panel-api.herokuapp.com/flight
> It can take a while to load because of the start of Heroku Dyno.

## Requirements
- Java 8 or higher
- Maven
- Docker
- Docker compose

## Running
On the folder of the project, run this commands in order

1. `sudo docker-compose up -d`
2. `mvn clean install`
3. `mvn spring-boot:run`

The server will be avaiable at localhost:8080
> Check localhost:8080/flight to test

## Database settings
> login: flight

> password: flight

> database: flight

## Liquibase 
To reconstruct all database
> mvn liquibase:update -D liquibase.dropFirst=true

## Tests
Tests will run by default on clean install, if you want to skip
>mvn clean install -D skipTests=true
