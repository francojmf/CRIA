package controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginDAO;
import model.Usuario;
import model.CriarConexao;
import java.util.Random;


/**
 *
 * @author francojmf
 */

@WebServlet("/ControleCadastro.action")
public class ControleCadastro extends HttpServlet {   
	private static final long serialVersionUID = 1L;
	
	public ControleCadastro() {
        super();        
    }
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

            Random n= new Random();
            Long id = (long) n.nextInt(99);
            String nome = req.getParameter("edtNome"); 
            String nomeUsuario = req.getParameter("edtNomeusuario");
            String senha = req.getParameter("edtSenha");
            String entidade = req.getParameter("edtEntidade");
            String cpf = req.getParameter("edtCPF");
            Long id_cidade = Long.parseLong(req.getParameter("edtCidade"));
            String tel = req.getParameter("edtTelefone");
            String obs = req.getParameter("edtObs");
            Long papel = Long.parseLong(req.getParameter("edtId_papel"));

    	Connection conexao ;
    	
        try{
        	conexao = CriarConexao.getConexao();
        	
        	Usuario user = new Usuario();
        	user.setId(id);
        	user.setNomeUsuario(nomeUsuario);
        	user.setSenha(senha);
            user.setNome(nome);
            user.setEntidade(entidade);
            user.setCpf(cpf);
            user.setId_cidade(id_cidade);
            user.setTel(tel);            
            user.setObs(obs);
            user.setPapel(papel);
            
        	LoginDAO dao = new LoginDAO(conexao);
        	dao.insert(user);
        	        	          
        	resp.sendRedirect("home.jsp");             
         } catch (SQLException e) {
             e.printStackTrace();
             System.out.println("Erro ao gravar Dados !!! ");
         }

         }//doPost
    }
    
  