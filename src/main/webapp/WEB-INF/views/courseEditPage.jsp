<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Fee Modification</title>
</head>
<body>
	<div align = "center">
		<h2> Course Fee Modification </h2>
		<h2>
			<form:form action = "course_edit" method = "post" modelAttribute = "courseRecord">
				<form:hidden path = "courseId"/>
				<form:hidden path = "courseName"/>
				<form:hidden path = "duration"/>
				Enter Course Id        : <form:input path="courseId" disabled="true"/><br/><br/><!--  here the value is not passed/assigned to anything (i.e)dto -->
				Enter Course Name      : <form:input path="courseName" disabled="true"/><br/><br/>
				Enter Course Duration  : <form:input path="duration" disabled="true"/><br/><br/>
				Enter New Course Fee   : <form:input path="fee"/><br/><br/>
				<button type = "submit">Submit</button>
			</form:form>
		</h2>
	</div>
</body>
</html>