  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
 <form:form method = "post" action = "save1">

    <label for="city">City&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  <form:select path="city">
    <form:option value="GOA" label="GOA"/>
  <form:option value="Bengaluru" label="Bengaluru"/>
  <form:option value="Mumbai" label="Mumbai"/>
  <form:option value="Kolkata" label="Kolkata"/>
  </form:select>
<br>
<br>
<label for="hotel">Hotel Name&nbsp;&nbsp;</label>
<form:select path="hotel">
  <form:option value="The Oberoi Grand, Kolkata" label="The Oberoi Grand, Kolkata"/>
  <form:option value="Taj Mahal Palace, Mumbai" label="Taj Mahal Palace, Mumbai"/>
  <form:option value="The Leela Palace, Bengaluru, Karnataka" label="The Leela Palace, Bengaluru, Karnataka"/>
  <form:option value="lsewhere Beach Houses and Tents, Goa" label="lsewhere Beach Houses and Tents, Goa"/>
</form:select>

    <br>
    <br>
       <label for="status">Status&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
   <form:select path="status">
    <form:option value="Available" label="Available"/>
    
    <form:option value="NotAvailable" label="NotAvailable"/>
    </form:select>
    <br>
    <br>
    <label for="roomtype">RoomType&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <form:select path="roomtype">
    <form:option value="AC" label="AC"/>
    <form:option value="NonAC" label="NonAC"/>
  
    </form:select> 
    <br>
    <br>
   <label for="price"><b>Price&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <form:input path="price"/>
      <br>
      <br>
  <label for="gst"><b>GST&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <form:input path="gst"/>
      <br>
  
      <br>
      <br>
    <input  type="submit" value="Save"/>
       



  </form:form>  
</body>
</html>
</body>
</html>