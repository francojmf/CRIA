package model;

import model.UsuarioDAO;
import model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author francojmf
 */
public class UsuarioDAOMariaDB10 implements UsuarioDAO{

    Connection conexao;
    
    public UsuarioDAOMariaDB10(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conexao = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/back_end_cria1","francojmf", "1245"); 
            
            System.out.println("Conectado.. Usuario DAO...");
        } catch (Exception e){
            System.out.print("Erro de conexão...UsuarioDAOMYSQL");
        }
    }
    
    @Override
    public Usuario insert(Usuario usuario){
    	throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public Usuario findById(Long id) {
        Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from back_end_cria1.usuario where id = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei...");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNomeUsuario(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNome(rs.getString(4));
        
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario ");
        }
        return u;
    }

    @Override
    public Usuario findByNomeUsuario(String nomeUsuario){
        Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from usuario where nomeusuario = ?");  
            comandoSQLp.setString(1, nomeUsuario);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectado...");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNomeUsuario(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNome(rs.getString(4));
          
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            //comandoSQLp.close();
            rs.close();
            //conexao.close();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão... find by nome usuário");
        }
        return u;
    }
   /* 
    
        public void setAprovado(Long id) {
        try {
            PreparedStatement pSt = conexao
                    .prepareStatement("update usuario set aprovado=true where id = ?");
            pSt.setLong(1, id);
            pSt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public Usuario findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario update(Usuario usuarioAnt, Usuario usuarioAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
	
	public Usuario newusuarioByRequest(HttpServletRequest request) throws SQLException {
		Usuario usuario = new Usuario();
		
		usuario.setNome(request.getParameter("nome"));
		usuario.setNomeUsuario(request.getParameter("nomeUsuario"));
		usuario.setEntidade(request.getParameter("entidade"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setAprovado(false);
		
		return usuario;
	}
    
    */
}
