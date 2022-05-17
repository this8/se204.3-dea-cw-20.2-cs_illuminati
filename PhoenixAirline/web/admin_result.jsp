<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Admin Page</title>
    </head>
    <% //In case, if Admin session is not set, redirect to Login page
        if ((request.getSession(false).getAttribute("admin") == null)) {
    %>
    <jsp:forward page="/views/login.jsp"></jsp:forward>
    <%}%>
    <body>
        <center><h2>Admin Home</h2></center>

        Welcome <%=request.getAttribute("username")%>

        <div style="text-align: right"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>

        <form action="ViewUsersServlet" method="POST">
            <h3>View Users</h3>
            <input type="text" name="search_username" value="" />
            <input type="submit" value="View Users" name="view_users" />
        </form>

        <%
            List user_list = new ArrayList();
            user_list = (List) request.getAttribute("result");
            Iterator it = user_list.iterator();
            while (it.hasNext()) {
                out.println(it.next());
            }
            

        %>

    </body>
</html>