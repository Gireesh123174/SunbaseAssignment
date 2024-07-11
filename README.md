# SunbaseAssignment
##Student CRUD Web Application
##This project is a Java EE web application that demonstrates CRUD (Create, Read, Update, Delete) operations on a database table using JDBC, Servlets, and JSP.

-Features
Create: Add new students to the database.
Read: Display a list of all students.
Update: Edit existing student information.
Delete: Remove a student from the database.
Prerequisites
Before running this application, ensure you have the following installed:
Java Development Kit (JDK) 8 or higher
Apache Tomcat 9.0 or compatible servlet container
MySQL or another compatible relational database
IDE (like Eclipse, IntelliJ IDEA) with support for Java EE web development
Setup
1. Clone the repository:
    git clone https://github.com/your-username/StudentCRUDApp.git
2. Database Setup:
   .Create a MySQL database named student_db.
   .Execute the following SQL script to create the students table:
        CREATE TABLE students (
           id INT PRIMARY KEY AUTO_INCREMENT,
           name VARCHAR(50),
           email VARCHAR(50),
           age INT
       );
3. Import Project into IDE:
     .Open your IDE (Eclipse, IntelliJ IDEA, etc.).
     .Import the project as a Dynamic Web Project.
4. Configure JDBC Connection:
     .Edit JDBC_Connection.java in the com.utility package to set your database connection details (URL, username, password).
5. Build the Project:
     .Build the project to resolve dependencies and compile the code.
Deployment
   1. Deploy to Tomcat:
        .Configure your IDE to deploy the application to Apache Tomcat.
        .Start Tomcat and deploy the project to the server.
   2. Access the Application:
        .Open a web browser and go to http://localhost:8080/StudentCRUDApp (replace 8080 with your Tomcat port if different).
Usage
Adding a Student:
Click on "Add New Student" on the home page (index.jsp).
Fill out the form and click "Add".
![Screenshot 2024-07-11 181852](https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/315d2767-4095-42da-a2f8-d8627598e986)
