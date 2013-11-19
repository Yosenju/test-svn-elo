<%-- 
    Document   : saisie
    Created on : 19 nov. 2013, 14:51:46
    Author     : elo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Saisie</h1>

        <form action="Control?choix=listeparnom" method="post">

            Nom : <input type="text" name="nom">
            <input type="submit" value="Envoyer">
            
        </form>

    </body>
</html>
