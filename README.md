
# java_microservices

This project implements Java microservices architecture using various technologies such as Spring Boot, Spring Cloud Eureka, Spring Cloud, and microservices tools like API Gateway and Service Registry.

## Technologies Used

- Java
- Spring Boot
- Spring Cloud Eureka
- Spring Cloud
- Microservices tools (API Gateway, Service Registry)
- Spring Data JPA

## Features

- Utilizes Data Transfer Objects (DTOs) for data security:
  - Employee DTO
  - Department DTO

- API Gateway working on port: `9191`

- Department Service:
  - Contains department details including name, ID, description, code.
  - Port: `8761`

- Employee Service:
  - Contains employee details including name, ID, department code, contact information.
  - Port: `8080`

- Service Registry port: `8761`

- Fully connected architecture enabling querying in SQL using JPA.

- Utilizes Lombok to reduce boilerplate code.

- Both services' APIs depend on each other for querying data using DTOs.

## Usage

To run the project:

1. Clone the repository:

   ```
   git clone https://github.com/yourusername/java_microservices.git
   ```

2. Navigate to the project directory:

   ```
   cd java_microservices
   ```

3. Run the services using Spring Boot:

   ```
   mvn spring-boot:run
   ```

## Further Details

Feel free to explore the source code for more detailed implementation and configurations.

