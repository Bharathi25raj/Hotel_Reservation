 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form:form action="bookhotel" method="post">
    <h1>Regiservation Form</h1>
    <label for="gest"><b>Guest Name</b></label>
    <form:input path="gest"  />
    <br>
    <br>
    <label for="gender">Gender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <form:select path="gender" >
    <form:option value="male" label="Male"/>
    <form:option value="female" label="Female"/>
  
    </form:select> 
    <br>
    <br>
    <label for="age"><b>Age&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <form:input path="age" />
      <br>
      <br>
  <label for="email"><b>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <form:input path="email"  />
      <br>
      <br>
    <label for="mobno"><b>MobileNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <form:input path="mobno" />
      <br>
      <br>
    <button type="submit" >Regerve</button>
       

</form:form> 
</body>
</html>