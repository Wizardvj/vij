<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListAllLeads</title>
</head>
<a href="createlead"><input type="submit" value="create_lead"></a>
<h2>List_Of_All_Leads</h2>
<body>


<table border="1">
<tr>
<th>First_Name</th>
<th>Last_Name</th>
<th>Source</th>
<th>Email</th>
<th>Mobile</th>
</tr>
  <c:forEach var = "lead" items="${lead}">
      <tr>
<th><a href="leadInfo?id=${lead.id}">${lead.first_Name }</a></th>
<th>${lead.last_Name }</th>
<th>${lead.source }</th>
<th>${lead.email }</th>
<th>${lead.mobile }</th>
</tr>  
      </c:forEach>


</table>




</body>
</html>