package model;

import model.UsuarioPapelDAO;
import model.Papel;
import model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francojmf
 */
public class UsuarioPapelDAOMariaDB10 implements UsuarioPapelDAO{

    Connection conexao;
    
    public UsuarioPapelDAOMariaDB10(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conexao = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/back_end_cria1","francojmf", "1245");
            
        } catch (Exception e){
            System.out.print("Erro de conexão UsuarioPapelDAOMysql");
        }
    }
    
    @Override
    public List<Long> findByNomeUsuario(Usuario u) {
        List<Long> idPapeis = new ArrayList();
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from usuario_papel where id_usuario = ?");  
            comandoSQLp.setString(1, u.getId().toString());
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()){
             idPapeis.add(rs.getLong(2));
            }
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return idPapeis;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Usuario-Papel");
        }
        return idPapeis;
    }

    @Override
    public List<Long> findByPapel(Papel p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
