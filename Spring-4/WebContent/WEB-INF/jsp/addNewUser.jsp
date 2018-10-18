<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form:form action="add-employee" method="POST" modelAttribute="employee">
			<table>
				<tr>
					<td><spring:message code="lbl.firstName" text="First Name : "/></td>
					<td><form:input path="firstName"/></td>
					<td><form:errors path="firstName"/></td>
				</tr>
				
				<tr>
					<td><spring:message code="lbl.lastName" text="Last Name : "/></td>
					<td><form:input path="lastName"/></td>
					<td><form:errors path="lastName"/></td>
				</tr>
				
				<tr>
					<td><spring:message code="lbl.email" text="Email : "/></td>
					<td><form:input path="email"/></td>
					<td><form:errors path="email"/></td>
				</tr>
				<tr>
					<td colspan=3><input type="submit" value="Submit"/></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>