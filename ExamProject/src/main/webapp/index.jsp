<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>EXAM</title>
<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	margin: 0;
	padding: 0;
	background: linear-gradient(to right, #63a4ff, #83eaf1);
	color: #333;
	text-align: center;
}

form {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	display: inline-block;
	margin-top: 50px;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-bottom: 16px;
	background-color: #f1f1f1;
	border-radius: 8px;
}

table, th, td {
	border: 1px solid #ddd;
}

th, td {
	padding: 12px;
	text-align: left;
}

input, select {
	width: calc(100% - 6px);
	padding: 10px;
	margin: 6px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	border-radius: 4px;
}

.glow-button {
	display: inline-block;
	padding: 12px 24px;
	font-size: 18px;
	text-align: center;
	text-decoration: none;
	cursor: pointer;
	border: none;
	border-radius: 25px;
	color: #fff;
	background-color: #4CAF50;
	box-shadow: 0 0 10px #4CAF50;
	transition: box-shadow 0.3s ease;
}

.glow-button:hover {
	animation: glowing 1.5s infinite;
}

@
keyframes glowing { 0% {
	box-shadow: 0 0 10px #4CAF50;
}
50


%
{
box-shadow


:


0


0


20px


#4CAF50
,
0


0


30px


#4CAF50
;


}
100


%
{
box-shadow


:


0


0


10px


#4CAF50
;


}
}
</style>
</head>
<body>
	<form name="form1" action="result.jsp" method="get">
		<h2 style="color: #4CAF50;">EXAM</h2>
		<table>

			<tr>
				<td>getWriter() method is invoked on ______</td>
				<td><input type="radio" name="A" value="Reques">A.Request</td>
				<td><input type="radio" name="A" value="Config">B.Config</td>

				<td><input type="radio" name="A" value="Response">C.Response</td>
				<td><input type="radio" name="A" value="context">D.context</td>

			</tr>
			<tr>
				<td>Following method which is not the part of servlet
					lifecycle.</td>
				<td><input type="radio" name="B" value="Start">A.Start</td>
				<td><input type="radio" name="B" value="init">B.init</td>

				<td><input type="radio" name="B" value="service">C.service</td>
				<td><input type="radio" name="B" value="destroy">D.destroy</td>

			</tr>
			<tr>
				<td>Life cycle method in case of servlet is</td>
				<td><input type="radio" name="C" value="Destroy">A.Destroy</td>
				<td><input type="radio" name="C" value="Destroy">B.Destroy</td>

				<td><input type="radio" name="C" value="Init">C.Init</td>
				<td><input type="radio" name="C" value="all of these">D.all of these</td>

			</tr>
			<tr>
				<td>One of the following is invoked for every request</td>
				<td><input type="radio" name="D" value="Reques">A.Constructor</td>
				<td><input type="radio" name="D" value="Service">B.Service</td>

				<td><input type="radio" name="D" value="Destroy">C.Destroy</td>
				<td><input type="radio" name="D" value="Init">D.Init</td>

			</tr>

		</table>
		<button type="submit" class="glow-button">Submit</button>
		<button type="reset" class="glow-button">Reset</button>

	</form>
</body>
</html>
