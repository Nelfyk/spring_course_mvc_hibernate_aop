<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Nelfy
  Date: 12/19/2022
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Employee Info</h2><br>
<form:form action="saveEmployee" modelAttribute="employee">
<%--    невидимое поле --%>
    <form:hidden path="id"/>
    Name <form:input path="name"/><br>
    Surname <form:input path="surname"/><br>
    Department <form:input path="department"/><br>
    Salary <form:input path="salary"/><br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
