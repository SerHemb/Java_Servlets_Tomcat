package com.hembei.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.write("<h1>Hello Bitch!</h1>");
        writer.write("<h2>Java the Best!</h2>");
        writer.write("<h3>Java the Best of the Best!</h5>");
        writer.write("<h4>Java the Best of The Best but C# .net</h4>");
    }
}
