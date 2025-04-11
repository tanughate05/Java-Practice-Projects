package com.example.creditdemoproject;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Cerdit")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html");
        Integer number = Integer.valueOf(request.getParameter("number"));
        String expiryDate  =request.getParameter("expiryDate");
        Integer cvv =Integer.valueOf(request.getParameter("cvv"));
        String name = request.getParameter("name");

        System.out.println(number+ " "+expiryDate+" "+cvv+" "+name);

        Verficitaion objec = new Verficitaion();
        boolean result = false;
        try {
            result = objec.verifyuser(number,expiryDate,cvv,name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PrintWriter out = response.getWriter();
        if (result == true)
        {
            out.println("User verified");

        }
        else
        {
            out.println("User NOT verified");
        }


        // Hello
          // PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
    }


}