<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    
	<title>liste entree</title>
	</head>
	<body>
	
	<h3> <center>Liste des entrees</center></h3>
	<div class="container">
	<a href="add.jsp">Nouvelle Entree</a>
	<table class="table table-bordered ">
        <thead>
            <tr>
                <th>Entree Id</th>
                <th>Date</th>
                <th>Quantite</th>
                <th>Prix Unitaire</th>
                <th>Stock</th>
                <th>Modifier</th>
                <th>Supprimer</th>
                
            </tr>
        </thead>
        <tbody>
            
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>            
                    <td><a class="btn mini blue-stripe" href="#"><span class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a href="#" class="confirm-delete btn mini red-stripe" role="button" data-title="kitty" data-id="2"><span class="glyphicon glyphicon-trash"></span></a></td>
                </tr>
            
        </tbody>
    </table>
   </div>
    
	</body>
</html>