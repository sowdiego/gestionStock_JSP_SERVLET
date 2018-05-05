<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
<title>Nouvelle Entree</title>
</head>
<body>
    <script>
        $(function() {
            $('input[name=dob]').datepicker();
        });
    </script>

    <form method="POST" action='EntreeServlet' name="frmAddEntree">
        
        Date : <input
            type="Date" name="dateE"
            class="form-controle"  /> <br />
         Quantite: <input
            type="text" name="qte"
            class="form-controle" /> <br /> 
         Prix Unitaire: <input
            type="text" name="pu"
            class="form-controle" /> <br /> 
         <input type="submit" value="Valider">
       
    </form>
</body>
</html>