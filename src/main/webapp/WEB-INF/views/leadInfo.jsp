<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Lead_Info</h2>
<body>

 first_Name: ${lead.first_Name}  <br>
 last_Name: ${lead.last_Name}  <br>
 source: ${lead.source}  <br>
 email: ${lead.email}  <br>
 mobile: ${lead.mobile}  <br>
 
 <form action="converLead" method="post">
 <input type="hidden" name="id" value="${lead.id }">
 <input type="submit" value="convert">
 </form>
</body>
</html>