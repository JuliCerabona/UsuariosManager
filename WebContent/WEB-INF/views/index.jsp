<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Control de Usuarios</title>
</head>
<body>
<div align="center">
    <h2>Control y Manejo de Usuarios</h2>
   
    <h3><a href="/UsuariosManager/new">Crear Usuario</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Apellido</th>
            <th>E-mail</th>
            <th>Dirección</th>
            <th>Teléfono</th>

        </tr>
        <c:forEach items="${listaUsuarios}" var="usuario">
        <tr>
            <td>${usuario.id}</td>
            <td>${usuario.nombre}</td>
            <td>${usuario.apellido}</td>
            <td>${usuario.email}</td>
            <td>${usuario.direccion}</td>
            <td>${usuario.telefono}</td>
	        <td>
                <a href="/UsuariosManager/edit?id=${usuario.id}">Editar</a>
           	</td>
           	 <td>
           	  <a href="/UsuariosManager/delete?id=${usuario.id}">Eliminar</a>
           	  </td>
        </tr>
        
        
        </c:forEach>
    </table>
</div>   
</body>
</html>