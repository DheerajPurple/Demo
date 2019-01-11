FROM openjdk:8
ADD /target/Demo-0.0.1-SNAPSHOT.jar Demo-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","Demo-0.0.1-SNAPSHOT.jar"]
