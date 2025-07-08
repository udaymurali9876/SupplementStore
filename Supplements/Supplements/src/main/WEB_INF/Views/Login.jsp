<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Store</title>

</head>
<body>
    
        <h1>Login</h1>
        <form method="post" action="/Login">
            <label for="userName">User Name:</label>
            <input type="text" id="userName" name="userName" required="required"/>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required="required"/>
            
            <input type="submit" value="Login"/>
        </form>
        
    
</body>
</html>