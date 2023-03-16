<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Entry</title>
</head>
<body>
<div align="center">
<h2>
<form:form action="course" method="post" modelAttribute="courseRecord">
<form:hidden path = "courseId"/>
Enter course Id:<form:input path="courseId" disabled="true"/>
<br/><br/>
Enter course Name:<form:input path="courseName"/>
<br/><br/>
Enter course Fee:<form:input path="fee"/>
<br/><br/>
Enter course Duration:<form:input path="duration"/>
<br/><br/>

<button type="submit">Submit</button>
</form:form>

</h2>

</div>
</body>
</html>