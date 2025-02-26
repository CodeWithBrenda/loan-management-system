A Loan Management System built with Spring Boot and REST APIs for managing loan applications, approvals, and repayments. Uses Java, Maven, and Spring Data JPA.
loan-management-system/
│── src/main/java/com/brenda/loan_management_system/
│   ├── controller/        # Handles API requests (REST Controllers)
│   ├── service/           # Business logic (Service Layer)
│   ├── repository/        # Data Access Layer (DAO)
│   ├── model/             # Entity Classes (Models)
│   ├── exception/         # Custom Exceptions
│   ├── config/            # Configuration files
│   ├── LoanManagementSystemApplication.java  # Main Spring Boot App
│
│── src/main/resources/
│   ├── application.properties  # Spring Boot Configurations
│   ├── static/                 # Static files (HTML, CSS, JS if applicable)
│   ├── templates/              # Thymeleaf templates
│
│── src/test/java/com/brenda/loan_management_system/ # Unit Tests
│
├── pom.xml      # Maven dependencies
└── README.md    # Project documentation
