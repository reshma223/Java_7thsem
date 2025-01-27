package com.innovator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head><title>Welcome Page</title></head>");
            out.println("<body>");
            out.println("<h1>Hello, welcome to the Servlet!</h1>");
            out.println("<h1>NewServlet at " + request.getContextPath() + "</h1>");
            String user = request.getParameter("user");
            if (user != null && !user.isEmpty()) {
                out.println("<h2>Welcome " + user + "! to my servlet page.</h2>");
            } else {
                out.println("<h2>Welcome to my servlet page.</h2>");
            }
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
