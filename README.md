# Chatify - Monolith Prototype

This is the initial monolithic version of the **Chatify** real-time chat application, built with Spring Boot. It includes REST APIs, WebSocket messaging, Swagger documentation, and basic unit tests.

---

## 🚀 Features

- ✅ User registration via REST API
- 💬 Real-time messaging via WebSocket (STOMP)
- 📖 API documentation via Swagger UI
- 🧪 Unit tested with JUnit and Mockito

---

## 📦 Tech Stack

- Spring Boot 3
- WebSocket + STOMP
- Spring Web
- Swagger (SpringDoc OpenAPI)
- JUnit & Mockito
- Java 17

---

## 📂 Running the Application

```bash
# In chat-app-monolith/
mvn spring-boot:run

# Swagger UI
http://localhost:8080/swagger-ui.html