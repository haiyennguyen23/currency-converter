package com.example.javawebcurrencyconverter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet",urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.getParameter("rate"): Lay ve gia tri cua tham so "rate" trong truong input text. Chuyen gia tri nay sang so thuc va gan vao bien "rate"
        float rate = Float.parseFloat(request.getParameter("rate"));
        //request.getParameter("usd"): lấy về giá trị của tham số "usd" trong trường input text. Chuyển giá trị này sang số thực và gán vào biển usd.
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + rate+ "</h1>");
        writer.println("<h1>USD: " + usd+ "</h1>");
        writer.println("<h1>VND: " + vnd+ "</h1>");
        writer.println("</html>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
