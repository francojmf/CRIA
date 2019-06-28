package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.Pedido;


public class PedidoDAO {

	private Connection conexao;

	public PedidoDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void inserir(Pedido pedido) throws SQLException {

		String sql = "insert into pedido(id,entidade,cnpj,nomecri,idade,medA,medB,medC,medD,medE,medF,endereco,obs) values(?,?,?,?,?,?,?,?,?,?,?,?,?);";

		try {
			PreparedStatement pSt = conexao.prepareStatement(sql);
			pSt.setLong(1, pedido.getId());
			pSt.setString(2, pedido.getEntidade());
			pSt.setString(3, pedido.getCnpj());
			pSt.setString(4, pedido.getNomecri());
			pSt.setLong(5, pedido.getIdade());
			pSt.setLong(6, pedido.getMedA());
			pSt.setLong(7, pedido.getMedB());
			pSt.setLong(8, pedido.getMedC());
			pSt.setLong(9, pedido.getMedD());
			pSt.setLong(10, pedido.getMedE());
			pSt.setLong(11, pedido.getMedF());
			pSt.setString(12, pedido.getEnder());
			pSt.setString(13, pedido.getObs());

			pSt.execute();
			pSt.close();
			System.out.println("inserido com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conexao.close();
		}
	}
    
//------------------------------------------------------------------------------
    
    public Pedido consulta(String n) throws SQLException {       
  
        String sql = "select * from pedido where entidade like ?";//query sql
        PreparedStatement pSt;// criar varivel Preparadora
        try {
        	pSt = (PreparedStatement) conexao.prepareStatement(sql);//iniciar variável preparadora

        	pSt.setString(1, n);//recebe o parametro a ser buscado
            ResultSet rs = pSt.executeQuery();//criar Result, pecorre a procura do parametro executado a query

            Pedido pedido = new Pedido();//instaciar o modelo 

            rs.next();//ir para proximo 
            pSt.setLong(1, pedido.getId());
			pSt.setString(2, pedido.getEntidade());
			pSt.setString(3, pedido.getCnpj());
			pSt.setString(4, pedido.getNomecri());
           
			pSt.close();//fecha a variavel preparadora
            rs.close();//fecha o rs
            return pedido;//devolver o resultado

        } catch (SQLException ex) {
            return null;
        } finally {
        	conexao.close();
        }
    
    }
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	public List<Pedido> getList() {

		try {
			String sql = "select * from pedido";
			PreparedStatement pSt = conexao.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();

			List<Pedido> minhaLista = new LinkedList<Pedido>();
			//TreeSet<Pedido> minhaLista = new TreeSet<Pedido>();
			while (rs.next()) {
				
				Pedido pedido = new Pedido();				

				pSt.setLong(1, pedido.getId());
			      pSt.setString(2, pedido.getEntidade());
			      pSt.setString(3, pedido.getCnpj());       
			      pSt.setString(4, pedido.getNomecri());
			      pSt.setLong(5, pedido.getIdade());
			      pSt.setLong(6, pedido.getMedA());
			      pSt.setLong(7, pedido.getMedB());
			      pSt.setLong(8, pedido.getMedC());
			      pSt.setLong(9, pedido.getMedD());
			      pSt.setLong(10, pedido.getMedE());
			      pSt.setLong(11, pedido.getMedF());
			      pSt.setString(12, pedido.getEnder());
			      pSt.setString(13, pedido.getObs()); 

				minhaLista.add(pedido);
				Collections.reverse(minhaLista);
			}

			pSt.close();
			rs.close();

			return minhaLista;
		} catch (SQLException ex) {
			return null;
		} finally {
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  }
		}
    
}   
   //---------------------------------------------------------------------------------------------------------
    



