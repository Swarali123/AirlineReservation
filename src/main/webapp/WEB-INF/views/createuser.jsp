<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Register Form</h1>

<form action="createprocess" method="post" modelAttribute="user">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" required/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" required/></td>
				</tr>
				
				<tr>
					<td>Email</td>
					<td><input type="email" name="email"  required/></td>
				</tr>
				
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" minlength="8" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><input type="text" name="dob" required/></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="number" name="phno" required/></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>