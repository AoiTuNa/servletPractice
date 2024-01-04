package com.nhnacademy.hello;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class multiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/form.html");
        dispatcher.forward(req,resp);
    }

    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException{
        String[] values = req.getParameterValues("class");
        try(PrintWriter out = resp.getWriter()){
            for(String value : values){
                out.println(value);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
