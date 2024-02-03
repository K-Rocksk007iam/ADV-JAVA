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

<%String name = "Kunal";
String address="nashik";%> 
 My Name is <b><%=name%></b>
 <hr>
 My Address is <b><%=address%></b>
	</a>
	<hr>
	<h6>ENTER IF YOUR ARE 18+</h6>
	
	<button class="glow-button">ENTER</button>
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

.glow-button {
	display: inline-block;
	padding: 10px 20px;
	font-size: 36px;
	text-align: center;
	text-decoration: none;
	cursor: pointer;
	border: none;
	border-radius: 25px;
	color: #fff;
	background-color: #00f;
	box-shadow: 0 0 10px #00f;
	transition: box-shadow 0.3s ease;
}

 .glow-button:hover {
      animation: glowing 1.5s infinite;
    }
    
     @keyframes glowing {
      0% {
        box-shadow: 0 0 10px #00f;
      }
      50% {
        box-shadow: 0 0 20px #00f, 0 0 30px #00f;
      }
      100% {
        box-shadow: 0 0 10px #00f;
      }
    }

a {
	color: white;
	font-family: cursive;
}
</style>

</html>