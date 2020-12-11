FROM openjdk:11
COPY ./src/main/java/org/example/Main/ContactBook/ / 
COPY ./src/main/java/org/example/Main/ /
COPY ./src/main/java/org/example/Contact/ / 
COPY ./src/main/java/org/example/contactmanagement/ /  
RUN javac App.java
CMD ["java","App"]