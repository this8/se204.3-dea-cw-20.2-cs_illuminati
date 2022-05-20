package com.phoenixairline.controllers.FlightControllers;

import com.phoenixairline.models.Flight;
import com.phoenixairline.models.FlightDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddFlightInfoServlet extends HttpServlet {

     private static final long serialVersionUID = 1L;

    public AddFlightInfoServlet() {
        super();
    }
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       
      
             response.setContentType("text/html");
             int FlightId = Integer.parseInt(request.getParameter("flightId"));
             String Gate = request.getParameter("gate");
             String Takeoff_airport = request.getParameter("takeoff_airport");
             String Takeoff_time = request.getParameter("takeoff_time");
             String Takeoff_date = request.getParameter("takeoff_date");
             String Landing_airport = request.getParameter("landing_airport");
             String Landing_time = request.getParameter("landing_time");
             String Landing_date = request.getParameter("landing_date");
             
             Flight flightBean = new Flight(FlightId, Gate, Takeoff_airport, Takeoff_time, Takeoff_date, Landing_airport, Landing_time, Landing_date);
             FlightDao flightDao = new FlightDao();
             
             String result = flightDao.InsertFlightDetails(flightBean);
             PrintWriter out = response.getWriter();
             out.println(result);
             
             /*String result = registerDao.Registerindb(registerBean);
             if (result.equals("User is registered")) {
             RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
             dispatcher.include(request, response);
             } else {
             request.setAttribute("errMessage", result);
             RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
             dispatcher.include(request, response);
             }*/
      
    }
    }


