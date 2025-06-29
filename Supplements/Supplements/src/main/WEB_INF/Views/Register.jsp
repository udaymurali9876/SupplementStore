<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/Register" method="post">
	<label for="FirstName">FirstName : </label>
	<input type="text" id="FirstName" name="FirstName"><br>
	
	LastName : <input type="text" id="LastName" ><br>
	Email : <input type="text" id="Email" ><br>
	<label for="Gender">Gender : </label>
	<input type="radio" id="male" name="Gender" value="male">Male
	<input type="radio" id="Female" name="Gender" value="Female"><br>
	
	PhoneNo : <input type="long" id="phoneNo" ><br>
	
	userName : <input type="text" id="userName"><br>
	
	password : <input type="text" id="password"><br>
	
	
	
</form>

</body>
</html>