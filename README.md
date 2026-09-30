# Selenium Automation Framework

A Java-based Selenium automation framework created to automate web application
Login and Product modules using Selenium WebDriver, TestNG, Maven, Apache POI,
and Log4j2.

## 🚀 Project Overview

This project demonstrates the implementation of a reusable Selenium automation
framework using the Page Object Model and data-driven testing concepts.

The framework currently contains:

- Login module automation
- Product module automation
- Page Object Model
- TestNG test execution
- Excel-based test data
- Configuration management
- Logging
- Screenshot capture
- Maven dependency management

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Apache POI
- Log4j2
- Page Object Model
- Data-Driven Testing

## 📂 Project Structure

```text
src/main/java
│
├── Pages
│   ├── LoginPage.java
│   └── ProductPage.java
│
├── Tests
│   ├── BaseTest.java
│   ├── LoginTest.java
│   └── ProductTest.java
│
└── Utilities
    ├── ConfigReader.java
    ├── ExcelData_Login.java
    ├── ExcelData_Product.java
    ├── LoggerUtil.java
    └── ScreenShotUtil.java
