<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body>
<h1>${Header }</h1>
<p>${Desc }</p>
      <%-- <h1>Welcome, ${user.userName }</h1>
      <h1>Your email address is ${user.email }</h1>
      <h1>Your Password is ${user.password } try to save the password</h1> --%>
      
      <h1>Welcome, ${student.userName }</h1>
      <h1>Your email address is ${student.email }</h1>
      <h1>Your Password is ${student.password } try to save the password</h1>
      <h1>Your Addres street, ${student.address.street }</h1>
      <h1>Your Address city ${student.address.city }</h1>
</body>
</html>