# Spring Boot and Redis 
Repository with a very simple example of a Spring Boot (2.0.5) application using Java 8, Gradle, Redis and a GET Restfull web service example.

## Environment
- Docker
- Java 8
- Gradle 5.4.1
- Spring Boot 2.0.5

## Configuration
- application.properties

## Pre-requisites
### Redis configuration (on macos or linux) using Docker
Before start this Spring Boot Application, please, starts Redis with the following command:
```
docker run -it --name redis -p 6379:6379 redis
```

When you starts this App, request the endpoint (e.g. http://localhost:8080/redis) with GET and you can check the key in your REDIS using the following command command line redis-cli and press enter
```
docker exec -it redis /bin/bash
```
after that, execute the following command and press enter:
```
redis-cli 
```
For more REDIS cli commands please check in : https://redis.io/commands/keys 
