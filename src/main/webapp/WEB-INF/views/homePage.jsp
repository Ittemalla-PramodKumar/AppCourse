<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="false" isELIgnored = "false"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
</head>
<body>
<div align="center">
<h3><a href = "course"> Add New Course</a></h3>
<hr size = "5" color="blue">
</div>
<div align="center">
<h2>
<table border="2" cellpedding=5 cellspacing = "5">
<tr>
<th>ID</th>
<th>NAME</th>
<th>FEES</th>
<th>DURATION</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<c:forEach  items="${courseList}" var="course">
<tr>
 <td>${course.courseId}</td>
 <td>${course.courseName}</td>
<td>${course.fee}</td>
<td>${course.duration}</td>
<td><a href="edit_course/${course.courseId}">Change Fees</a></td>
<td><a href="delete_course/${course.courseId}">Delete Course</a></td>
</tr>
</c:forEach>
</table>
<br/>
</body>
</html>