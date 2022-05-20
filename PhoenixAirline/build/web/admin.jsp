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
        <%
            if ((request.getAttribute("dc") == null)) {
                request.getRequestDispatcher("AdminDCServlet").forward(request, response);
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

        <table border="1">
            <thead>
            </thead>
            <tbody>
                <%
                    if ((request.getAttribute("result") != null)) {
                        List user_list = new ArrayList();
                        user_list = (List) request.getAttribute("result");
                        Iterator it = user_list.iterator();
                        while (it.hasNext()) {
                %>
                <tr>
                    <td><%=it.next()%></td>
                    <td><%=it.next()%></td>
                    <td><%=it.next()%></td>
                    <td><%=it.next()%></td>
                    <td><%=it.next()%></td>
                    <td><%=it.next()%></td>
                    <td><%=it.next()%></td>
                    <td><%=it.next()%></td>
                </tr>
                <%}
                    }%>
            </tbody>
        </table>



        <table border="1">
            <thead>
            </thead>
            <tbody>
                <%
                    if ((request.getAttribute("dc") != null)) {
                        List data = new ArrayList();
                        data = (List) request.getAttribute("dc");
                        Iterator itr = data.iterator();
                        while (itr.hasNext()) {
                %>
                <tr>
                    <td><%=itr.next()%></td>
                    <td><%=itr.next()%></td>
                    <td><%=itr.next()%></td>
                    <td><%=itr.next()%></td>
                    <td><%=itr.next()%></td>
                    <td><%=itr.next()%></td>
                    <td><%=itr.next()%></td>
                    <td><%=itr.next()%></td>
                </tr>
                <%}
                    }%>
            </tbody>
        </table>

    </body>
</html>