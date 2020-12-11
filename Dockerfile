FROM openjdk:11
COPY /src/main/java/org/example/Main/App.java /
RUN javac /src/main/java/org/example/Main/App.java /
CMD ["java","App"]

