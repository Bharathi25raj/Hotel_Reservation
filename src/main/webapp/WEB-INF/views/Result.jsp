 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
   <head>
      <title>HotelBook</title>
   </head>
   <body>
 
  <table border="2" width="70%" >
<tr><th>RoomType</th><th>Price</th><th>Gst</th><th>Total</th></tr>  
 <tr>  

   <td>${hotel.roomtype}</td>  
   <td>${hotel.price}</td>  
   <td>${hotel.gst}</td>  
 <td>${hotel.price+hotel.gst}</td>  
   </tr>  
</table>
 <a style="text-decoration:none" href="registration">Confirm</a>  
 <a style="text-decoration:none" href="/HotelReservation">back</a>  
   </body>
   
</html>