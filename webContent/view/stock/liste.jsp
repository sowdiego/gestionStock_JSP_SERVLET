<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    
	<title>liste stock</title>
	</head>
	<body>
	<h3> <center> Liste de Stock </center></h3>
	<div class="container">
	<a href="add.jsp">New Stock</a>
	<table class="table table-bordered ">
        <thead>
            <tr>
                <th>Stock Id</th>
                <th>Ref</th>
                <th>Libelle</th>
                <th>Quantite</th>
                <th>Modifier</th>
                <th>Supprimer</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${stocks}" var="stock">
                <tr>
                	<td><c:out value="${stock.idStock}" /></td>
                    <td><c:out value="${stock.ref}" /></td>
                    <td><c:out value="${stock.lib}" /></td>
                    <td><c:out value="${stock.qteStock}" /></td>            
                    <td><a class="btn mini blue-stripe" href="#"><span class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a href="#" class="confirm-delete btn mini red-stripe" role="button" data-title="kitty" data-id="2"><span class="glyphicon glyphicon-trash"></span></a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
   </div>
    
	</body>
</html>