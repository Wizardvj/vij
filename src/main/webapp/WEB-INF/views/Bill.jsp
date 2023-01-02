<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Bill_Section</h2>
<body>
<form action="saveBill" method="post">
<table>
<tr>
<td>First_Name</td>
<td><input type="text" name="first_Name" value=${ cont.first_Name }></td>
</tr>
<tr>
<td>Last_Name</td>
<td><input type="text" name="last_Name"  value=${ cont.last_Name }></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email"  value=${ cont.email }></td>
</tr>
<tr>
<td>mobile</td>
<td><input type="text" name="mobile"  value=${ cont.mobile }></td>
</tr>
<tr>
<td>Product</td>
<td><input type="text" name="product"></td>
</tr>
<tr>
<td>Amount</td>
<td><input type="text" name="amount"></td>
</tr>
</table>
<input type="submit" value="Generate_Bill">
</form>
</body>
</html>