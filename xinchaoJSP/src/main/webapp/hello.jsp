<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thu Nghiem 1</title>
</head>
<body>
<h1>HELLO JSP</h1>
<h2>Expression Try</h2>
<%=4+10 %>
<hr>
<h1>NOW:</h1>
<%= new Date().getDate() %>
<p> END </p>
</body>
</html>