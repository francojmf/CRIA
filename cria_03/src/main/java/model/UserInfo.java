/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class UserInfo {
@Id   
    private  long id;
    @Column(name="nome")
    private  String nome;       
    
    @ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn(name="idCidade")
    private Cidade cidade;
    
    public void UsuerInfo(){}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }  
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }




}