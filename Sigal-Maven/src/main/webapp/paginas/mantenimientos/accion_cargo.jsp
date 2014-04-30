<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib   prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib   prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function() { 
	 setTimeout(function(){ $('.alert').hide(1000); }, 3000); 
}); 
</script>
</head>
<body>
<c:if test="${requestScope.objCargo.cod_cargo!=null}"   >
<h3>Modificar Cargo</h3>  
</c:if>
<c:if test="${requestScope.objCargo.cod_cargo==null}"   >
<h3>Nuevo Cargo</h3>  
</c:if>


<c:if test="${requestScope.rsult!=null}"   >
<c:if test="${requestScope.rsult=='0'}"   >
	<div class="alert alert-success"> 
	<h4>Bien!</h4>
	${requestScope.mensaje}
	</div> 
</c:if>
<c:if test="${requestScope.rsult=='1'}"   >
	<div class="alert alert-error"> 
	<h4>Error!</h4>
	${requestScope.mensaje}
	</div> 
</c:if>

</c:if>

<form class="form-horizontal" action="actuarCargo" method="post"  >
<s:hidden  name="objCargo.cod_cargo"      /> 
<div class="control-group">
<label class="control-label" for="inputArea">Area</label>
<div class="controls">
<s:select name="objCargo.cod_area"  list="lstArea" listValue="desc_area" listKey="cod_area" id="cboArea" /> 
</div>
</div> 

<div class="control-group">
<label class="control-label" for="inputNombre">Cargo</label>
<div class="controls">
<s:textfield id="inputDesc_cargo"  name="objCargo.desc_cargo" placeholder="Cargo"  ></s:textfield> 
</div>
</div> 
 
<div class="control-group"> 
<div class="controls">
<button class="btn btn-primary">Guardar</button>
<a class="btn btn-primary"  href="mainCargo">Listar</a>
</div>
</div>

</form>


 



</body>
</html>