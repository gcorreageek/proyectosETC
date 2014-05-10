<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%=System.getProperty("java.version") %><br>
<%=System.getProperty("java.home") %><br>
<%=System.getProperty("os.name") %><br>
<%=System.getProperty("user.name") %><br>
<%=System.getProperty("user.home") %><br>
<%=System.getProperty("user.dir") %><br>
 
<h2>Bienvenido!</h2> 
<%
String nnn =(String) request.getAttribute("nom");
 if(nnn==null){
	 %>   
<%   }else{ %>
	<h2><%=nnn %></h2>  
<% } 
%> 

<form action="prueba"   >
<table>
  <tr>
    <th>Nombre:</th>
    <th></th>
  </tr>
  <tr>
    <td><input type="text" name="nombre" /></td>
    <td><input type="submit"    value="Enviar" /></td>
  </tr>
</table>

</form>
</body>
</html>
