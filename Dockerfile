# Use OpenJDK as base image for the build stage
FROM openjdk:17-jdk-slim as build

# Set the working directory inside the container
WORKDIR /workspace

# Copy the project files into the container
COPY . .

# Package the Spring Boot application using Maven Wrapper
RUN ./mvnw package 

# Use a clean base image for the runtime stage
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /workspace

# Copy the packaged JAR from the build stage
COPY --from=build /workspace/target/todolist3-0.0.1-SNAPSHOT.jar /app/todolist3.jar

# Expose the port that Spring Boot will run on
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/todolist3.jar"]
