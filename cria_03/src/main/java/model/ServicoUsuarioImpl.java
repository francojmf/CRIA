/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.PapelDAO;
import model.UsuarioDAO;
import model.UsuarioPapelDAO;
import model.Papel;
import model.Usuario;
import model.ServicoUsuario;
import model.PapelDAOMariaDB10;
import model.UsuarioDAOMariaDB10;
import model.UsuarioPapelDAOMariaDB10;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.ControleCadastro;

/**
 *
 * @author francojmf
 */
public class ServicoUsuarioImpl implements ServicoUsuario {
	UsuarioDAO uDao = new UsuarioDAOMariaDB10();

    @Override
    public Usuario insert(Usuario usuario) throws SQLException {
    	//uDao = usuario.getNomeUsuario();
    	 Usuario usuarioNovo =  uDao.insert(usuario);
       return usuarioNovo;
    } // chama o DAO  

        

    @Override
    public Usuario findByNomeUsuario(String nomeUsuario) {
        
        UsuarioPapelDAO upDao = new UsuarioPapelDAOMariaDB10();
        PapelDAO pdao = new PapelDAOMariaDB10();
        Usuario u = uDao.findByNomeUsuario(nomeUsuario);
        List<Long> idPapeis = upDao.findByNomeUsuario(u);
        List<Papel> papeis = new ArrayList();
        for ( Long id: idPapeis){
            papeis.add(pdao.findById(id));
        }
        u.setPapeis(papeis);
        return u;
    }
    
    
}
