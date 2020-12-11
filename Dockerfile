FROM openjdk:11
COPY ./target/JVSlutProject-1.0-SNAPSHOT.jar / 
CMD ["java","-jar","JVSlutProject-1.0-SNAPSHOT.jar"]