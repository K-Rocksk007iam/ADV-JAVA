<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>answers</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to right, #63a4ff, #83eaf1);
            color: #333;
            text-align: center;
        }

        h2 {
            color: #4CAF50;
        }

        table {
            width: 50%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th, td {
            padding: 12px;
            text-align: left;
        }
    </style>
</head>
<body>
    <%
    String fans = request.getParameter("A");
    String sans = request.getParameter("B");
    String tans = request.getParameter("C");
    String fthans = request.getParameter("D");
    String countans = request.getParameter("count");
   
    %>

    <h2>Question and answer</h2>
    <table>
        <tr>
            <td>getWriter() method is invoked on ______:</td>
            <td><%=fans %></td>
        </tr>
        <tr>
            <td>Following method which is not the part of servlet
					lifecycle:</td>
            <td><%=sans %></td>
        </tr>
        <tr>
            <td>Life cycle method in case of servlet is:</td>
            <td><%=tans %></td>
        </tr>
        <tr>
            <td>One of the following is invoked for every request:</td>
            <td><%=fthans %></td>
        </tr>
        <tr>
            <td>Your score is:</td>
            <td><%=countans %></td>
        </tr>
        
    </table>
</body>
</html>
