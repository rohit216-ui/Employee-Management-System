# 🧑‍💼 Employee Management System

A full-stack **Spring Boot web application** to manage employee records with authentication, CRUD operations, and a clean UI using Thymeleaf.

---

## 🚀 Features

* 🔐 Secure login using **Spring Security**
* ➕ Add new employees
* 📋 View all employees
* ✏️ Edit employee details
* ❌ Delete employees
* 🎨 UI built with **Thymeleaf**
* 🗄️ Persistent storage using **MySQL + Spring Data JPA**

---

## 🏗️ Tech Stack

* **Backend:** Spring Boot, Spring MVC
* **Security:** Spring Security (In-Memory Authentication)
* **Frontend:** Thymeleaf, HTML, CSS
* **Database:** MySQL
* **ORM:** Spring Data JPA (Hibernate)
* **Build Tool:** Maven

---

## 📂 Project Structure

```
Employee_Management_System/
│
├── controller/        # Handles HTTP requests
├── service/           # Business logic layer
├── repository/        # Data access layer (JPA)
├── model/             # Entity classes
├── config/            # Security configuration
├── templates/         # Thymeleaf HTML pages
└── application.properties
```

---

## 🔄 Application Flow

```
Controller → Service → Repository → Database
```

* Controller handles user requests
* Service contains business logic
* Repository interacts with DB

---

## 🔐 Authentication Details

* **Username:** admin
* **Password:** admin123

> Password is encrypted using **BCrypt**

---

## 📸 Screenshots

* Login Page
  <img width="1366" height="768" alt="Screenshot (202)" src="https://github.com/user-attachments/assets/abf6cf53-1386-4baf-9981-6f610f82c302" />

* Employee List
  <img width="1366" height="768" alt="Screenshot (200)" src="https://github.com/user-attachments/assets/c39847b6-a15b-487b-977a-4eec81a4fb8d" />

* Add/Edit Form
  <img width="1366" height="768" alt="Screenshot (201)" src="https://github.com/user-attachments/assets/0f7bf85b-d2b8-419c-a2c4-9a7b5c86702a" />

---

## 🎯 Learning Highlights

* Implemented **Spring Security authentication**
* Followed **MVC architecture**
* Used **Service layer for clean code separation**
* Integrated **MySQL with JPA**
* Built a **dynamic UI with Thymeleaf**

---

## 🔮 Future Enhancements

* 🔑 JWT Authentication
* 👥 Role-based access (ADMIN / USER)
* 📄 Pagination & Search
* ☁️ Deploy on cloud (AWS / Azure)
