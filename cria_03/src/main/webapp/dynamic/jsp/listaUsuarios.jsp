<%@page contentType="text/html"%> 
<%@page pageEncoding="UTF-8"%>  
 
<!--Chamada aos TLD's de cada pacote JSTL --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 

<!DOCTYPE HTML>

<HTML class="no-js" lang="pt-br" prefix="og: http://ogp.me/ns#">
<HEAD><META content="IE=11.0000" http-equiv="X-UA-Compatible">
	<LINK href="css/css.css" rel="stylesheet" type="text/css">         
	<META http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">   	       	 
	<META http-equiv="content-type" content="text/html; charset=utf-8">	 
	<META name="viewport" content="width=device-width, initial-scale=1.0">	 
	<META name="GENERATOR" content="MSHTML 11.00.9600.19326">
	 
	<TITLE>Lista de Usuários</TITLE>

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
</HEAD> 
          
<BODY class="form subpage  ltr preset1 menu-solicitacoes responsive bg hfeed clearfix">
	<DIV class="body-innerwrapper">

	<HEADER class=" " id="sp-header-wrapper">
		<DIV class="container">
		<DIV class="row-fluid" id="header"> 
		<DIV class="span2" id="sp-logo">
		<DIV class="custom">
		<P><A href="http://www.unifesp.br/"><IMG title="" alt="Logotipo da Unifesp" src="../../static/img/Unifesp-marca.png"></A></P></DIV></DIV>
		<DIV class="span7" id="sp-topmenu">
		<DIV class="custom">
		<P class="menutabletdesktop"></P>
		</DIV>
		<SECTION 
		class=" visible-desktop visible-tablet" id="sp-universidade-wrapper">
		<DIV class="row-fluid" id="universidade">
		<DIV class="span12" id="sp-universidade">
		<DIV class="module ">
		<DIV class="mod-wrapper clearfix">
		<DIV class="mod-content clearfix">
		<DIV class="mod-inner clearfix">
		<DIV class="custom"><SPAN id="titulouniversidade">Universidade Federal de São Paulo</SPAN>
		</DIV></DIV></DIV></DIV></DIV>
		<DIV class="gap"></DIV></DIV></DIV></SECTION></DIV>
		<DIV class="span3 visible-desktop" id="sp-webmailmenu">
		<DIV class="custom">
		<P>
		<A> </A>	 
		</P>
		<P></P>
		</DIV>
		</DIV></DIV></DIV>
	</HEADER>

	<SECTION 
		class="container" id="sp-breadcrumb-wrapper">
		<DIV class="container">
		<DIV class="row-fluid" id="breadcrumb">
		<DIV class="span8" id="sp-breadcrumb">
			<UL class="breadcrumb">
				<H2>Lista de Usuários CRIA </H2>
			</UL>
		</DIV>
		<DIV class="gap"></DIV></DIV></DIV>
	</SECTION>

	<SECTION class="container" id="Pedido">
	<form class="form-actions" action="../../ListaUsuarios.action" method="service">
	<table>
		<tr>
                <th>| Id |</th>
                <th>| NomeUsuario | </th>
                <th>|   Senha  |</th>
                <th>|   Nome   |</th>
                <th>| Entidade |</th>
                <th>|   CPF    |</th>
                <th>| Telefone |</th>
                <th>|    Obs   |</th>
                <th>|   Papel  |</th>
        </tr>
        <tr>
  		<c:forEach items="${usuarios}" var="usuarios">    	
    		<td><c:out value="${usuarios.id}" /></td>
    		<td><c:out value="${usuarios.nomeusuario}" /></td>
    		<td><c:out value="${usuarios.senha}" /></td>
      		<td><c:out value="${usuarios.nome}" /></td>
      		<td><c:out value="${usuarios.entidade}" /></td>
      		<td><c:out value="${usuarios.telefone}" /></td>
      		<td><c:out value="${usuarios.id_cidade}" /></td>
      		<td><c:out value="${usuarios.obs}" /></td>
      		<td><c:out value="${usuarios.id_papel}" /></td>    	
  		</c:forEach> 
  		</tr>
	</table>

    </form>
		</DIV>
	</SECTION>

    <SECTION>
            <DIV class="container">
            <DIV class="row-fluid" id="breadcrumb">
            <BUTTON class="bfSubmitButton btn btn-primary pull-left button" 
        id="bfSubmitButton" onclick="history.back();"
        type="button" value="Colaborador">
        <SPAN>Voltar</SPAN></BUTTON>    
            </DIV></DIV>
    </SECTION>

	<SECTION 
		class=" " id="sp-footer2-wrapper">
		<DIV class="container">
		<DIV class="row-fluid" id="footer2">
		<DIV class="span12" id="sp-position1">
		<DIV class="custom">
		<DIV class="row-fluid">	 
		<DIV class="span2">
		<H4></H4>
		</DIV></DIV></DIV></DIV></DIV></DIV>
	</SECTION>
	<FOOTER 
	class=" " id="sp-footer-wrapper">
	<DIV class="container">
	<DIV class="row-fluid" id="footer">
	<DIV class="span12" id="sp-footer1">
	<DIV class="custom">
	<BR><BR><BR>
	</DIV></DIV></DIV></DIV>
<!--<João Manoel Franco 5º ADS FATEC-SJC>--> 
</BODY></HTML>