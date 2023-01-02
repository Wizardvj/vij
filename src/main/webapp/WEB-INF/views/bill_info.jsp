<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Bill_Info</h2>
<body>
First_Name: ${bill.first_Name}<br>
Last_Name: ${bill.last_Name }<br>
Email: ${bill.email }<br>
Mobile: ${bill.mobile }<br>
Amount: ${bill.amount }<br>
Product:${bill.product }<br>
</body>
</html>