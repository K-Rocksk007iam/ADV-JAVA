<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body {
      font-size: 16px;
      background: linear-gradient(to right, #ff6b6b, #bfe9ff);
      margin: 0;
      font-family: 'Arial', sans-serif;
      color: #333;
      text-align: center;
      padding: 20px;
    }
    
    </style>
<body>
<%

String username=(String)request.getAttribute("name1");
String pass=(String)request.getAttribute("passvalue");
%>

<h1><%=username %> Loged in successfully</h1>
<h1><%=pass %> is a password</h1>
</body>


</html>