package com.phoenixairline.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketDao {

    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
//Insert ticket details method
    public void createTicket(Ticket ticketBean) {
        //get values from ticketBean
        UUID userId = ticketBean.getUserId();
        UUID fhacId = ticketBean.getFhacId();
        String passportNumber = ticketBean.getPassportNumber();
        String bookingDate = ticketBean.getBookingDate();
        String classType = ticketBean.getClassType();
        int numberOfSeats = ticketBean.getNumberOfSeats();
        String totalPrice = ticketBean.getTotalPrice();

        con = ConnectToDB.createConnection();
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("INSERT INTO booking (user_id,fhac_id,passport_number,booking_date,class,number_of_seats,total_price) Values '" + userId + "','" + fhacId + "','" + passportNumber + "','" + bookingDate + "','" + classType + "','" + numberOfSeats + "','" + totalPrice + "' ;");
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Select ticket detals method
    public List selectTicket() {
        List reservationList = new ArrayList();
        //get current user id
        String currentUserId = "";
        con = ConnectToDB.createConnection();
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM booking WHERE user_id='" + currentUserId + "';");
            while (resultSet.next()) {
                reservationList.add(resultSet.getString("passport_number"));
                reservationList.add(resultSet.getString("booking_date"));
                reservationList.add(resultSet.getString("class"));
                reservationList.add(resultSet.getString("number_of_seats"));
                reservationList.add(resultSet.getString("total_price"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reservationList;
    }
//update ticket details method
    public void updateTicket(Ticket ticketBean) {
        UUID bookingId = ticketBean.getUserId();
        UUID fhacId = ticketBean.getFhacId();
        String passportNumber = ticketBean.getPassportNumber();
        String bookingDate = ticketBean.getBookingDate();
        String classType = ticketBean.getClassType();
        int numberOfSeats = ticketBean.getNumberOfSeats();
        String totalPrice = ticketBean.getTotalPrice();

        con = ConnectToDB.createConnection();
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("UPDATE INTO booking SET fhac_id='" + fhacId + "',passport_number='" + passportNumber + "',booking_date='" + bookingDate + "',class='" + classType + "',number_of_seats='" + numberOfSeats + "',total_price='" + totalPrice + "' WHERE booking_id='" + bookingId + "' ;");
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//delete ticket details method
    public void deleteTicket(Ticket ticketBean) {
        UUID bookingId = ticketBean.getUserId();

        con = ConnectToDB.createConnection();
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("DELECT FROM booking WHERE bookin_id='" + bookingId + "' ;");
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
