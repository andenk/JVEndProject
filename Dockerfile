FROM debian:stretch
RUN apt update
RUN apt --yes install openjdk-11-jdk
COPY src/main/java/org/example/Main/
RUN javac App.java
CMD ["java","App"]

