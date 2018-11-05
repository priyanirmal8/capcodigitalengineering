FROM openjdk:8-jdk-alpine

RUN mkdir -p /app

ADD target/*.jar /app/app.jar

EXPOSE 8090

ENTRYPOINT [ "/usr/bin/java", "-jar", "/app/app.jar" ]
