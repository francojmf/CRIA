package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class LoginDao  implements UsuarioDAO {

	Connection conexao;
	
	public LoginDao(Connection conexao){
		this.conexao = conexao;
	}

    
    public Usuario insert(Usuario usuario){
         Usuario u =null;
         String sql = "insert into usuario(nome,nomeusuario,senha,entidade,cpf,id_cidade,telefone,obs,id_papel) values(?,?,?,?,?,?,?,?,?);";

    try {
        PreparedStatement pSt = conexao.prepareStatement(sql);
        // Parameters start with 1
        usuario = Usuario.getUsuario();
        pSt.setString(1, usuario.getNome());
        pSt.setString(2, usuario.getNomeUsuario());
        pSt.setString(3, usuario.getSenha());
        pSt.setString(4, usuario.getEntidade());
        pSt.setString(5, usuario.getCpf());
        pSt.setLong(6, usuario.getId_cidade());
        pSt.setString(7, usuario.getTel());
        pSt.setString(8, usuario.getObs());
        pSt.setLong(9, usuario.getPapel());
        //pSt.setBoolean(10, usuario.getAprovado());
        pSt.executeUpdate();
        u= usuario;
        conexao.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
        //System.out.println("Erro ao gravar Dados !!! ");
    } 
	return u;	

    }


	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Usuario findByNomeUsuario(String nomeUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
