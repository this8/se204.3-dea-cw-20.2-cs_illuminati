package com.register.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.phoenixairline.models.User;
import com.phoenixairline.models.RegisterDao;

public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("inside post");
        response.setContentType("text/html");

        String name = request.getParameter("full_name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String user_type = request.getParameter("user_type");

        User registerBean = new User(name, email, username, password, user_type);
        RegisterDao registerDao = new RegisterDao();

        String result = registerDao.Registerindb(registerBean);
        if (result.equals("User is registered")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
            dispatcher.include(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("views/register.jsp");
            dispatcher.include(request, response);
        }
    }
}
