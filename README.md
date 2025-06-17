# RestApiSum

## Task Description

RestApiSum is a simple RESTful API built with Spring Boot (Java 21) that receives a list of numbers via HTTP requests and returns their sum. The project demonstrates best practices in REST API development and unit testing using Maven and JUnit.


## Technology Stack

- **Java:** 21
- **Spring Boot:** Packaged as an executable JAR
- **Build Tool:** Maven

## Prerequisites

- Java 21 installed (check with `java -version`)
- Maven 3.x installed (check with `mvn -v`)

## Quick Start

1. Clone the repository:
   git clone https://github.com/bilelmarzouki/rest-sum-api.git
2. Navigate to the project directory:
   cd rest-sum-api
3. Build the project:
   mvn clean package
4. Run the tests:
   mvn test
5. Run the application:
   mvn spring-boot:run

## Principal Files

- `src/main/java/com/example/demo/CalculatorController.java`  
  *Implements the REST API endpoint for sum calculation.*

- `src/test/java/com/example/demo/CalculatorControllerTest.java`  
  *Contains unit tests for the CalculatorController using JUnit.*


## API Endpoint and Testing

- **Endpoint:** `GET /calculator/add`
- **Query Parameter:** `numberList` (comma-separated integers)
- **Response Example:** `{ "sum": 5 }`


You can test the API endpoints using tools like Postman. Here are example requests for different input scenarios:

- **Valid Input:** 
  Example: http://localhost:8080/calculator/add?numberList=7,-7,5
  *The expected result is `5`.*

- **Null Input:**  
  Example: http://localhost:8080/calculator/add
  *(No `numberList` parameter provided)*

- **Invalid Input:**  
  Example: http://localhost:8080/calculator/add?numberList=7,-7,Adis
  *(Contains a non-numeric value: "Adis")*

- **Empty Input:**
  Example: http://localhost:8080/calculator/add?numberList=
  *(Parameter is present but the value is empty)*

## GitHub Repository

[GitHub Repository Link](https://github.com/bilelmarzouki/rest-sum-api)
