<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
   <table>
<c:forEach var="hotel" items="${hd}">
<tr>
<td>${hotel.city}</td>
</tr>
</c:forEach>
</table>



   </body>
   
</html>