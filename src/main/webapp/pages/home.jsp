<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addFlights">
		<input type="text" name ="flightNumber"><br> 
		<input type="text" name ="departureAirport"><br> 
		<input type="text" name ="arrivalAirport"><br> 
		<input type="submit"><br> 

	</form>
	
	<form action="getFlights">
		<input type="text" name ="flightNumber"><br> 
		<input type="submit"><br> 

	</form>
</body>
</html>