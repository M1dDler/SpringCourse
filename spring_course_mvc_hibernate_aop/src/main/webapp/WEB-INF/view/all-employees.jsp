<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: M1dDler
  Date: 4/30/2025
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Employees</h2>
<br>
<table>
  <tr>
    <th>Name</th>
    <th>Surname</th>
    <th>Department</th>
    <th>Salary</th>
  </tr>
  <c:forEach var="emp" items="${allEmployees}">
    <tr>
      <td>${emp.name}</td>
      <td>${emp.surname}</td>
      <td>${emp.department}</td>
      <td>${emp.salary}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
