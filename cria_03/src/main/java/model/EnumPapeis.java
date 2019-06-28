package model;

/**
 *
 * @author francojmf
 */
public enum EnumPapeis {
    ADMINISTRADOR ("Administrador"), 
    GERENTE ("Gerente"), 
    COLABORADOR ("Colaborador"),
    ENTIDADE ("Entidade"); 
    private final String descricao;        
    EnumPapeis(String valor){
        this.descricao = valor;
    }    
    @Override
    public String toString(){
        return this.descricao;
    }
}
