package com.hembei.servlet.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet ("/get-cookie")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Cookie> list = new ArrayList<>(List.of(req.getCookies()));

        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        for (Cookie cookie : list)
            pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
        pw.println("</html>");
    }
}
