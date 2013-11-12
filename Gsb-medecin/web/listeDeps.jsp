<%-- 
    Document   : index
    Created on : 4 nov. 2013, 11:53:14
    Author     : elo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> Liste des Deps : </h3>
        <form>
        <select name="dep">
        <c:forEach var="choix" items="${listeDeps}">
            <option value="${choix.num}">${choix.num}</option>
             </c:forEach>   
        </select>
            <input type="submit" value="Envoyer">
        </form>
    </body>
</html>
