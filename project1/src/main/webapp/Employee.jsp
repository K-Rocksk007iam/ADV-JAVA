<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a>
<%
int empno=200;
String ename="kunal";
double salary=120000;
double comm=600;

%>
<h2>
My empNo is: <%=empno %><br>
My name is: <%=ename %><br>
My salary is: <%=salary %><br>
My commison is: <%=comm %><br>
</h2>
</a>
</body>
<style>
body {
	font-size: 40px;
	background: linear-gradient(to right, #ff6b6b, #bfe9ff);
	margin: 0;
	font-family: 'Arial', sans-serif;
	color: #333;
	text-align: center;
	padding: 20px;
	
}
a {
	color: white;
	font-family: cursive;
}
h2 {
      color: #333; 
      font-family: cursive;
      text-align: center; 
      border-bottom: 2px solid #3498db; 
      padding-bottom: 5px; 
      margin-top: 20px; 
    }
</style>
</html>