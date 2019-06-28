
package model;


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

public class CriarConexao {

	
	public static Connection getConexao() throws SQLException{
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.print("conectou");
			return DriverManager.getConnection("jdbc:mariadb://localhost:3306/back_end_cria1","francojmf", "1245");
		}  catch (SQLException e) {
			throw new SQLException(e);
		}catch (ClassNotFoundException e1) {
			throw new SQLException(e1);
			}	
	
	}
	
}

