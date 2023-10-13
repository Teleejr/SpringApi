FROM adoptopenjdk/maven-openjdk11
ARG JAR_FILE=target/*.jar
COPY ./target/SpringApi-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]