<%--
  Created by IntelliJ IDEA.
  User: saikr
  Date: 10/9/2022
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<H1 align="center">Student List</H1>
<form action="/student_management_war_exploded/addStudent">
    <input type="submit" value="ADD">
</form>
<table border="1" align="center">
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>mobile</td>
        <td>country</td>
    </tr>
    </thead>

    <c:forEach var="student" items="${students}">
        <tr>
            <td> ${student.id}</td>
            <td> ${student.name}</td>
            <td>${student.mobile}</td>
            <td> ${student.country}</td>
            <td><a href="/student_management_war_exploded/updateStudent?userId=${student.id}">Update</a></td>
            <td><a href="/student_management_war_exploded/deleteStudent?userId=${student.id}" onclick="confirm('Are you sure you want to delete student?')">Delete</a></td>
            <br>
        </tr>

    </c:forEach>

</table>

</body>
</html>