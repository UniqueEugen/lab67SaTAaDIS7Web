package com.example.lab67sataadis7web;

import java.io.*;
import java.util.List;


import com.example.lab67sataadis7web.data.main.GetAnimalsImpl;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "animalMove", value = "/animal-move")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.setAttribute("moveType", GetAnimalsImpl.getInstance().getAnimal( request.getParameter("id")).move());
        request.setAttribute("message", "<script>" +
                "var dialog = document.querySelector('dialog');"+
                "dialog.show();"+
                "</script>");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }

    public void destroy() {
    }
}