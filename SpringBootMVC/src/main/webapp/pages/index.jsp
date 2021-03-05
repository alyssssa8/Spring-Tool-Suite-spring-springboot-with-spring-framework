<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome to Spring Boot
	 <!-- <form action="add">
		Enter 1st number : <input type="text" name="num1"><br>
		Enter 2st number : <input type="text" name="num2"><br>
		<input type="submit">
	</form>  --> 
	
	<form action="addUsers" method="post"> <!--sending the date to the server  -->
		Enter User Id : <input type="text" name="uid"><br>
		Enter User Name : <input type="text" name="uname"><br>
		<input type="submit">
	</form>
	
	<hr>
 	
 	<form action="getUser" method="get">
 		Enter User Id : <input type="text" name="uid"><br>
 		<input type="submit">
 	</form>
 	
 	
 	<hr>
 	
 	<form action="getUserByUname" method="get">
 		Enter User Name : <input type="text" name="uname"><br>
 		<input type="submit">
 	</form>
	
</body>
</html>