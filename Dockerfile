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

WORKDIR /app
COPY pom.xml /app
COPY . /app

RUN apt-get update && apt-get install -y openjdk-17-jdk maven
RUN mvn clean package

CMD ["java", "-jar", "target/Otp1-1.0-SNAPSHOT.jar"]


