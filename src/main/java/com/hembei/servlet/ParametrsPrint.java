package com.hembei.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ParametrsPrint extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request, response);
//        String kmString = request.getParameter("km");
//        String kgString = request.getParameter("kg");
//
//        int km = Integer.parseInt(kmString);
//        double kg = Double.parseDouble(kgString);
//
//        System.out.println("KM = " + km);
//        System.out.println("KG = " + kg);
    }
}
