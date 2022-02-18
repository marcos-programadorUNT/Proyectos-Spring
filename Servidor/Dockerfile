FROM openjdk:11 as build
VOLUME /tmp
EXPOSE 8761
ARG JAR_FILE=target/Servidor-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} dockerservidor.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerservidor.jar"]
