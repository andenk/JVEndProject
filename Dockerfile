FROM openjdk:11
COPY src/
RUN javac src\main\java\org\example\App.java
CMD ["java","App"]

