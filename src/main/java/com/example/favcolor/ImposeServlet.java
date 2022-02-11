package com.example.favcolor;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "imposeServlet", value = "/impose-servlet")
public class ImposeServlet extends HttpServlet {

        @Override
        public void init() throws ServletException {
        }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("impose.jsp").forward(request,response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                request.getRequestDispatcher("tonStyle.jsp").forward(request,response);
        }
    }
