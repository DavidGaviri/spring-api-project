Spring API Project

This project was developed using Spring Boot and implements a RESTful API for product management. The project follows best programming and layered architecture practices, implementing modern features such as Lombok, Functional Programming, Java Streams API, Lambdas, Method References, and Java Optional. Additionally, the data persistence layer is simulated using an in-memory list, without a real database connection.

Technologies Used

Java

Spring Boot: For creating and managing the API.

Lombok: To reduce boilerplate code such as getters, setters, and constructors.

Postman: Tool for testing the API.

Maven: For dependency management and project build.

Project Architecture

This project is structured using a layered architecture that improves maintainability and scalability:

Controller Layer: Handles HTTP requests and responses. Ensures that requests are correctly routed to the service layer.

Service Layer: Contains the business logic.

Simulated Repository Layer: Product persistence is simulated using an in-memory list that acts as temporary storage.

Data Model (Entity): Represents the data managed in the API.

Simulated Repository Layer

Instead of a real database, product data is stored in an in-memory list. This list acts as the "repository" that maintains product objects during application runtime.

Project Features

Full CRUD Operations: The API allows full operations with products, such as create, read, update, and delete.

POST: Create a new product.

GET: Retrieve products by ID and get all products.

PUT: Update an existing product.

DELETE: Delete a product by ID.

Dependency Injection: The project uses dependency injection provided by Spring for better modularity and testing.

Error Handling: The API responds properly to invalid requests or internal errors with adequate exception handling and corresponding HTTP status codes.

Use of Lombok: Reduces repetitive code for getters, setters, constructors, and toString() methods.

Use of Optional: Instead of returning null values, Optional is used to indicate that a value may or may not be present.

Use of ResponseEntity: To customize HTTP responses and provide proper status codes in all responses.

API Endpoints
Using Postman

To test this API, you can use Postman. The endpoints mentioned above are ready to be tested in Postman. Make sure to configure the corresponding HTTP methods (POST, GET, PUT, DELETE) to perform the operations.

Best Practices

API Versioning: The API is versioned, allowing future improvements without affecting existing API consumers.

Exception Handling: Exceptions are properly managed with clear error messages and appropriate HTTP responses.
