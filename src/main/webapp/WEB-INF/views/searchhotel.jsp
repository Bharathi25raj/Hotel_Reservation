  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Search Hotel</h1>
<form:form method = "post" action = "searchhotel">
<label for="city">City:</label>
<form:select path="city" >
  <form:option value="GOA" label="GOA" />
  <form:option value="Bengaluru" label="Bengaluru" />
  <form:option value="Mumbai" label="Mumbai"/>
  <form:option value="Kolkata" label="Kolkata" />
</form:select> 
<br>
<br>
<label for="hotel">Hotel:</label>
<form:select path="hotel">
  <form:option value="The Oberoi Grand, Kolkata" label="The Oberoi Grand, Kolkata"/>
  <form:option value="Taj Mahal Palace, Mumbai" label="Taj Mahal Palace, Mumbai"/>
  <form:option value="The Leela Palace, Bengaluru, Karnataka" label="The Leela Palace, Bengaluru, Karnataka"/>
  <form:option value="lsewhere Beach Houses and Tents, Goa" label="lsewhere Beach Houses and Tents, Goa"/>
</form:select> 
<br>
<br>
<label for="date">Date:</label>
<form:input path="date"/>
<br>
<br>
<input type="submit" value="Check Availablelity"/>
</form:form>
</body>
</html>