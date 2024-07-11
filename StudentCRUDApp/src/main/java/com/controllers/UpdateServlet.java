package com.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.JDBC_Connection;


@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Retrieve parameters
            String idParam = request.getParameter("id");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String ageParam = request.getParameter("age");

            // Ensure parameters are not null or empty
            if (idParam == null || idParam.isEmpty() || name == null || name.isEmpty() || email == null || email.isEmpty() || ageParam == null || ageParam.isEmpty()) {
                throw new IllegalArgumentException("Missing parameters");
            }

            // Parse parameters
            int id = Integer.parseInt(idParam);
            int age = Integer.parseInt(ageParam);

            // Update the student in the database
            try (Connection connection = JDBC_Connection.getConnection()) {
                String sql = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, name);
                statement.setString(2, email);
                statement.setInt(3, age);
                statement.setInt(4, id);
                statement.executeUpdate();
            }

            // Redirect to the list
            response.sendRedirect("list");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid input");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}