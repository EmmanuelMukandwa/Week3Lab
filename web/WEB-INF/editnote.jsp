<%-- 
    Document   : editnote
    Created on : Oct 6, 2020, 6:11:02 PM
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
        <h2>Edit Note</h2>
        <form method="post" action="note">
        <p><b>Title:</b><input type="text" name="title" value="${note.title}"></p>
        <br>
        <p><b>Contents:</b></p>
        <p><input type="text" name="content" value="${note.content}"></p>
        <input type="submit" value="Save">
        </form>
    </body>
</html>
