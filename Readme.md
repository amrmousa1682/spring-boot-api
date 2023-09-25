# Spring Boot API

This is a sample Spring Boot API project that provides endpoints for managing users, advertisements, and categories.

## Prerequisites

- Java 17
- Docker Compose

## Getting Started

1. Clone the repository:

```
git clone https://github.com/amrmousa1682/spring-boot-api
```

2. Navigate to the project directory:

```
cd project-directory
```

3. Build the project:

```shell
mvn clean package
```

4. Run the application using Docker Compose:

```shell
docker-compose up
```

This will start the API and its dependencies (database) using Docker Compose.

## API Documentation

Once the application is running, you can access the API endpoints using the following base URL:

```
http://localhost:8080
```

The available endpoints are as follows:

### User Endpoints

- `POST /user`: Create a new user.
- `GET /user/{id}`: Get user information by ID.
- `PUT /user/{id}`: Update user information by ID.
- `DELETE /user/{id}`: Delete a user by ID.

### Advertise Endpoints

- `POST /advertise`: Create a new advertisement.
- `GET /advertise`: Get all advertisements.
- `GET /advertise/{id}`: Get advertisement information by ID.
- `GET /advertise?prefix={prefix}`: Get advertisements by prefix.
- `GET /advertise?categoryId={categoryId}`: Get advertisements by category ID.
- `GET /advertise?prefix={prefix}&categoryId={categoryId}`: Get advertisements by prefix and category ID.
- `PUT /advertise/{id}`: Update advertisement information by ID.
- `DELETE /advertise/{id}`: Delete an advertisement by ID.

### Category Endpoints

- `POST /category`: Create a new category.
- `GET /category`: Get all categories.
- `GET /category/{id}`: Get category information by ID.
- `GET /category?prefix={prefix}`: Get categories by prefix.
- `PUT /category/{id}`: Update category information by ID.
- `DELETE /category/{id}`: Delete a category by ID.


## Entity-Relationship Diagram (ERD)

![ERD](..%2Fmermaid-diagram-2023-09-25-225252.svg)


## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or create a pull request.
Certainly! Here's an updated version of the README file that uses Maven instead of Gradle:

## License

This project is licensed under the [MIT License](LICENSE.txt).
