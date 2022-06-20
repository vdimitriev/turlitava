## to access swagger api go to 

    http://localhost:8080/api/api-docs.html
    http://localhost:8080/api/swagger-ui/index.html

## To perform api call you'll need to call

    http://localhost:8080/api

## build and run

    $ ./mvnw clean install
    $ ./mvnw spring-boot:run
    $ ./mvnw clean install && ./mvnw spring-boot:run

## build docker image and deploy to docker hub

    $  sudo ./mvnw spring-boot:build-image
    $  sudo docker tag turlitava:1.0.0 slaviq/turlitava:1.0.0
    $  sudo docker push slaviq/turlitava:1.0.0