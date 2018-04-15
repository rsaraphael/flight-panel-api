
# flight-panel-api

Flight panel API provides an API to find and list flights of Fly Airlines.

**This solution uses Spring Boot, Lombok, PostgreSQL, Liquibase, Docker and Docker Compose**

Live demo at http://flight-panel-api.herokuapp.com
> It can take a while to load because of the start of Heroku Dyno.

## Running
`sudo docker-compose up -d`

`mvn clean install`

`mvn spring-boot:run`

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
