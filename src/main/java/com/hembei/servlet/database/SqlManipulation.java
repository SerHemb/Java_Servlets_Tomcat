package com.hembei.servlet.database;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet ("/database")
public class SqlManipulation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connecction = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:9999/my_database", "postgres", "parol");

            Statement statement = connecction.createStatement();
            ResultSet resultName = statement.executeQuery("SELECT name FROM users");

            while(resultName.next())
                writer.println(resultName.getString("name"));

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
