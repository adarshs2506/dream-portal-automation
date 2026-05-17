# Dream Portal UI Automation Framework

## Overview
This project automates UI testing of the Dream Portal application using Selenium WebDriver, TestNG, and Java.

The framework validates functional UI behavior, data correctness, and summary statistics across multiple pages.

---

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverWait

---

## Framework Design
- Page Object Model (POM)
- Reusable utility classes
- Explicit waits for stability
- Screenshot capture on key steps
- Modular test structure

---

## Test Coverage

### 1. Home Page
- Page load verification
- "My Dreams" button click functionality
- Navigation validation

### 2. Dream Diary Page
- Validate 10 dream entries
- Verify Dream Type (Good / Bad)
- Validate table structure integrity

### 3. Summary Page
- Good Dreams = 6
- Bad Dreams = 4
- Total Dreams = 10
- Recurring Dreams = 2

---

## Test Evidence

Screenshots captured at key validation points:

- Home Page Load & Validation
- Diary Page Load & Validation
- Summary Page Load & Validation

Stored in `/screenshots` folder.

---

## How to Run

### Option 1:
Run `testng.xml` as TestNG Suite

### Option 2:  
```bash
Run testng.xml as TestNG Suite

```

### Reports 
After execution: 

TestNG Report → /test-output/index.html 
Screenshots → /screenshots/ 

👤 Author 
Adarsh Singh
