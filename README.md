# Selenium API Testing Project

## Project Overview

This project is a Selenium API Testing Framework that integrates with TestNG and RestAssured to automate API testing and web-based assignments. The framework follows a structured directory layout to support data-driven testing, file uploads, iframe handling, and window switching.

# Directory Structure
~~~
mrrajak1296-selenium-api/
├── New Microsoft Excel Worksheet.xlsx    # Data file (if applicable for data-driven tests)
├── pom.xml                               # Maven dependencies and configuration
├── src/
│   └── test/
│       └── java/
│           ├── API/
│           │   └── Testing.java          # API test cases using RestAssured
│           └── EPassignment/
│               ├── DataDriven.java       # Data-driven testing implementation
│               ├── Fileupload.java       # File upload automation script
│               ├── IframHandling.java    # Nested iframe handling script
│               └── WindowHandling.java   # Multi-window handling script
└── test-output/
    ├── emailable-report.html             # TestNG email report
    ├── index.html                        # Main test report
    ├── testng-results.xml                # Test results in XML format
    ├── junitreports/                     # JUnit format reports
    ├── Default suite/                    # TestNG default suite reports
    ├── old/                               # Older test results
~~~
## Setup Instructions

Prerequisites

Install Java 8+

Install Maven

Install TestNG plugin (if using Eclipse/IntelliJ)

Add required dependencies (see pom.xml)

## Technologies Used

Selenium WebDriver - For browser automation

RestAssured - For API testing

TestNG - For test execution and reporting

Maven - For dependency management

Java - Primary programming language

## Features

✅ API testing with RestAssured
✅ Data-driven testing using Excel
✅ Automated file upload handling
✅ Iframe switching and multi-window handling
✅ TestNG reports generation
