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
    <jsp:forward page="/login.jsp"></jsp:forward>
    <%}%>
    <!--when page loads show user monitor table-->

    <body>
        <center><h2>Admin Home</h2></center>




        Welcome <%=session.getAttribute("admin")%>

        <div style="text-align: right"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>

        <form name="monitor" action="<%=request.getContextPath()%>/AdminDCServlet" method="POST">
            <input type="submit" value="Monitor" name="monitor"  />
        </form>

        <%
            if ((request.getAttribute("dc") != null)) {
                List list = new ArrayList();
                list = (List) request.getAttribute("dc");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    out.println(it.next());
                }
            }

        %>

        <form action="SearchUsersServlet" method="POST">
            <h3>View Users</h3>
            <input type="text" name="search_user" value="" />
            <select name="search_type">
                <option value="email">Email</option>
                <option value="username">Username</option>
            </select>
            <input type="submit" value="View Users" name="view_users" />
        </form>


        <%            if ((request.getAttribute("result") != null)) {
                List user_list = new ArrayList();
                user_list = (List) request.getAttribute("result");
                Iterator it = user_list.iterator();
                while (it.hasNext()) {
                    out.println(it.next());
                }
            }

        %>


    </body>
</html>