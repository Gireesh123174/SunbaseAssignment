<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.utility.JDBC_Connection" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Student</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
            width: 80%;
            max-width: 500px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        input[type="number"] {
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 0px;
        }
        input[type="submit"] {
            padding: 10px 20px;
            border: none;
            background-color: #007bff;
            color: #fff;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .back-button {
            margin-top: 20px;
            text-align: center;
        }
        .back-button a {
            text-decoration: none;
            color: #fff;
            background-color: #28a745;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .back-button a:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Update Student</h2>
    <%
        String idParam = request.getParameter("id");
        if (idParam == null || idParam.isEmpty()) {
            out.println("Invalid student ID");
            return;
        }

        int id = Integer.parseInt(idParam);
        String name = "";
        String email = "";
        int age = 0;

        try (Connection connection = JDBC_Connection.getConnection()) {
            String sql = "SELECT * FROM students WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                age = resultSet.getInt("age");
            } else {
                out.println("No student found with ID: " + id);
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    %>
    <form action="update" method="post">
        <input type="hidden" name="id" value="<%= id %>">
        <label for="name">Name</label>
        <input type="text" name="name" id="name" value="<%= name %>" required>
        <label for="email">Email</label>
        <input type="email" name="email" id="email" value="<%= email %>" required>
        <label for="age">Age</label>
        <input type="number" name="age" id="age" value="<%= age %>" required>
        <input type="submit" value="Update">
    </form>
    <div class="back-button">
        <a href="list">Back to List</a>
    </div>
</div>
</body>
</html>
