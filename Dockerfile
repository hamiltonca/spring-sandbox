FROM amazoncorretto

WORKDIR /opt

COPY target/spring-sandbox-0.0.1-SNAPSHOT.jar /opt/

CMD java -jar spring-sandbox-0.0.1-SNAPSHOT.jar
