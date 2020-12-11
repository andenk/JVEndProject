FROM openjdk:11
COPY ./src/main/java/org/example/Main/ContactBook/ / 
COPY ./src/main/java/org/example/Main/ /
COPY ./src/main/java/org/example/Contact/ / 
<<<<<<< HEAD
COPY ./src/main/java/org/example/ContactManagement/ /  
RUN javac App.java
CMD ["java","App"]
=======
COPY ./src/main/java/org/example/contactmanagement/ /  
RUN javac App.java
CMD ["java","App"]
>>>>>>> efc6faa0f252ee862718bf45919b9b6907f4d107
