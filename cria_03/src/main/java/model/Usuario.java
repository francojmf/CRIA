/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import controller.Autenticador;
import model.UsuarioDAOMariaDB10;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author francojmf
 */

public class Usuario extends Identificador{
    private Long id;
    private static Usuario usuario;
    private static String nome;
    private static String senha;
    private static String nomeUsuario;
    private static String entidade;
    private static String tel;
    private static Long id_cidade;
    private static List<Cidade> cidades;
    private static String cpf;
    private static String obs;
    private static Long papel;
    private List<Papel> papeis;
    private static Boolean aprovado;
    //private List<Usuario> usuarios;
    Connection conexao;
    
    public Usuario() throws SQLException{
    
    	 conexao = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/back_end_cria2","francojmf", "1245");
    }
    public Usuario(Long id, Usuario usuario, String nome, String senha,
                   String nomeUsuario, String entidade, 
                   String tel, String cpf, Long id_cidade,
                   String obs, List<Cidade> cidades, 
                   List<Papel> papeis,Long papel){
        super(id);
        this.setId(id);
        this.setUsuario(usuario);
        this.setNome(nome);
        this.setSenha(senha);
        this.setNomeUsuario(nomeUsuario);
        this.setEntidade(entidade);
        this.setTel(tel);
        this.setCpf(cpf);
        this.setId_cidade(id_cidade);
        this.setObs(obs);
        this.setCidade(cidades);
        this.setPapel(papel);
        this.setPapeis(papeis);              
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public List<Papel> getPapeis() {
        return papeis;
    }
    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }
    public static Long getPapel() {
        return papel;
    }
    public void setPapel(Long papel) {
        this.papel = papel;
    }
	public static String getEntidade() {
		return entidade;
	}
	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}
	public static String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public static Long getId_cidade() {
		return id_cidade;
	}
	public void setId_cidade(Long id_cidade) {
		this.id_cidade = id_cidade;
	}

    public List<Cidade> getCidade() {        
		return cidades;
	}
    public void setCidade(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	public static String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public static String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
    public static Boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public static Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

 