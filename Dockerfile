FROM openjdk:17
MAINTAINER nenakhov
COPY build/libs/JavaApplicationInDocker-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]