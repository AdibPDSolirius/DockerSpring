FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD /build/libs/gs-spring-boot-0.1.0.jar gs-spring-boot-0.1.0.jar

ENTRYPOINT ["java", "-jar", "gs-spring-boot-0.1.0.jar"]

