<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${allstudent}</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Age</th>
			
		</tr>
		<c:forEach var="emp" items="${allstudent}">
			<tr>
				<td>${emp.student_ID}</td>
				<td>${emp.student_Name}</td>
				<td>${emp.student_Email}</td>
				<td>${emp.student_age}</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>