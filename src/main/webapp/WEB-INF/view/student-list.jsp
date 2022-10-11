<%--
  Created by IntelliJ IDEA.
  User: saikr
  Date: 10/9/2022
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<link rel="stylesheet" type="text/css" href="/student_management_war_exploded/URLToReachResourcesFolder/css/my-style-sheet.css">--%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<html>
<head>
    <title>Title</title>
</head>
<body>
<link rel="stylesheet" class="text-monospace">

<H1 align="center">Student List</H1>
<form action="/student_management_war_exploded/addStudent">
    <input  type="submit" class="btn btn-primary"  value="ADD" >
</form>
<table  class="table table-hover">
    <thead class="thead-dark">
    <tr>
        <td scope="col">id</td>
        <td scope="col">name</td>
        <td scope="col">mobile</td>
        <td scope="col">country</td>
    </tr>
    </thead>

    <c:forEach var="student" items="${students}">
        <tr >
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
