# Learn Spring Boot ☕️

A hands-on Spring Boot learning repository built while working through a structured tutorial and implementing the concepts along the way.

This repository serves as both a **learning project** and a **personal reference** that I can come back to whenever I need to revisit Spring Boot concepts for future projects.

## 📚 Learning Notes

I've also created a separate set of notes documenting the concepts, explanations, and things I learned throughout the tutorial.

The notes are organized by part with an easy-to-navigate table of contents:

**[📖 Spring Boot Learning Notes — Notion](https://vincenthartono.notion.site/learn-springboot)**

The notes are intended to be more useful as a long-term reference, while this repository contains the actual code and implementations.

## 🛠️ Topics Covered

Throughout the project, I worked with concepts including:

* Spring Boot fundamentals
* Dependency Injection & Beans
* REST APIs
* Controllers, Services & Repositories
* DTOs and Mappers
* ModelMapper
* Spring Data JPA
* PostgreSQL
* H2 for testing
* Entity relationships
* CRUD operations
* Partial updates
* Pagination & sorting
* Integration testing
* Maven
* Docker
* Environment-based configuration
* Deploying a Spring Boot application

## 🚀 Deployment

The application is containerized with Docker and deployed using **Render**, with PostgreSQL as the production database.

**Live API:**
https://vincenthartono-books.onrender.com

The API can be tested using tools such as **Postman** by sending requests directly to the deployed endpoints.

## 💻 Local Development

The application can also be run locally with Maven:

```bash
./mvnw spring-boot:run
```

For local development, the application connects to a local PostgreSQL database.

The project also includes a Docker configuration for building and running the application in a container.

## 🎯 Purpose

This isn't intended to be a production application. The main goal was to **understand how the different pieces of a Spring Boot application fit together** by actually implementing them rather than only reading about them.

The project and accompanying notes are something I can refer back to when building future Java/Spring applications.
