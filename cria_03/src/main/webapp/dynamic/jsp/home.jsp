<%-- 
    Document   : home
    Created on : 19/05/2019, 09:45:30
    Author     : francojmf
--%>

<%@page import="model.Papel"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>

<%-- 
<%@ include file="/static/css/css.css"%>
<%@ include file="/static/base/header.jsp"%> 

--%>

<!DOCTYPE html>
<html>

    <head>
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
    <SCRIPT src="static/js/scripts.js" type="text/javascript"></SCRIPT>  
    <title>Home</title>
        <% Usuario u = (Usuario)request.getAttribute("usuarioLogado"); %>
        <%@include file= "menu.jsp" %> 
        <% String usuario =  u.getNomeUsuario(); %> 
        <div class="custom" content="text/html; charset=utf-8">
            <p>Olá usuário <%= u.getNome() %></p>
            <p>Seu e-mail cadastrado é: <%= u.getNomeUsuario() %></p>
            <p>Sua senha cadastrada é: <%= u.getSenha() %> </p>
            <p>Você tem privilégios de: </p>
            <ul>
            <% for(Papel p: u.getPapeis() ){ %>
            <li><%= p.getDescricao().toString() %></li>
            <%} %>
            </ul>
        </div>
    <SECTION>
    <DIV class="form-actions">
        <BUTTON class="bfCancelButton btn btn-secondary pull-left button" 
        onclick="window.location=('static/menu02.htm');" type="submit" value="Menu Entidade">
        <SPAN>Entidade</SPAN></BUTTON> 
        <BUTTON class="bfSubmitButton btn btn-primary pull-left button" 
        id="bfSubmitButton" onclick="window.location=('static/menu01.htm');"
        type="button" value="Colaborador">
        <SPAN>Colaborador</SPAN></BUTTON>
        <BUTTON class="bfCancelButton btn btn-secondary pull-left button" 
        onclick="window.location=('static/menu03.htm');" type="submit" value="Menu Gerente">
        <SPAN>Gerente</SPAN></BUTTON> 
        <BUTTON class="bfSubmitButton btn btn-primary pull-left button" 
        id="bfSubmitButton" onclick="window.location=('static/menu04.htm');"
        type="button" value="Administrador">
        <SPAN>Administrador</SPAN></BUTTON><br>

    </DIV></DIV>
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
    </body>
</html>