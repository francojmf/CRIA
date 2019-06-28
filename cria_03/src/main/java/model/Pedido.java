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

public class Pedido {
    private Long id;
    private String entidade;
    private String cnpj;
    private String nomecri;
    private Long idade;
    private Long medA;
    private Long medB;
    private Long medC;
    private Long medD;
    private Long medE;
    private Long medF;
    private String endereco;
    private String obs;

    Connection conexao;
    
    public Pedido() throws SQLException{
    
    	 conexao = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/back_end_cria1","francojmf", "1245");
    }
    public Pedido(String entidade, String cnpj,
                   String crianca){            
    }

    public String getEntidade() {
        return entidade;
    }
    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

	public void setNomecri(String nomecri) {
		this.nomecri = nomecri;
	}
	public String getNomecri() {
		return nomecri;
	}

    public Long getIdade() {
        return idade;
    }
    public void setIdade(Long idade) {
        this.idade = idade;
    }

 
    public Long getMedA() {
        return medA;
    }
    public void setMedA(Long medA) {
        this.medA = medA;
    }

    public Long getMedB() {
        return medB;
    }
    public void setMedB(Long medB) {
        this.medB = medB;
    }

    public Long getMedC() {
        return medC;
    }
    public void setMedC(Long medC) {
        this.medC = medC;
    }

    public Long getMedD() {
        return medD;
    }
    public void setMedD(Long medD) {
        this.medD = medD;
    }

    public Long getMedE() {
        return medE;
    }
    public void setMedE(Long medE) {
        this.medE = medE;
    }

    public Long getMedF() {
        return medF;
    }
    public void setMedF(Long medF) {
        this.medF = medF;
    }

    public String getEnder() {
        return endereco;
    }
    public void setEnder(String endereco) {
        this.endereco = endereco;
    }

	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}


}

 