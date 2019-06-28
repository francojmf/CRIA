package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.Usuario;


public class LoginDAO {
    
    private Connection conexao;
    
    public LoginDAO(Connection conexao){
        this.conexao = conexao;
    }
    
    public void insert(Usuario usuario) throws SQLException{
        
  String sql = "insert into usuario(id,nomeusuario,senha,nome,entidade,cpf,telefone,id_cidade,obs,id_papel) values(?,?,?,?,?,?,?,?,?,?);";   

  try {
    PreparedStatement pSt = conexao.prepareStatement(sql);
        pSt.setLong(1, usuario.getId());
        pSt.setString(2, usuario.getNomeUsuario());
        pSt.setString(3, usuario.getSenha());       
        pSt.setString(4, usuario.getNome());
        pSt.setString(5, usuario.getEntidade());
        pSt.setString(6, usuario.getCpf());
        pSt.setString(7, usuario.getTel());
        pSt.setLong(8, usuario.getId_cidade());
        pSt.setString(9, usuario.getObs());
        pSt.setLong(10, usuario.getPapel());
      
      pSt.execute();
      pSt.close();
      System.out.println("inserido com sucesso");
     } catch (SQLException e) {
    e.printStackTrace();
   }finally{
    conexao.close();    
    }       
    }
    
//------------------------------------------------------------------------------
    
    public Usuario consulta(String n) throws SQLException {       
  
        String sql = "select * from usuario where nomeusuario like ?";//query sql
        PreparedStatement smt;// criar varivel Preparadora
        try {
            smt = (PreparedStatement) conexao.prepareStatement(sql);//iniciar variável preparadora

            smt.setString(1, n);//recebe o parametro a ser buscado
            ResultSet rs = smt.executeQuery();//criar Result, pecorre a procura do parametro executado a query

            Usuario u = new Usuario();//instaciar o modelo 

            rs.next();//ir para proximo 
            u.setId(rs.getLong("id"));
            u.setNome(rs.getString("nome"));
            u.setPapel(rs.getLong("id_papel"));
           
            smt.close();//fecha a variavel preparadora
            rs.close();//fecha o rs
            return u;//devolver o resultado

        } catch (SQLException ex) {
            return null;
        } finally {
          conexao.close();
        }
    
    }
  //--------------------------------------------------------------------------------------------------------------------------------------------------
  public List<Usuario> getList() {

    try {
      String sql = "select * from usuario";

      PreparedStatement smt = conexao.prepareStatement(sql);
      ResultSet rs = smt.executeQuery();

      List<Usuario> minhaLista = new LinkedList<Usuario>();
      //TreeSet<Usuario> minhaLista = new TreeSet<Usuario>();
      while (rs.next()) {
        Usuario c = new Usuario();

        c.setId(rs.getLong("id"));
        c.setNomeUsuario(rs.getString("nomeusuario"));
        c.setSenha(rs.getString("senha"));
        c.setNome(rs.getString("nome"));
        c.setEntidade(rs.getString("entidade"));
        c.setCpf(rs.getString("cpf"));
        c.setTel(rs.getString("telefone"));       
        c.setId_cidade(rs.getLong("id_cidade"));
        c.setObs(rs.getString("obs"));
        c.setObs(rs.getString("id_papel"));

        minhaLista.add(c);
        Collections.reverse(minhaLista);
      }

      smt.close();
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
    
   //---------------------------------------------------------------------------------------------------------
    
    public void atualizar(Usuario u) {
    String sql = "update usuario set senha=?  where nomeusuario=?";
    try {
      PreparedStatement stmt = conexao.prepareStatement(sql);
      
      stmt.setString(1, u.getSenha());    
      stmt.setString(2, u.getNomeUsuario());      
      
      stmt.execute();
      stmt.close();
      System.out.println("atualizado com sucesso");
    } catch (SQLException ex) {
      ex.printStackTrace();
    } finally {
      try {
        conexao.close();
      } catch (SQLException ex) {
        ex.printStackTrace();
      }

    }}

}


