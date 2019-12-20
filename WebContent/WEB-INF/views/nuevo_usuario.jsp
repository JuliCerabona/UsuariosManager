<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuevo Usuario</title>
</head>
<body>
    <div align="center">
        <h2>Nuevo Usuario</h2>
        <form:form action="save" method="post" modelAttribute="usuario">
            <table border="0" cellpadding="5">
          
          
                <tr>
                    <td>Nombre: </td>
                    <td><form:input path="nombre" /></td>
                </tr>
                <tr>
                    <td>Apellido: </td>
                    <td><form:input path="apellido" /></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Dirección: </td>
                    <td><form:input path="direccion" /></td>
                </tr>  
                 <tr>
                    <td>Teléfono: </td>
                    <td><form:input path="telefono" /></td>
                </tr> 
        
                
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
</html>