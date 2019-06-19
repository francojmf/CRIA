<%-- 
    Document   : home
    Created on : 19/05/2019, 09:45:30
    Author     : francojmf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- 
<%@ include file="/../../static/css/css.css"%>
<%@ include file="/../../static/base/header.jsp"%>
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
        <title>Cadastro</title>
    </head>
    
    <body>
 
    <h1>Projeto CRIA - Tela de Cadastro</h1>
    <hr>

    <form class="form-actions" action="../../ControleCadastro.action" method="post">

        <label class="span6">Nome: <input  type="text" name="edtNome" size="60"/>  
        </label>
         
        <label class="span6">Email: <input type="text" name="edtNomeusuario" size="50"/>   
         </label>      
         
        <label class="span6">Senha: <input type="text" name="edtSenha" size="20"/>
        </label>
         
        <label class="span6">Entidade: <input type="text" name="edtEntidade" size="50"/>  
        </label>        
         
        <label class="span6">CPF: <input type="text" name="edtCPF" size="15"/>
        </label>        

        <label class="span6">Telefone: <input type="text" id="edtTelefone" size="20"/>
        </label>         
             
        <label class="span6">Cidade: 
        <SELECT name="edtCidade" class="ff_elem chzn-done" id="edtCidade" data-chosen="no-chzn">
        <OPTION value="1">São José dos Campos-SP</OPTION> 
        <OPTION value="2">Jacareí-SP</OPTION> 
        <OPTION value="3">Caçapava-SP</OPTION> 
        <OPTION value="4">São Paulo-SP</OPTION>
        <OPTION value="5">Santo André-SP</OPTION> 
        <OPTION value="6">Taubaté-SP</OPTION> 
        <OPTION selected="selected" value="7">Outra cidade - Obs</OPTION>
        <input type="hidden" size="20"/>
        </label>
         
        <label class="span6">Obs: 
            <input type="text" id="edtObs" size="200"/>
        </label> 

        <ul class="span12">
            <label class="span2">Tipo de Usuário: </label>
            <button><input type="radio" name="edtId_papel" value="4" />  Entidade </button>
            <button><input type="radio" name="edtId_papel" value="3" />  Cooperador  </button>
            <button><input type="radio" name="edtId_papel" value="2" />  Gerente  </button>

            <button><input type="radio" name="edtId_papel" value="1" />  Administrador </button>  
        </ul>
        <hr>
    <DIV class="span8">
        <input type="submit" value="Cadastrar" class="submitButton"> 
        <input accesskey="c" type="reset" name="btnCancelar" value="Limpar">
    </DIV>
    </form>

        <SECTION>
            <DIV class="container">
            <DIV class="row-fluid" id="breadcrumb">
        <BUTTON class="bfSubmitButton btn btn-primary pull-left button">
            <SPAN href="${pageContext.request.contextPath}">Sair</SPAN>
        </BUTTON>  
            </DIV></DIV>
        </SECTION>
    </body>
</html>

    
<%-- 
<%@ include file="/../../static/base/footer.jsp"%> 



--%>