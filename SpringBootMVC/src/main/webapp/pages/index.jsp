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
	
	 <form action="add"> <!-- connected with the RequestMapping -->
		action="add"
		<br>
		Enter 1st number : <input type="text" name="num1"><br>
		Enter 2st number : <input type="text" name="num2"><br>
		<input type="submit">
	</form>  
	
	<!-- without method VS with method:
	http://localhost:8080/addUser?num3=1&num4=dadf
	 -->

	
	<form action="addUser" > <!-- sending the date to the server  -->
		action="addUser"
		<br>
		Enter User Id : <input type="text" name="uid"><br>
		Enter User Name : <input type="text" name="uname"><br>
		<input type="submit">
	</form>
		
<!-- 	<form action="addUser2" > sending the date to the server 
		action="addUsers2"
		<br>
		Enter User Id : <input type="text" name="uid"><br>
		Enter User Name : <input type="text" name="uname"><br>
		<input type="submit">	
 	</form> -->
 	
 		<form action="addUser2" method="get" > <!-- sending the date to the server  -->
		action="addUsers2"
		<br>
		Enter User Id : <input type="text" name="uid"><br>
		Enter User Name : <input type="text" name="uname"><br>
		<input type="submit">	
 	</form>
 	
<!--  	
 	<form action="addUser2" method="post"> sending the date to the server 
		action="addUsers2"
		<br>
		Enter User Id : <input type="text" name="uid"><br>
		Enter User Name : <input type="text" name="uname"><br>
		<input type="submit">	
 	</form> -->
 	
 	
	<form action="addUsers" method="post"> <!--sending the date to the server  -->
		action="addUsers"
		<br>
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