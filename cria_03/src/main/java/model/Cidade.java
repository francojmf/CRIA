/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author francojmf
 */

@Entity(name="cidade")
public class Cidade {
    
    @Id
    private long id_cidade;
    
    @Column(name="nomeCid")
    private String cidade;
    
    public Cidade(){}

    public long getIdCidade() {
        return id_cidade;
    }

    public void setId(long id) {
        this.id_cidade = id_cidade;
    }

    public String getNomeCid() {
        return cidade;
    }

    public void setNomeCid(String nome) {
        this.cidade = cidade;
    }  
}
