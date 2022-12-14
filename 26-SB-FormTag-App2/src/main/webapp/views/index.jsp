<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="sucess" method="POST" modelAttribute="stu">


		<table>
			<tr>
				<td>Student Name</td>
				<td><form:input path="studntName" /></td>
			</tr>
			<tr>
				<td>Student Email</td>
				<td><form:input path="studentEmail" /></td>
			</tr>
			<tr>
				<td>Student phone</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
				<form:radiobutton path="studentGender"  value="M"/>Male 
				<form:radiobutton path="studentGender" value="F"/>Female
				</td>
			</tr>
			<tr>
				<td>Course</td>
				<td>
				    <form:select path="course">
				    	 <form:option value="">-Select-</form:option>
				         <form:option value="java">Java</form:option>
				   		 <form:option value="python">Python</form:option>
				    	 <form:option value="spring">Spring</form:option>
				    	 <form:option value="aws">AWS</form:option>
				    </form:select>
				
				</td>
			</tr>
			<tr>
				<td>Timings</td>
				<td>
				<form:checkbox value="morning" path="timings"/>Morning
				<form:checkbox value="afternoon" path="timings"/>Afternoon
				<form:checkbox value="evening" path="timings"/>Evening
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>


	</form:form>

</body>
</html>