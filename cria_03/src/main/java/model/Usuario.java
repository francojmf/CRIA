package model;


import java.sql.SQLException;
import java.util.List;

import controller.Autenticador;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author francojmf
 */

public class Usuario extends Identificador{
    protected Long id;
    protected String nome;
    protected String senha;
    protected String nomeUsuario;
    protected String entidade;
    protected String tel;
    protected Long id_cidade;
    protected List<Cidade> cidades;
    protected String cpf;
    protected String obs;
    protected Long papel;
    protected List<Papel> papeis;

    Connection conexao;
    
    public Usuario() throws SQLException{
    
    	 conexao = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/back_end_cria1","francojmf", "1245");
    }
    public Usuario(String nome, String senha,
                   String nomeUsuario){            
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
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

    public String getNomeUsuario() {
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
    public Long getPapel() {
        return papel;
    }
    public void setPapel(Long papel) {
        this.papel = papel;
    }
	public String getEntidade() {
		return entidade;
	}
	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long getId_cidade() {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}

}


 