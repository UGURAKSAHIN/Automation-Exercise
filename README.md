# 🚀 Automation Exercise Test Suite (Selenium + TestNG)

## 📌 Overview

This project is an automated end-to-end test scenario for the website **Automation Exercise** using **Java**, **Selenium WebDriver**, and **TestNG**.

The goal is to simulate a real user journey and validate critical e-commerce functionalities.

---

## 🧪 Test Scenario

The automation script performs the following steps:

1. Navigate to the website
2. Register a new user
3. Log in with the created user
4. Add a product to the cart
5. Verify the product is added successfully
6. Proceed to the payment step

---

## 🛠️ Tech Stack

* **Language:** Java
* **Automation:** Selenium WebDriver
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **Browser:** Google Chrome

---

## 📂 Project Structure

```bash
Automation-Exercise/
├── src/test/java/
│   └── AutomationExercise/
│       └── AutomationExercise.java
├── pom.xml
├── README.md
└── .github/workflows/
```

---

## ⚙️ Setup & Installation

### 1. Prerequisites

Make sure you have installed:

* Java JDK 11+
* Maven
* Google Chrome

---

### 2. Clone the Repository

```bash
git clone https://github.com/UGURAKSAHIN/Automation-Exercise.git
cd Automation-Exercise
```

---

### 3. Install Dependencies

```bash
mvn clean install
```

---

### 4. Configure WebDriver

Set your ChromeDriver path:

```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
```

> 💡 Tip: You can use WebDriverManager to avoid manual setup.

---

## ▶️ Run Tests

```bash
mvn test
```

---

## 📊 Test Output

Test results can be found in:

```bash
test-output/
```

---

## ✨ Improvements (Planned)

* Page Object Model (POM) implementation
* WebDriverManager integration
* CI/CD pipeline (GitHub Actions)
* Parallel test execution
* Reporting (Allure / Extent Reports)

---

## 📄 License

This project is licensed under the MIT License.

---

## 👤 Author

**Uğur Akşahin**

* 💼 Aspiring Backend Developer
* 🔗 GitHub: https://github.com/UGURAKSAHIN
* 🔗 LinkedIn: https://www.linkedin.com/in/uguraksahin

---
