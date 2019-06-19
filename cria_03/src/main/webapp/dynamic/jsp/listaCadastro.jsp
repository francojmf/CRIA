<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Lista Usuários</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>Email</th>
                <th>Nome</th>
                <th>Senha</th>
                <th>Entidade</th>
                <th>CPF</th>
                <th>Telefone</th>
                <th>Observação</th>
                <th>Cidade</th>
                <th>Tipo</th>                
            </tr>
        </thead>
        <tbody>
            <c:forEach var="usuario" items="${usuarios}" >
                <tr>
                    
                    <td><a href="CadastroControle?nomeUsuario=${usuario.getNomeUsuario()}"><c:out value="${usuario.getNomeUsuario()}" /></a></td>
                    <td><c:out value="${usuario.getNome()}" /></td>
                    <td><c:out value="${usuario.getSenha()}" /></td>
                    <td><c:out value="${usuario.getEntidade()}" /></td>
                    <td><c:out value="${usuario.getCPF()}" /></td>
                    <td><c:out value="${usuario.getTel()}" /></td>
                    <td><c:out value="${usuario.getObs()}" /></td>
                    <td><c:out value="${usuario.getPapel()}" /></td>
                    <td><span><c:out value="${usuario.getAprovado()}" /></span>
                        <c:if test="${usuario.getAprovado() == false }">
                            <form style='display:inline;' method="POST" action="CadastroControle">
                                <button type="submit">Aprovar</button> 
                                <input type="hidden" name="action" value="true">
                                <input type="hidden" name="id" value="${usuario.getId()}">
                            </form>
                        </c:if>
<%-- 
                    <td><span><c:out value="${usuario.getAprovado()}" /></span>
                        <c:if test="${usuario.getAprovado() == false }">
                            <form style='display:inline;' method="POST" action="CadastroControle">
                                <button type="submit">Aprovar</button> 
                                <input type="hidden" name="action" value="aprovado">
                                <input type="hidden" name="id" value="${usuario.getId()}">
                            </form>
                        </c:if>
                    </td>
                    <td><a href="UserController?action=delete&userId=<c:out value="${user.userid}"/>">Delete</a></td> --%>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>