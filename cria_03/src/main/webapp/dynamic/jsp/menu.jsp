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
            <co> <a href="${pageContext.request.contextPath}/Listar.action">| Listar Usuários |</a></co>
            <co> <a href="${pageContext.request.contextPath}/Alterar.action">| Alterar Usuário |</a></co>                    
       
            <co> <a href="${pageContext.request.contextPath}">| Sair |</a></co>
        </ul>

	</nav>

</header>
<%-- 
<%@ include file="/static/base/footer.jsp"%> --%>
<%-- 
            <% 
                for(Papel p: u.getPapeis()){
                    if( p.getDescricao().equals(EnumPapeis.ADMINISTRADOR) ){
                        out.print("<li> Administrador </li>");
                    }
                    else if( p.getDescricao().equals(EnumPapeis.GERENTE) ){
                        out.print("<li> Gerente </li><li> ");
                    }
                    else if( p.getDescricao().equals(EnumPapeis.COLABORADOR) ){
                        out.print("<li> Colaborador </li>");
                    }
                    else if( p.getDescricao().equals(EnumPapeis.ENTIDADE) ){
                        out.print("<li> Entidade </li>");
                    }
                 }
            %>
--%>