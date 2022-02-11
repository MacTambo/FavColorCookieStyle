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
                Cookie[] cookies = request.getCookies();
                String defaultbg = "black";
                request.setAttribute("background", defaultbg);
                if (cookies != null) {
                        for (Cookie cookie : cookies) {
                                if (cookie.getName().equals("background")) {
                                        request.setAttribute("background", cookie.getValue());
                                }

                        }
                }
                if (cookies != null) {
                        for (Cookie cookie : cookies) {
                                if (cookie.getName().equals("waves")) {
                                        request.setAttribute("waves", cookie.getValue());
                                }
                        }
                }


                System.out.println(cookies);


            request.getRequestDispatcher("impose.jsp").forward(request,response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String background = request.getParameter("couleur1");
                String waves = request.getParameter("couleur2");
                request.setAttribute("background",background);
                request.setAttribute("waves",waves);

                Cookie cookieb = new Cookie("background", background);
                Cookie cookiew = new Cookie("waves", waves);
                cookieb.setMaxAge(30);
                cookiew.setMaxAge(30);
                response.addCookie(cookieb);
                response.addCookie(cookiew);

                request.getRequestDispatcher("tonStyle.jsp").forward(request,response);
        }
    }
