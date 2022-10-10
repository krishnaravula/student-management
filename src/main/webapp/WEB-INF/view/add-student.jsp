<%--
  Created by IntelliJ IDEA.
  User: saikr
  Date: 10/9/2022
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<div align="center">
    <h2>Add Student Info</h2>
    <form:form action="save-student" modelAttribute="student" method="post">
        <form:hidden path="id"/>
        <label>Name : </label>
        <form:input path="name"/>
        <br>
        <label>Mobile : </label>
        <form:input path="mobile"/>
        <br>
        <label>Country : </label>
        <form:input path="country"/>
        <br>
        <input type="submit" value="Submit" >

    </form:form>
</div>

</body>
</html>
