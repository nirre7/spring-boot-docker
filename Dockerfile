FROM amazoncorretto:17-alpine-jdk
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/poc-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
