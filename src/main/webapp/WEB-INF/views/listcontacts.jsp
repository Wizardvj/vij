<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>List_contacts</h2>
<body>
<table border="1">
<tr>
<th>First_Name</th>
<th>Last_Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Generate_Bill</th>
</tr>
  <c:forEach var = "contact" items="${contacts}">
      <tr>
<th>${contact.first_Name }</th>
<th>${contact.last_Name }</th>
<th>${contact.email }</th>
<th>${contact.mobile }</th>
<th><a href="generatebill?id=${contact.id}">Generate_Bill</a></th>
</tr>  
      </c:forEach>
      </table>
</body>
</html>