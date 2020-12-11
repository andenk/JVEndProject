FROM openjdk:11
COPY ./target/  
RUN javac JVSlutProject-1.0-SNAPSHOT.jar
CMD ["java","JVSlutProject-1.0-SNAPSHOT"]