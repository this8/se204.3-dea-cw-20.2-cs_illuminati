<%-- 
    Document   : UpdateFlight
    Created on : May 20, 2022, 2:18:55 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Flight Details</title>
    </head>
    <body>
        <h1>Update Flight Details</h1>
        <div>
            <form method="post" action="<%=request.getContextPath()%>/UpdateFlightInfoServlet">
                Flight id <input type="text" name="flightId"/><br>
                Gate No <input type="text" name="gate"/><br>
                Takeoff_airport  <input type="text" name="takeoff_airport"/><br>
                Takeoff Time  <input type="text" name="takeoff_time"/><br>
                Takeoff Date  <input type="text" name="takeoff_date"/><br>
                Landing airport  <input type="text" name="landing_airport"/><br>
                Landing Time  <input type="text" name="landing_time"/><br>
                Landing Date  <input type="text" name="landing_date"/><br>
                <input type="submit" name="Update Flight Details"/>
                <input type="reset" name="Cancel"/>
            </form>
        </div>
    </body>
</html>
