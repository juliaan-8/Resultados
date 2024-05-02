FROM openjdk:17-alpine
MAINTAINER cuchis
COPY target/Resultados-0.0.1-SNAPSHOT.jar  cuchiii-app.jar
ENTRYPOINT ["java","-jar","/cuchiii-app.jar"]