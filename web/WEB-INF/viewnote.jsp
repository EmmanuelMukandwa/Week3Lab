<%-- 
    Document   : viewnote
    Created on : Oct 6, 2020, 6:10:40 PM
    Author     : 672387
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p><b>Title:</b>${note.title}</p>
        <br>
        <p><b>Contents:</b></p>
        <p>${note.content}</p>
        <div>
            <a href="note?edit">Edit</a>
        </div>
    </body>
</html>
