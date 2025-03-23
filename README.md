# AUTOMATION EXERCISE WITH SELENIUM & TESTNG

Project Overview
This project automates a test scenario for the website Automation Exercise using Java, Selenium, and TestNG. The script performs the following steps:

1- Navigate to the website
2️- Register a new user
3️- Log in with the newly created user
4️- Add a product to the card
5️- Verify that the product is added successfully
6️- Proceed to the payment step

# TECH STACK & TOOLS USED
- Programming Language: Java
- Testing Framework: TestNG
- Automation Tool: Selenium WebDriver
- Dependency Management: Maven
- Browser: Chrome (via ChromeDriver)

  # PROJECT STRUCTURE
  automation-exercise/
│── src/
│   ├── test/
│   │   ├── base/
│   │   │   ├── BaseTest.java  // Setup & teardown methods
│   │   ├── pages/
│   │   │   ├── HomePage.java  // Homepage interactions
│   │   │   ├── RegisterPage.java  // Registration process
│   │   │   ├── LoginPage.java  // Login interactions
│   │   │   ├── ProductPage.java  // Adding products to cart
│   │   │   ├── CartPage.java  // Cart verification
│   │   │   ├── CheckoutPage.java  // Proceeding to payment
│   │   ├── tests/
│   │   │   ├── AutomationExerciseTest.java  // Main test cases
│── pom.xml  // Dependencies
│── README.md  // Project details
│── testng.xml  // TestNG configuration file
