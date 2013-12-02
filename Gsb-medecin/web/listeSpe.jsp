<%-- 
    Document   : index
    Created on : 4 nov. 2013, 11:53:14
    Author     : elo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <jsp:include page="entete.jsp"/>      
        <jsp:include page="sommaire.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des spé</title>
    </head>
    <body>
        <div id="contenu">
        <h3> Liste des Spécialités : </h3>
        <form action="Control?choix=listeSpe" method="post">
        <select name="spe" >
        <c:forEach var="spe" items="${listeSpe}">
            <option value="${spe.nom}">${spe.nom}</option>
             </c:forEach>   
        </select>
            <input type="submit"  value="Envoyer">
        </form>
        </div>
    </body>
</html>
