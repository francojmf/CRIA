package controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginDAO;
import model.Usuario;
import model.CriarConexao;

import java.util.List;
import java.util.Random;


/**
 *
 * @author francojmf
 */

@WebServlet("/ListaUsuarios.action")
public class ListaUsuarios extends HttpServlet {   
	private static final long serialVersionUID = 1L;
	
	public ListaUsuarios() {
        super();        
    }
	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {


    	Connection conexao ;
    	
        try{
        	conexao = CriarConexao.getConexao();
        	

            
        	LoginDAO dao = new LoginDAO(conexao);

            
            List<Usuario> usuarios = dao.getList();
            req.setAttribute("usuarios", usuarios);

            RequestDispatcher rd = req.getRequestDispatcher("/listaUsuarios.jsp");
            rd.forward(req, resp);        	        	          
        	conexao.close();          
         } catch (SQLException e) {
             e.printStackTrace();
             System.out.println("Erro ao buscar dados !!! ");
         }

         }
    }
    
  