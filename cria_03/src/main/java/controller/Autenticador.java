/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;
import model.ServicoUsuario;
import model.ServicoUsuarioImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;

/**
 *
 * @author francojmf
 */

@WebServlet("/Autenticador.action")
public class Autenticador extends HttpServlet {   
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        
        try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){} 
        String nomeUsuario = req.getParameter("nomeUsuario");
        String senha = req.getParameter("senha");
        ServicoUsuario sUsuario = new ServicoUsuarioImpl();
        Usuario uBD = sUsuario.findByNomeUsuario(nomeUsuario);      
        ServletContext sc = req.getServletContext();
        if (uBD!= null && uBD.getSenha().equals(senha)){
            try{
                req.setAttribute("usuarioLogado",uBD);
                sc.getRequestDispatcher("/dynamic/jsp/home.jsp").forward(req, resp); 
            }catch( Exception e){
               //Tratamento de exceção... 
            }            
        }
        else{
            try {
                req.setAttribute("falhaAutenticacao", true);
                sc.getRequestDispatcher("/dynamic/jsp/login.jsp").forward(req, resp);
            }catch(Exception e){
                //Tratamento de erro de IO ou de Servlet..
            }  
        }//if-else 
    }//doPost
  
    
}//Autenticador.java

/*
    
	protected void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String edtNome = request.getParameter("edtNome");
		String edtNomeusuario = request.getParameter("edtNomeusuario");
		String edtSenha = request.getParameter("edtSenha");
		String edtEntidade = request.getParameter("edtEntidade");
		String edtCPF = request.getParameter("edtCPF");
		String edtCidade = request.getParameter("edtCidade");
		String edtTelefone = request.getParameter("edtTelefone");
		String edtObs = request.getParameter("edtObs");
		//String Papelid = request.getParameter("edtId_papel");
		ServletContext sc = request.getServletContext();
		try {

			// Chamar Driver do Banco
			Class.forName("org.mariadb.jdbc.Driver");
			String sql = "insert into usuario (nome,nomeusuario,senha,entidade,cpf,id_cidade,telefone,obs) values(?,?,?,?,?,?,?,?,?)";
			sc.getRequestDispatcher("/dynamic/jsp/cadastro.jsp").forward(request, response); 
			// Abrir Conexão
			try {
				Connection conn = (Connection) DriverManager
						.getConnection("jdbc:mariadb://localhost:3306/back_end_cria2", "francojmf", "1245");
				PreparedStatement pstm = ((java.sql.Connection) conn).prepareStatement(sql);
				pstm.setString(1, edtNome);
				pstm.setString(2, edtNomeusuario);
				pstm.setString(3, edtSenha);
				pstm.setString(4, edtEntidade);
				pstm.setString(5, edtCPF);
				pstm.setString(6, edtCidade);
				pstm.setString(7, edtTelefone);
				pstm.setString(8, edtObs);
				//pstm.setString(9, Papelid);

				pstm.execute();
				pstm.close();
				conn.close();
			} catch (SQLException e) {
				out.println("<p class='erro'>Houve uma falha ao tentar acessar o banco: </p>" + e);
				out.println("<SPAN href=\"${pageContext.request.contextPath}\">Sair</SPAN>");
			} finally {
				out.println("<p class='confirmado'>Cadastrado com Sucesso!</p>");
				out.println("<SPAN href=\"${pageContext.request.contextPath}\">Sair</SPAN>");
			}

		} catch (ClassNotFoundException e) {
			out.println("<p class='erro'>O contato não foi cadastrado: </p>" + e);
			out.println("<SPAN href=\"${pageContext.request.contextPath}\">Sair</SPAN>");
		}
	}  
*/