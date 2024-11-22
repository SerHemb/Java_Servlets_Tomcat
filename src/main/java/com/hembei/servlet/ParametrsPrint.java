package com.hembei.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ParametrsPrint extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kmString = request.getParameter("km");
        String kgString = request.getParameter("kg");

        int km = Integer.parseInt(kmString);
        double kg = Double.parseDouble(kgString);

        PrintWriter writer = response.getWriter();
        writer.write("KM = " + km);
        writer.write("   KG = " + kg);
    }
}
