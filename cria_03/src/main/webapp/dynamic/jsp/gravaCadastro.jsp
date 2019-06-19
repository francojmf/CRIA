<%@page contentType="text/html"%>
 
<%@page pageEncoding="UTF-8"%>
 
<!--Chamada aos TLD's de cada pacote JSTL -->
 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 
"http://www.w3.org/TR/html4/loose.dtd">
 
 
<html>
 
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <meta charset="UTF-8">
    <LINK href="static/css/k2.fonts.css" rel="stylesheet" type="text/css">     
    <LINK href="static/css/k2.css" rel="stylesheet" type="text/css">   
    <LINK href="static/css/main.css" rel="stylesheet" type="text/css">    
    <LINK href="static/css/css.css" rel="stylesheet" type="text/css">
    <LINK href="static/css/bootstrap.min.css" rel="stylesheet" type="text/css">    
    <LINK href="static/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
    <LINK href="css/font-awesome.css" rel="stylesheet" type="text/css">     
    <LINK href="css/template.css" rel="stylesheet" type="text/css">  
    <LINK href="css/css(1).css" rel="stylesheet" type="text/css">    
    <LINK href="css/mobile-menu.css" rel="stylesheet" type="text/css">  
    <LINK href="css/all.css" rel="stylesheet" crossorigin="anonymous" 
    integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr">
    <link rel="stylesheet"
    href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <SCRIPT src="static/js/jquery.min.js" type="text/javascript"></SCRIPT>
    
<title>Tela Cadastro </title>
 
</head>
 
<body>
 
<!--Equivalente ao try/catch, a tag catch tenta executar o que 
estiver dentro de seu corpo, e caso ocorra alguma exceção, será capturada
e armazenada na variável "ex". -->
 
<c:catch var="ex">
 
<!--Cria uma transação com o banco dados, onde podemos executar de forma
mais protegida e seqüencial, várias atualizações ou inserções. -->
 
<sql:transaction dataSource="${ds}">
 
<!--Executa algum comando como insert, update ou delete e armazena o resultado
na varável "gravaCli". Note que estamos usando a tag sql:param para passar dinamicamente
os valores em cada sinal de interrogação da cláusula values, vale lembrar que dessa forma,
estaremos gerando uma espécie de sentença preparada, e dessa forma ganharemos performance
na execução do comando SQL. -->
 
<sql:update var="gravaCad">
use back_end_cria3;

insert into usuario(nome,nomeusuario,senha,entidade,cpf,id_cidade,telefone,obs)
values(?,?,?,?,?,?,?,?);
 
<sql:param value="${param['edtNome']}"/> 
<sql:param value="${param['edtNomeusuario']}"/>
<sql:param value="${param['edtSenha']}"/> 
<sql:param value="${param['edtEntidade']}"/> 
<sql:param value="${param['edtCPF']}"/> 
<sql:param value="${param['edtCidade']}"/> 
<sql:param value="${param['edtTelefone']}"/>
<sql:param value="${param['edtObs']}"/>

insert into usuario_papel(id_papel) values(?);
<sql:param value="${param['edtId_papel']}"/>

<!--

-->
</sql:update>
 
</sql:transaction>
 
</c:catch>
 
 
<!--Essa é uma sacada legal, pois na tag “out” abaixo, caso o objeto “ex” 
esteja nulo(ou seja, sem exceção), será exibido o valor contido no atributo default,
dessa forma a mensagem de sucesso só será exibida caso não tenha ocorrido nenhuma exceção. -->
 
<h1>
 
<c:out value="${ex}" default="Gravação executada com sucesso!"/>
 
</h1>
 
<hr>
 
<input type="button" value="Voltar" name="btnVoltar" onclick="history.back();"
 
</body>
 
</html>