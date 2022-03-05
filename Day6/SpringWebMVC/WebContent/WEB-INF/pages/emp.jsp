<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		
	<sf:form modelAttribute="employee">
		<table align="center" border="1">
		
		<tr>
			<td>ID: </td>
			<td> <sf:input id="txtId" path="id" /> </td>		<!-- //employee.setId() -->
		</tr>
		
		<tr>
			<td>Name: </td>
			<td><sf:input id="txtName" path="name" /> </td>		<!-- //employee.setname() -->
		</tr>
		
		<tr>
			<td>Designation: </td>
			<td><sf:input id="txtDesignation" path="designation" /></td>
		</tr>
		
		<tr>
			<td>emailId</td>
			<td><sf:input id="txtEmailId" path="emailId" /></td>
		</tr>
		
		<tr>
			<td colspan="2"> 
				<input type="submit" value="Save" />
			</td>
		</tr>
		
		</table>
		
	</sf:form>
	
	<br/>
	<br/>
	
	<c:if test="${not empty listEmployees }">
	
		<table align="center" border="1">
		
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Designation</th>
				<th>EmailId</th>
			</tr>
			
			
			<c:forEach var="emp" items="${listEmployees }">
				
					<tr>
						<td>${emp.id }</td>
						<td>${emp.name }</td>
						<td>${emp.designation }</td>
						<td>${emp.emailId }</td>
					</tr>
			
			</c:forEach>
			
		
		</table>
	
	</c:if>
	

</body>
</html>










