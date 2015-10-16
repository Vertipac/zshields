<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Management</title>
</head>
<body>
<form:form action="event.do" method="POST" commandName="event">
<table>
       <tr>
			<td>Event ID</td>
			<td><form:input path="id" /></td>
		</tr>
		
		<tr>
			<td>Event name</td>
			<td><form:input path="name" /></td>
		</tr>
		
		<tr>
			<td>Event place</td>
			<td><form:input path="place" /></td>
		</tr>
		
		<tr>
			<td>Event time</td>
			<td><form:input path="time" /></td>
		</tr>
		
		<tr>
			<td>Comment</td>
			<td><form:input path="comment" /></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
</table>
</form:form>

<br>
<table border="1">
         <th>ID</th>
         <th>Name</th>
         <th>Place</th>
         <th>time</th>
         <th>comment</th>
         <c:forEach items="${eventList}" var="event">
         <tr>
         <td>${event.id}</td>
         <td>${event.name}</td>
         <td>${event.place}</td>
         <td>${event.time}</td>
         <td>${event.comment}</td>
         </tr>
         </c:forEach>
  
</table>
</body>
</html>