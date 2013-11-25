<%-- 
    Document   : listeMeds
    Created on : 12 nov. 2013, 15:38:23
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
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contenu">
        <h3>Liste des Meds :</h3>
        <table class="listeLegere">
            <th>Nom</th>
            <th>Prénom</th>
            <th>Adresse</th>
            <th>Numéro</th>
            <th>Spécialité</th>

            <c:forEach var="med" items="${listeMeds}">
                <tr>
                    <td>${med.nom} </td>
                    <td>${med.prenom}</td>
                    <td>${med.adresse}</td> 
                    <td>${med.tel} </td>
                    <td>${med.spe}</td>
                </tr>
            </c:forEach>  
        </div>       
    </body>
</html>
