package com.phoenixairline.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ViewUsersDao {

    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public List viewRow(String su) {
        List user_details = new ArrayList();
        String full_nameDB = "";
        String emailDB = "";
        String user_typeDB = "";

        try {
            con = ConnectToDB.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from user where Username like'%" + su + "%';");

            while (resultSet.next()) {
                full_nameDB = resultSet.getString("FullName");
                emailDB = resultSet.getString("Email");
                user_typeDB = resultSet.getString("UserType");
                System.out.println(user_typeDB);

                user_details.add(full_nameDB);
                user_details.add(emailDB);
                user_details.add(user_typeDB);
                user_details.add("<br>");
            }
        } catch (SQLException e) {
        }
        return user_details;
    }
}
