/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoenixairline.models;

/**
 *
 * @author yasas
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    public String Registerindb(User registerBean) {
        Connection con = ConnectToDB.createConnection();

        String query = "INSERT INTO user (Username, FullName, Email, Password, UserType) VALUES (?,?,?,?,?) ";
        int i = 0;
        try {

            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setString(1, registerBean.getUsername());
            stmt.setString(2, registerBean.getFull_name());
            stmt.setString(3, registerBean.getEmail());
            stmt.setString(4, registerBean.getPassword());
            stmt.setString(5, registerBean.getUser_type());

            i = stmt.executeUpdate();

        } catch (SQLException e) {

        }

        if (i != 0) {
            return "User is registered";
        } else {
            return "Error!!!!";
        }
    }
}
