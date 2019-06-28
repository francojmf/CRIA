package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PedidoDAO;
import model.Pedido;
import model.CriarConexao;
import java.util.Random;


/**
 *
 * @author francojmf
 */

@WebServlet("/ControlePedido.action")
public class ControlePedido extends HttpServlet {   
	private static final long serialVersionUID = 1L;
	
	public ControlePedido() {
        super();        
    }
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

    	Random n= new Random();
        Long id = (long) n.nextInt(99);
		String entidade = req.getParameter("edtEntidade");
		String cnpj = req.getParameter("edtCNPJ");
		String nomecri = req.getParameter("edtNomecri");
		Long idade = Long.parseLong(req.getParameter("edtIdade"));
		Long medA = Long.parseLong(req.getParameter("edtMedA"));
		Long medB = Long.parseLong(req.getParameter("edtMedB"));
		Long medC = Long.parseLong(req.getParameter("edtMedC"));
		Long medD = Long.parseLong(req.getParameter("edtMedD"));
		Long medE = Long.parseLong(req.getParameter("edtMedE"));
		Long medF = Long.parseLong(req.getParameter("edtMedF"));
		String endereco = req.getParameter("edtEndereco");
		String obs = req.getParameter("edtObs2");

		Connection conexao ;
    	
        try{
        	conexao = CriarConexao.getConexao();
		Pedido pedido = new Pedido();
		pedido.setId(id);
		pedido.setEntidade(entidade);
		pedido.setCnpj(cnpj);
		pedido.setNomecri(nomecri);
		pedido.setIdade(idade);
		pedido.setMedA(medA);
		pedido.setMedB(medB);
		pedido.setMedC(medC);
		pedido.setMedD(medD);
		pedido.setMedE(medE);
		pedido.setMedF(medF);
		pedido.setEnder(endereco);
		pedido.setObs(obs);
		
		PedidoDAO dao = new PedidoDAO(conexao);
    	dao.inserir(pedido);  	        	
        
    	resp.sendRedirect("home.jsp"); 
     } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("Erro ao gravar Dados !!! ");
     }

     }//doPost
}