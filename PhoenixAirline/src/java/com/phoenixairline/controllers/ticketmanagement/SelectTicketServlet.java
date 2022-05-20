/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.phoenixairline.controllers.ticketmanagement;

import com.phoenixairline.models.Ticket;
import com.phoenixairline.models.TicketDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectTicketServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TicketDao ticketDao = new TicketDao();
        Ticket ticketBean;
        List reservationValues = ticketDao.selectTicket();
        request.setAttribute("reservationResult", reservationValues);
        RequestDispatcher rd = request.getRequestDispatcher("userMyReservation.jsp");
        rd.forward(request, response);
    }
    
}
