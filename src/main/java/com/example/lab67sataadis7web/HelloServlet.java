package com.example.lab67sataadis7web;

import java.io.*;
import java.util.List;


import com.example.lab67sataadis7web.data.main.GetAnimalsImpl;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        List<Entity> animals = GetAnimalsImpl.getInstance().getAnimals();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<table>");
        out.println("<tr><td>Вид</td><td>Подвид</td><td>Семейство</td><td>Цена</td><td>Описание</td></tr>");
        animals.forEach((animal) -> {
            String var10001 = animal.getKind();
            out.println("<tr><td>" + var10001 + "</td><td>" + animal.getSubspecies() + "</td><td>" + animal.getType() + "</td><td>" + animal.getPrice() + "</td><td>" + animal.getDescription() + "</td></tr>");
        });
        out.println("</table>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}