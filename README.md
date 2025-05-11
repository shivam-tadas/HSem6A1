# Airline Management System

This is an **Airline Management System** developed using Spring Boot as part of Assignment 1 for the Honors course in Semester 6 at Shri Ramdeobaba College of Engineering and Management.

## Overview

The Airline Management System is a web application that manages airline operations, including flight scheduling, passenger bookings, and basic airline administration. It’s built with Spring Boot, leveraging its features for RESTful APIs, dependency injection, and database integration.

## Features

- **Flight Management**: Add, update, and view flight details.
- **Passenger Bookings**: Manage passenger reservations and bookings.
- **Admin Dashboard**: Basic admin functionalities to oversee operations.
- **RESTful APIs**: Expose endpoints for interacting with the system.

## Tech Stack

- **Spring Boot**: Backend framework for building the application.
- **Java**: Programming language used.
- **Maven**: Dependency management and build tool.
- **H2 Database**: In-memory database for development (can be swapped with MySQL/PostgreSQL).
- **Spring Data JPA**: For database operations.

## Prerequisites

Before running the project, ensure you have the following installed:
- Java 17 or higher
- Maven 3.6+
- Git (to clone the repository)

## Setup and Installation

1. **Clone the Repository**  
   Clone this project to your local machine:
   ```
   git clone https://github.com/shivam-tadas/HSem6A1.git
   ```

2. **Navigate to the Project Directory**  
   ```
   cd HSem6A1
   ```

3. **Build the Project**  
   Use Maven to build the project:
   ```
   mvn clean install
   ```

4. **Run the Application**  
   Start the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

5. **Access the Application**  
   Open your browser and go to:
   ```
   http://localhost:8080
   ```
   - The H2 database console (if enabled) can be accessed at `http://localhost:8080/h2-console`.

## Project Structure

- `src/main/java`: Contains the Java source code, including controllers, services, and repositories.
- `src/main/resources`: Configuration files like `application.properties`.
- `src/test/java`: Unit tests for the application.

## Usage

- **API Endpoints**: Use tools like Postman to interact with the REST APIs (e.g., `/api/flights` to list flights).
- **Admin Features**: Access admin functionalities via the app’s UI or APIs.
- **H2 Database**: Check the in-memory database for stored data during development.

## Contributing

This is a student project, but feel free to fork the repo and submit pull requests if you’d like to contribute or suggest improvements.

## License

This project is for educational purposes and does not have a specific license.
