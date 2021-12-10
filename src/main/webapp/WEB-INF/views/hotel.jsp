 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>List Of Hotel</p>
<table border="2" width="70%" cellpadding="2">
<tr><th>City</th><th>Hotel</th><th>Status</th><th>RoomType</th><th>Price</th><th>Gst</th><th>Date</th></tr>  
<c:forEach var="hotel" items="${list}">
 <tr>  
   <td>${hotel.city}</td>  
   <td>${hotel.hotel}</td>  
   <td>${hotel.status}</td>  
   <td>${hotel.roomtype}</td>  
   <td>${hotel.price}</td>  
   <td>${hotel.gst}</td>  
   <td>${hotel.date}</td>  
   </tr>  
</c:forEach>
</table>
<br>
<br>
 <a style="text-decoration:none" href="/HotelReservation">back</a>  
</body>
</html>