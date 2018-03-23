FROM openjdk:8-jdk-alpine
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.edg=file:/dev/./urandom","-Dspring.profiles.active=dev-server","-jar","app.jar"]