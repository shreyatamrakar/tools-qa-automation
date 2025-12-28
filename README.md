# tools-qa-automation

## Project Description
This project is a Selenium-based **test automation framework** developed to learn, practice automating web component, elements and workflows on **https://demoqa.com/**.  
It is built using **Java, Selenium WebDriver, TestNG, and Maven**, following best practices such as **Page Object Model (POM)**, **thread-safe WebDriver handling**, and **configuration-driven execution**.

---

## Technology Stack
- Java
- Selenium WebDriver
- TestNG
- Maven

---

## Project Structure
```
src
├── main
│ ├── java
│ │ └── org.pkgname.com
│ │ ├── base
│ │ │ ├── BasePage.java
│ │ │ └── BaseTest.java
│ │ ├── pages
│ │ │ └── (Page Object Model classes)
│ │ └── utils
│ │ ├── BrowserFactory.java
│ │ ├── ConfigReader.java
│ │ ├── Constants.java
│ │ └── DriverManager.java
│ └── resources
│ └── config.properties
│
├── test
│ └── java
│ └── org.pkgname.com
│ └── (Test classes)
```

## Framework Design

### BasePage
- Parent class for all page objects  
- Initializes web elements using `PageFactory`  
- Provides access to the thread-safe WebDriver instance  

---

### BaseTest
- Handles test setup and teardown using TestNG annotations - @BeforeMethod and @AfterMethod
- Launches configured browser and navigates to base URL before each test

---

### BrowserFactory
- Creates browser instances dynamically  
- Currently supports Chrome and Firefox  
- Uses WebDriverManager to manage browser drivers  

---

### DriverManager
- Manages WebDriver instances using `ThreadLocal`  
- Enables parallel test execution
- Ensures thread safety

---

### ConfigReader & Constants
- Reads configuration values from `config.properties`
- Centralized configuration handling

---

## Future Enhancements
- Test reporting
- Screenshot capture on test failure
- Logging using Log4j
