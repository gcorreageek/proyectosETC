<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="es"> 
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<head>
<tiles:insertAttribute name="header" /> 
</head>

 <body>  
<tiles:insertAttribute name="menu" /> 
    
	<section>
        <div class="contacts"> 
            <tiles:insertAttribute name="body" /> 
        </div>
    </section> 
 
<tiles:insertAttribute name="pie" /> 
  </body>
</html>