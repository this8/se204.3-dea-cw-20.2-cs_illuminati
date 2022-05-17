<%-- 
    Document   : register
    Created on : May 7, 2022, 2:40:14 PM
    Author     : yasas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register</h1>
        <div>
            <form name="register" action="<%=request.getContextPath()%>/RegisterServlet" method="POST">
                Full Name:<input type="text" name="full_name" value="" /><br/>
                Username:<input type="text" name="username" value="" /><br/>
                Email:<input type="text" name="email" value="" /><br/>
                Password:<input type="password" name="password" value="" /><br/>
                Retype Password:<input type="password" name="r_password" value="" /><br/>
                User Type:<select name="user_type">
                    <option value="user">User</option>
                    <option value="staffg1">Grade 1 Staff</option>
                    <option value="staffg2">Grade 2 Staff</option>
                    <!--                    <option value="admin">Admin</option>-->
                </select><br/>
                <input type="submit" value="Register" />
                <input type="reset" value="Cancel" />
            </form>
            <a href="login.jsp">Login</a>
        </div>
    </body>
</html>
