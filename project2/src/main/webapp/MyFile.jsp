<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
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

    form {
      background-color: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      display: inline-block;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-bottom: 16px;
      background-color: aqua;S
    }

    table, th, td {
      border: 1px solid #ddd;
    }

    th, td {
      padding: 10px;
      text-align: left;
    }

    .glow-button {
      display: inline-block;
      padding: 10px 20px;
      font-size: 18px;
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
  </style>
</head>
<body>

  <form action="MyServlet" method="post">
    <table>
      <tr>
        <td>Username:</td>
        <td><input type="text" name="user" required></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><input type="password" name="password" required></td>
      </tr>
    </table>

    <button type="submit" class="glow-button">Submit</button>
  </form>

</body>
</html>
