<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Burger Tracker</h1>
<form:form action="/burgers/${burger.id}" mode="post" modelAttribute="burger">
   <input type="hidden" name="_method" value="put">
   	<div>
	
		<form:label path="burgername">Burger Name:</form:label><br>
		<form:errors path="burgername" class="text-danger"/>
		<form:input path="burgername" style="width:250px;"/>
	</div>
	<div>
		<form:label path="restaurantname">Restaurant Name:</form:label><br>
		<form:errors path="restaurantname" class="text-danger"/>
		<form:input path="restaurantname" style="width:250px;"/>
	</div>
	<div>
		<form:label path="rating">Rating:</form:label><br>
		<form:errors path="rating" class="text-danger"/>
		<form:input path="rating" style="width:250px;"/>
	</div>
	<div>
		<form:label path="notes">Notes:</form:label><br>
		<form:errors path="notes" class="text-danger"/>
		<form:textarea path="notes" rows="3" style="width:250px;"/>
	</div>
	<div>
		<input type="submit" value="edit"/>
	</div>
</form:form>
</body>
</html>