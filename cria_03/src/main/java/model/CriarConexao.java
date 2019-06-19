
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

public class CriarConexao{

    static Connection conexao;
    
    public static Connection getConexao() throws SQLException{

        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conexao = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/back_end_cria2","francojmf", "1245"); 
            
            System.out.println("Conectado.. Usuario DAO...");
        } catch (Exception e){
            System.out.print("Erro de conexão...UsuarioDAOMYSQL");
        }
		return conexao;
    }

}
