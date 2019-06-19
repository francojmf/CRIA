<%-- 
    Document   : home
    Created on : 19/05/2019, 09:45:30
    Author     : francojmf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- 
<%@ include file="/static/css/css.css"%>
<%@ include file="/static/base/header.jsp"%>
--%>

<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>

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
        <LINK href="static/css/template.css" rel="stylesheet" type="text/css">  
        <LINK href="css/all.css" rel="stylesheet" crossorigin="anonymous" 
        integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"> 
        <link rel="stylesheet"
        href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <SCRIPT src="static/js/jquery.min.js" type="text/javascript"></SCRIPT>  
        <title>Login</title>
    </head>
    <body>
        <form class="custom" action="Autenticador.action" method="post">
            <label class="form-actions">
                Nome de Usuário:
                <input name="nomeUsuario" type="text" required class="formInput formTextInput">
            </label>
            <label class="form-actions">
                Senha:
                <input name="senha" type="password" required class="formInput formTextInput">
           </label>
                <input type="submit" value="Entrar" class="submitButton">                
        </form>    
        <SECTION>
            <DIV class="container">
            <DIV class="row-fluid" id="breadcrumb">
            <h4><BR> Clique no botão abaixo para fazer 
            um novo cadastro.<BR></h4>
            <BUTTON class="bfSubmitButton btn btn-primary pull-left button" 
            id="bfSubmitButton" onclick="window.location=('dynamic/jsp/cadastro.jsp');" 
            type="button" value="Cadastro de Entidade">
            <SPAN>Novo Cadastro</SPAN></BUTTON>
            <BUTTON class="bfCancelButton btn btn-secondary pull-left button" 
            onclick="window.location=('static/senha01.htm');" type="submit" value="Esqueci a senha">
            <SPAN>Esqueci a senha</SPAN></BUTTON>  
            </DIV></DIV>
        </SECTION>
    </body>
</html>

    
<%-- 
<%@ include file="/static/base/footer.jsp"%> 



--%>