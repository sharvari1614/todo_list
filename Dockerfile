FROM openjdk:17-jdk-slim as build

# Set the working directory inside the container
WORKDIR /app1

# Copy the jar file generated from the target directory
COPY target/todolist3-0.0.1-SNAPSHOT.jar /app1/todolist3.jar

# Expose the port that Spring Boot will run on

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "todolist3.jar"]