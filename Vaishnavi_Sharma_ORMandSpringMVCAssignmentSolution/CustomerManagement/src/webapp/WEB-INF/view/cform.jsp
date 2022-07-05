<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/StudentManagement/student/save" method="POST" >
	<input type="hidden" name="id" value="${Student.id}" /><br>
	<input type="text" name="firstName" value="${Student.firstName}"><br>
	<input type="text" name="lastName" value="${Student.lastName}"><br>
	<input type="text" name="course" value="${Student.course}"><br>
	<input type="text" name="country" value="${Student.country}"><br>
	<button type="submit" >Save</button>

		</form>

		<hr>
		<a href="/StudentManagement/student/list">Back to Students List</a>

	

</body>
</html>