<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="save" modelAttribute="user" method="POST">
		<table>

			<tr>
				<td>Name</td>
				<td><form:input path="name"  /></td>
				<td><form:errors path="name" class="error" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" class="error" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><form:input path="mobile"  /></td>
				<td><form:errors path="mobile" class="error" /></td>
			</tr>
			<tr>
				<td><input type="reset"></td>
				<td><input type="submit"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>