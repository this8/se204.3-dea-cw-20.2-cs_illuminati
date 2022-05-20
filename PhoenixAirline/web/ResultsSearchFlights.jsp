<%-- 
    Document   : ResultsSearchFlights
    Created on : May 20, 2022, 11:55:58 AM
    Author     : dell
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Searched values</title>
    </head>
    <body>
        <h1>Searched Results</h1>
        
          
         <%
            List searchFlight_details = new ArrayList();
            searchFlight_details = (List) request.getAttribute("result");
            Iterator it = searchFlight_details.iterator();
            while (it.hasNext()) {
                out.println(it.next());
            }


        %>
        
    </body>
</html>
