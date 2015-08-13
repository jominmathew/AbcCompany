<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>

<% (request.getAttribute("errorMessage") != null) { %>
<%= request.getAttribute("errorMessage") %>
<%} %>
<body>
<form action="login" method="post">
userId: <input type="text" name="userId"><br />
password: <input type="password" name="password"><br />
        <input type="submit" value="Login">
        <input type="reset"  value="reset">
        
        <tr>
     <td colspan="2">Yet Not Registered!! <a href="reg.jsp">Register Here</a></td>
     </tr>
</form>
</body>
</html>