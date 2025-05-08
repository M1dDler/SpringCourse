<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: M1dDler
  Date: 5/8/2025
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<h1>Information For All Employees</h1>
<br>
<security:authorize access="hasRole('HR')">
<input type="button" value="salary" onclick="window.location.href = 'hr_info'">
Only for HR staff
</security:authorize>
<br><br>
<security:authorize access="hasRole('MANAGER')">
<input type="button" value="performance" onclick="window.location.href = 'manager_info'">
Only for Managers
</security:authorize>
<br>
</body>
</html>
