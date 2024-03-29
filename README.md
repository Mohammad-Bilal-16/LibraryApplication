# Library Application made by Mohammed Bilal

- ## Introduction

The Library Application is a comprehensive Java Spring Boot project designed to streamline the management and organization of a library's book inventory. It offers a robust and user-friendly solution for librarians and administrators to handle various aspects of their library operations. Leveraging the power of Java and the Spring Boot framework, along with technologies such as Spring Data JPA, MySQL, validation, and Lombok, this application provides a solid foundation for efficient library management.

### Key Features

- **Book Management:** Easily add, update, and delete books within the library inventory.
- **Search and Filtering:** Seamlessly search and filter books based on various criteria, enabling quick and efficient access to information.
- **Data Validation:** Built-in validation ensures data integrity, reducing the risk of errors in the library database.
- **User-Friendly Interface:** An intuitive and user-friendly interface makes the application accessible to both library staff and patrons.
- **Fine Management:** Track and manage fines for overdue books, ensuring accurate and transparent fine calculation.

### Why Use the Library Application?

- **Efficiency:** Automate routine library tasks, saving time and resources for more critical responsibilities.
- **Accuracy:** Minimize data entry errors through built-in validation, ensuring the integrity of the library database.
- **Scalability:** Designed to accommodate growing library collections and adapt to evolving requirements.
- **Open Source:** The application is open-source, encouraging collaboration and contributions from the community.

Whether you are managing a small community library or a large institutional resource center, the Library Application provides a flexible and scalable solution to meet your library management needs.

## Technologies
- [Java](https://www.java.com/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Validation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#validation)
- [MySQL](https://www.mysql.com/)
- [Spring Starter Web](https://spring.io/guides/gs/spring-boot/)
- [Lombok](https://projectlombok.org/)

## Features
- **CRUD Operations:**
   - Manage books and student records with Create, Read, Update, and Delete (CRUD) operations.

- **Book Issuing and Returning:**
   - Facilitate the issuance of books to students.
   - Provide a straightforward process for returning books to the library.

- **Fine Management:**
   - Track and manage fines for overdue books, ensuring accurate and transparent fine calculation.

- **Validation:**
   - Implement validation mechanisms to ensure data integrity and prevent errors in the library database.

## Prerequisites

Before you begin, ensure you have the following installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) version 1.8
- [Maven Build](https://maven.apache.org/download.cgi) version 3.6.0
- [MySQL Database](https://www.mysql.com/) version 5.7.40
- [Spring Boot Starter Parent](https://spring.io/projects/spring-boot) version 2.7.17

## Installation

1. Clone the repository:
   ```bash
   git clone  https://github.com/Mohammad-Bilal-16/LibraryApplication.git
   
## Rest api's Images (Postman , CMD)

#### Book POST API Call Postman

![Book POST API Call Postman](images/PostingBook.png)

#### Book POST on CMD
![Book POST on CMD](images/PostingBookCmd.png)

#### Student POST API Call Postman
![Student POST API Call Postman](images/PostingStudent.png)

#### Student POST on CMD
![Student POST on CMD](images/PostingStudentCmd.png)

#### Student POST **issue** API Call Postman
![Student POST **issue** API Call Postman](images/IssueingBookByStudent.png)

#### Student POST **issue** API Call CMD
![Student POST **issue** API Call CMD](images/IssueingBookByStudentCmd.png)

#### Student POST **return** API Call Postman
  ![Student POST **return** API Call Postman](images/ReturningBookLibrary.png)

#### Student POST **return** API Call CMD
  ![Student POST **return** API Call CMD](images/ReturningBookLibraryCmd.png)