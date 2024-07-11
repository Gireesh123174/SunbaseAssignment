package com.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.JDBC_Connection;


@WebServlet("/list")
public class ReadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultSet resultSet = null;
        try {
            Connection connection = JDBC_Connection.getConnection();
            String sql = "SELECT * FROM students";
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            request.setAttribute("resultSet", resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}