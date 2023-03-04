<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>

	<%
	/*  String name = (String)request.getAttribute("name");
	 Integer rollno = (Integer)request.getAttribute("rollno");
	LocalDateTime time = (LocalDateTime)  request.getAttribute("time"); */
	%>

	<h1>
		Hello my name is
		<%-- <%= name %> --%>
		${name}
	</h1>
	<h1>
		Hello my rollno is
		<%--     <%= rollno %> --%>
		${ rollno}
	</h1>
	<h1>
		Hello my time is
		<%--     <%= time %> --%>
		${time }
	</h1>
	<hr>
	<c:forEach var="item" items="${marks}">
		<%-- <h1>${item}</h1> --%>
		<h1><c:out value="${item}"></c:out></h1>
	</c:forEach>

	<h1>this is help page url</h1>
</body>
</html>