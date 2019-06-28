
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
        <script> function funcao1() { alert("Pedido enviado com sucesso !!"); } </script> 	 	
	<title>Pedido</title>	 
	 
	</head>
 
<body>
 
<h1>Projeto CRIA - Tela de Pedido</h1>
 
<hr>
 
<form class="form-actions" action="../../ControlePedido.action" method="post">
		 
	<label class="span6"> Entidade: 
	<input class="span6" type="text" name="edtEntidade" size="50"/> </label><br> 
 
	<label class="span6"> CNPJ: 
	<input type="text" name="edtCNPJ" size="15"/> </label><br> 

	<label class="span6"> Nome da Criança: 
	<input type="text" name="edtNomecri" size="60"/> </label><br> 

	<label class="span6"> Idade da Criança: 
	<input type="text" name="edtIdade" size="10"/> </label><br> 

	<label class="span4"> Medida A - Altura das costas(cm)
	<input type="text" name="edtMedA" size="10"/> </label><br> 

	<label class="span4"> Medida B - Largura do quadril(cm)
	<input type="text" name="edtMedB" size="10"/> </label><br> 
	
	<label class="span4"> Medida C - Comprimento das coxas(cm)
	<input type="text" name="edtMedC" size="10"/> </label><br> 
	
	<label class="span4"> Medida D - Altura das pernas(cm)
	<input type="text" name="edtMedD" size="10"/> </label><br> 
	
	<label class="span4"> Medida E - Altura do braço(cm)
	<input type="text" name="edtMedE" size="10"/> </label><br> 
	
	<label class="span4"> Medida F - Comprimento do antebraço(cm)
	<input type="text" name="edtMedF" size="10"/> </label><br> 
			 
	<label class="span12"> Endereço completo: 
	<input class="span8" type="text" name="edtEndereco" size="100"/> </label><br> 	
	 	 
    <label class="span12">Obs: 
    <input type="text" name="edtObs2" size="200"/> </label> <br> 
	 
<hr>
    <DIV class="span8">
        <input accesskey="h" type="submit" onclick="funcao1()" value="Confirmar" class="submitButton"> 
        <input accesskey="c" type="reset" name="btnCancelar" value="Limpar">
 	</DIV>
</form>
    <ul><BUTTON>
	<input type="button" value="Voltar" name="btnVoltar" onclick="history.back();">
     </BUTTON>

</body>
 
</html>

