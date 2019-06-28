/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

import model.Usuario;

/**
 *
 * @author francojmf
 */
public interface ServicoUsuario {
    public Usuario insert(Usuario usuario) throws SQLException;
    public Usuario findByNomeUsuario(String nomeUsuario);

    
}
