<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
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
    String fname = request.getParameter("user_firstname");
    String lname = request.getParameter("user_lastname");
    String email = request.getParameter("email");
    String gender = request.getParameter("gender");
    String country = request.getParameter("country");
    %>

    <h2>User Details</h2>
    <table>
        <tr>
            <td>First Name:</td>
            <td><%=fname %></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><%=lname %></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><%=email %></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><%=gender %></td>
        </tr>
        <tr>
            <td>Country:</td>
            <td><%=country %></td>
        </tr>
    </table>
</body>
</html>
