<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" type="text/css" href="source.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>User Registration</title>

</head>
<body>
	<form name="form1" action="jspPages/result.jsp" method="get">
		<h2 style="color: #4CAF50;">User Registration Form</h2>
		<table>
			<tr>
				<td>First name:</td>
				<td><input type="text" name="user_firstname" required></td>
			</tr>
			<tr>
				<td>Last name:</td>
				<td><input type="text" name="user_lastname" required></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="Male">MALE</td>
				<td><input type="radio" name="gender" value="Female">FEMALE</td>
			</tr>
			<tr>
				<td>Select Country:</td>
				<td><select name="country">
						<option>Choose country</option>
						<option value="India">India</option>
						<option value="USA">USA</option>
						<option value="Nepal">Nepal</option>
				</select></td>
			</tr>
		</table>
		<button type="submit" class="glow-button">Submit</button>
		<button type="reset" class="glow-button">Reset</button>

	</form>
</body>
</html>
