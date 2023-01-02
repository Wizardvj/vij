<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Create_lead</h2>
<body>
<form action="savlead" method="post">
<table>
<tr>
<td>FirstName</td>
<td>
<input type="text" name="first_Name">
</td>
</tr>
<tr>
<td>LastName</td>
<td>
<input type="text" name="last_Name">
</td>
</tr>
<tr>
<td>Source</td>
<td>
<select name="source">
    <option value="news_paper">news_paper</option>
    <option value="radio">radio</option>
    <option value="television">television</option>
    <option value="online">online</option>
</select>
</td>
</tr>
<tr>
<td>Email</td>
<td>
<input type="text" name="email">
</td>
</tr>
<tr>
<td>Mobile</td>
<td>
<input type="text" name="mobile">
</td>
</tr>
</table>
<input type="submit" value="save">
</form>
</body>
</html>