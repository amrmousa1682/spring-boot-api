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

![ERD](https://github.com/amrmousa1682/spring-boot-api/assets/70464867/b4fc9f92-48b3-41e9-982a-74260e4df4d9)

