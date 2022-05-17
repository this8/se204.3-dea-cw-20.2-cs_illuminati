package com.phoenixairline.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.phoenixairline.models.User;
import com.phoenixairline.models.ConnectToDB;

public class LoginDao {

    public String authenticateUser(User loginBean) {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();
        System.out.println(username);

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String user_typeDB = "";
        int is_approvedDB = 0;

        try {
            con = ConnectToDB.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select UserType,Approved from user where Username='" + username + "' && Password='" + password + "'");

            while (resultSet.next()) {
                user_typeDB = resultSet.getString("UserType");
                is_approvedDB = resultSet.getInt("Approved");
                System.out.println(user_typeDB);
                System.out.println(is_approvedDB);

                if (user_typeDB.equals("user")) {
                    return "User_Role";
                } else if (user_typeDB.equals("staffg1") && is_approvedDB == 1) {
                    return "StaffG1_Role";
                } else if (user_typeDB.equals("staffg2") && is_approvedDB == 1) {
                    return "StaffG2_Role";
                } else if (user_typeDB.equals("admin")) {
                    return "Admin_Role";
                }
            }
        } catch (SQLException e) {
        }
        return "Invalid user credentials";
    }
}
