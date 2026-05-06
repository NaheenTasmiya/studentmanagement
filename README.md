# 🎓 Student Employee Management System

## 📌 Project Description
This is a Java-based desktop application developed using *Java Swing, **JDBC, and **MySQL*.  
It helps manage employee records with a simple and user-friendly interface.

---

## 🚀 Features
- 🔐 Login System
- ➕ Add Employee
- 📋 View Employees
- ✏️ Update Employee
- ❌ Delete Employee
- 📊 JTable for data display

---

## 🛠️ Technologies Used
- Java (Swing)
- JDBC
- MySQL Database

---

## 🗄️ Database Setup

```sql
CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE,
    phone VARCHAR(15)
);

CREATE TABLE users (
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users VALUES ('admin', 'admin123');
