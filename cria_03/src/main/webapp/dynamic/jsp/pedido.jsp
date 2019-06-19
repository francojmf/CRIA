
<%@page contentType="text/html"%> 
<%@page pageEncoding="UTF-8"%>  
 
<!--Chamada aos TLD's de cada pacote JSTL --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 
 
<html> 
 
	<head>  
        <meta charset="UTF-8">
        <LINK href="../../static/css/k2.fonts.css" rel="stylesheet" type="text/css">  
        <LINK href="../../static/css/k2.css" rel="stylesheet" type="text/css">   
        <LINK href="../../static/css/main.css" rel="stylesheet" type="text/css">    
        <LINK href="../../static/css/css.css" rel="stylesheet" type="text/css">
        <LINK href="../../static/css/bootstrap.min.css" rel="stylesheet" type="text/css">    
        <LINK href="../../static/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
        <LINK href="css/font-awesome.css" rel="stylesheet" type="text/css">     
        <LINK href="../../static/css/template.css" rel="stylesheet" type="text/css">  
        <LINK href="css/all.css" rel="stylesheet" crossorigin="anonymous" 
        integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"> 
        <link rel="stylesheet"
        href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <SCRIPT src="../../static/js/jquery.min.js" type="text/javascript"></SCRIPT>  
	 
	<title>Pedido</title>	 
	 
	</head>
 
<body>
 
<h1>Projeto CRIA - Tela de Pedido</h1>
 
<hr>
 
<form class="form-actions" action="gravaPedido.jsp" method="post">
		 
	<label class="span6"> Entidade: 
	<input class="span6" type="text" name="edtEntidade" size="50"/> </label><br> 
 
	<label class="span6"> CNPJ: 
	<input type="text" name="edtCNPJ" size="15"/> </label><br> 

	<label class="span6"> Nome da Criança: 
	<input type="text" name="edtNomeCri" size="60"/> </label><br> 

	<label class="span6"> Idade da Criança: 
	<input type="text" name="edtIdade" size="10"/> </label><br> 

	<label class="span6"> Medida A - Altura das costas(cm)
	<input type="text" name="edtMedA" size="10"/> </label><br> 

	<label class="span6"> Medida B - Largura do quadril(cm)
	<input type="text" name="edtMedB" size="10"/> </label><br> 
	
	<label class="span6"> Medida C - Comprimento das coxas(cm)
	<input type="text" name="edtMedC" size="10"/> </label><br> 
	
	<label class="span6"> Medida D - Altura das pernas(cm)
	<input type="text" name="edtMedD" size="10"/> </label><br> 
	
	<label class="span6"> Medida E - Altura do braço(cm)
	<input type="text" name="edtMedE" size="10"/> </label><br> 
	
	<label class="span6"> Medida F - Comprimento do antebraço(cm)
	<input type="text" name="edtMedF" size="10"/> </label><br> 
			 
	<label class="span12"> Endereço completo: 
	<input class="span8" type="text" name="edtEndereco" size="100"/> </label><br> 	
	 	 
	<label class="span12"> Obs: 
	<input class="span8" type="text" id="edtObs" size="100"/> </label><br> 
	 
<hr>

	<input class="span4" accesskey="o" type="submit" href="../static/aviso_bd.html" name="btnOK" value="OK">
	 
	<input class="span4" accesskey="c" type="reset" name="btnCancelar" value="Limpar">
 
</form>
     <ul><BUTTON>
       <a href="${pageContext.request.contextPath}">Sair </a></ul> 
       </BUTTON>

</body>
 
</html>

