#FROM maven:3.8.5-openjdk-17 AS build
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#RUN mvn clean package -DskipTests
#
#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY --from=build /app/target/*.jar app.jar
#CMD ["java", "-jar", "target/timecal.jar"]

FROM ubuntu:latest
LABEL authors="quang"

WORKDIR /app

# Install Maven + OpenJDK
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven && \
    rm -rf /var/lib/apt/lists/*

COPY pom.xml .
COPY . .
RUN mvn package -DskipTests

CMD ["java", "-jar", "target/timecal.jar"]
