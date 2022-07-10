<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
				<th>FirstName</th>
					<th>LastName</th>
					<th>Course</th>
					<th>Country</th>
					<th>Action</th>
</tr>
<c:forEach items="${Students}" var="tempStudent">
<tr>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.course}</td>
						<td>${tempStudent.country}</td>
						<td>
							<!-- Add "update" button/link --> 
					<a href="/StudentManagement/student/showFormForUpdate?studentId=${tempStudent.id}">Update </a> 
							<!-- Add "delete" button/link -->
							
							<a href="/StudentManagement/student/delete?studentId=${tempStudent.id}">
								Delete </a>

						</td>

					</tr>


</c:forEach>
</table>
</body>
</html>