<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01  
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html;  
 charset=UTF-8"> 
<title>Start Spring MVC</title> 
</head> 
<body> 
	<h1>Hello ${User.username}</h1> 
	<p>Please Select Info You'd Like to Update:</p>
	<form action="updateUserInfo">
		<p>User Name: <input type="text" value="${User.username}" style="width: 100px" name="username"></p>
		<p>Address: <input type="text" value="${User.address}" style="width: 200px" name="address"></p>
		<p>City: <input type="text" value="${User.city}" style="width: 200px" name="city"></p>
		<p>State: <input type="text" value="${User.state}" style="width: 200px" name="state"></p>
		<p>ZipCode: <input type="text" value="${User.zipcode}" style="width: 200px" name="zipcode"></p>
		<p>Phone Number: <input type="text" value="${User.phone}" style="width: 200px" name="phone"></p>
		<p>Email Address: <input type="text" value="${User.email}" style="width: 200px" name="email"></p>
		<input type="submit" value="update" style="width: 100px">
	</form>
</body> 
</html> 
