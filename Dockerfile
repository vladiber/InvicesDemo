FROM plainid/java-17-ubuntu:latest-master

RUN mkdir -p /app
COPY target/InvicesDemo-0.0.1-SNAPSHOT.jar /app/InvicesDemo-0.0.1-SNAPSHOT.jar

WORKDIR /app
USER appuser

CMD java  -Djava.net.preferIPv4Stack=true -jar InvicesDemo-0.0.1-SNAPSHOT.jar
