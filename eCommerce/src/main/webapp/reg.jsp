<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
</head>
<body>

<form action="registraion" method="post">
first name: <input type = "text" name="first name">
last name: <input type = "text" name="last name">
password: <input type = "password" name=" password">
 <input type="submit" value="Submit">
 <input type="reset" value="Reset">
 
 <tr>
  <td colspan="2">Already registered!! <a href="login.jsp">Login Here</a></td>
      </tr>

</form>

</body>
</html>