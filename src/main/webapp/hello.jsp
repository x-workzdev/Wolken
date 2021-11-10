<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>
	<h2>Welcome to Spring MVC</h2>

	<a href="getAll">Get All Details</a>
	<br>
	<table>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.name}</td>
				<td>${item.location}</td>
				<td>${item.entryFee}</td>
				<td>${item.builtFor}</td>
				<td>${item.YOC}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>


id
brandname
modelnumber
model name
type
ram
rom
price
availability


String save(dto);
list getByPrice(price);
list getByBrandName(brandname);
entity updatepriceByModelno(modelno,price);
entity updateAvailabilityByModelName(modelname, availability)







