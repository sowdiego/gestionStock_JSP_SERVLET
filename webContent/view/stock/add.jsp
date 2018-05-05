<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	
<title>Nouvelle stock</title>
</head>
<body>
    <div class="container">
    <h3> <center> Nouvel Stock </center></h3>
    <form method="POST" action='StockServlet' name="add">
    
    	 
    
        Ref : <input type="text""
        	class="form-control "  name="ref"
            value="<c:out value="${stock.ref}" />" /> <br /> 
        
         Libelle: <input
            type="text" name="libelle"
            class="form-control"
            value="<c:out value="${stock.lib}" />" /> <br /> 
        
         Quantite: <input
            type="text" name="quantite"
            class="form-control " 
            value="<c:out value="${stock.qteStock}" />"/> <br /> 
        
         <input class="btn btn-default" type="submit" value="Valider">
       
    </form>
    </div>
</body>
</html>