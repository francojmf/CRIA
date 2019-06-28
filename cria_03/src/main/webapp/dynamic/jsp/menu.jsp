<%-- 
    Document   : home
    Created on : 19/05/2019, 09:45:30
    Author     : francojmf

    <%@ include file="/static/css/css.css"%>
--%>
<%@page import="model.EnumPapeis"%>
<%@page import="model.Papel"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 


<header class="container" id="sp-header-wrapper">

        <DIV class="sp-header-wrapper">
        <DIV class="span12" id="header"> 
        <DIV class="mod-wrapper clearfix" style="color:white">
            <h1>Universidade Federal de São Paulo</h1>
        </DIV></DIV></DIV>

    <nav>

       <ul class="sp-header-wrapper" id="tipo_01" >
           <co> <a href="${pageContext.request.contextPath}/Adicionar.action">| Adicionar Usuário | </a> </co>
            <co> <a href="${pageContext.request.contextPath}/Remover.action">| Remover Usuário | </a></co>
            <co> <a href="/listaUsuarios.jsp">| Listar Usuários |</a></co>
            <co> <a href="${pageContext.request.contextPath}/Alterar.action">| Alterar Usuário |</a></co>                    
       
            <co> <a href="${pageContext.request.contextPath}">| Sair |</a></co>
        </ul>

	</nav>

</header>
