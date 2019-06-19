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

@WebServlet("/ControleCadastro.action")
public class ControleCadastro extends HttpServlet {   
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
    	
    	
    	Connection conexao = null;
    	
        try{
        	//conexao = (Connection) DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/back_end_cria2","francojmf", "1245"); 
            
            ServletContext sc = req.getServletContext();
       
            sc.getRequestDispatcher("/dynamic/jsp/cadastro.jsp").forward(req, resp); 

            //System.out.println("Conectado.. Usuario DAO...");
        	        	req.setCharacterEncoding("UTF-8");
            String nome = req.getParameter("edtNome"); 
        	String nomeUsuario = req.getParameter("edtNomeusuario");
            String senha = req.getParameter("edtSenha");       	
        	 PreparedStatement pSt = ((java.sql.Connection) conexao)
        	        .prepareStatement("insert into usuario(nome,nomeusuario,senha) values(?,?,?);");
        	            // Parameters start with 1
        	String usuarioNovo = Usuario.getNomeUsuario();
             pSt.setString(1, nome);
             pSt.setString(2, nomeUsuario);
             pSt.setString(3, senha);      	
        	        	
             pSt.executeUpdate();             
             
         } catch (SQLException e) {
             e.printStackTrace();
             System.out.println("Erro ao gravar Dados !!! ");
         }

         }//doPost
    }
    
  
    