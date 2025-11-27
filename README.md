# CloudQA – Selenium Test Automation

This project contains automated UI tests for the  
**Automation Practice Form** using **Java, Selenium, TestNG, and Maven**.

---

## 🚀 Features

- Automated tests for:
  - **First Name** field  
  - **Gender Selection**
  - **Mobile Number** field  
- Tests designed using *robust XPath locators*  
- Works even if HTML structure or attribute values change  

---

## 🛠 Technology Stack

| Tool | Purpose |
|------|----------|
| **Java 21** | Programming language |
| **Selenium WebDriver 4.21** | Browser automation |
| **TestNG** | Test runner / framework |
| **Maven** | Build & dependency management |
| **WebDriverManager** | Auto driver setup |
| **ChromeDriver** | Browser execution |

---

## 📂 Project Structure
CloudQA/
│── pom.xml
│── README.md
│── testng.xml
└── src/
├── main/
│ └── java/org/example/Main.java
└── test/
└── java/AutomationPracticeFormTest.java

---

## Run all tests
mvn clean test
