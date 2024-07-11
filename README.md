# SunbaseAssignment
## Student CRUD Web Application
This project is a Java EE web application that demonstrates CRUD (Create, Read, Update, Delete) operations on a database table using JDBC, Servlets, and JSP.
- Prerequisites
1. Before running this application, ensure you have the following installed:
2. Java Development Kit (JDK) 8 or higher
3. Apache Tomcat 9.0 or compatible servlet container
4. MySQL or another compatible relational database
5. IDE (like Eclipse, IntelliJ IDEA) with support for Java EE web development

- Setup
1. Clone the repository:                                                                                                                                                                                          
     git clone https://github.com/your-username/StudentCRUDApp.git
2. Database Setup:                                                                                                                                                                                             
     Create a MySQL database named student_db.                                                                                                                                                                
     Execute the following SQL script to create the students table:</br>
        CREATE TABLE students ( </br>
           id INT PRIMARY KEY AUTO_INCREMENT, </br>
           name VARCHAR(50), </br>
           email VARCHAR(50), </br>
           age INT </br>
       ); </br>
4. Import Project into IDE:</br>
     - Open your IDE (Eclipse, IntelliJ IDEA, etc.).</br>
     - Import the project as a Dynamic Web Project.</br>
5. Configure JDBC Connection:</br>
     - Edit JDBC_Connection.java in the com.utility package to set your database connection details (URL, username, password).</br>
6. Build the Project:</br>
     - Build the project to resolve dependencies and compile the code.</br>
Deployment</br>
1. Deploy to Tomcat:</br>
      - Configure your IDE to deploy the application to Apache Tomcat.
        - Start Tomcat and deploy the project to the server.
   2. Access the Application:
        - Open a web browser and go to http://localhost:8080/StudentCRUDApp (replace 8080 with your Tomcat port if different).</br>

- Features
1. Create: Add new students to the database.
2. Read: Display a list of all students.
3. Update: Edit existing student information.
4. Delete: Remove a student from the database.
Usage
Adding a Student:
Click on "Add New Student" on the home page (index.jsp).
Fill out the form and click "Add".
![Screenshot 2024-07-11 181852](https://github.com/Gireesh123174/SunbaseAssignment/assets/85821830/315d2767-4095-42da-a2f8-d8627598e986)
