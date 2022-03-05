<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>    
    
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

</body>
</html>