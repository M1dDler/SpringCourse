<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: M1dDler
  Date: 5/1/2025
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">
  <form:hidden path="empId"/>

  Name <form:input path="name"/>
  <br><br>
  Surname <form:input path="surname"/>
  <br><br>
  Department <form:input path="department"/>
  <br><br>
  Salary <form:input path="salary"/>
  <br><br><br>
  <input type="submit" value="OK">
</form:form>
</body>
</html>
