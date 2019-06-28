package model;

/**
 *
 * @author francojmf
 */
public class Papel extends Identificador{
    private EnumPapeis descricao;
    
    public Papel(){} //Construtor default
    
    public Papel(Long id, EnumPapeis desc){
       super(id);
       this.setDescricao(desc);
    }    
    
    public EnumPapeis getDescricao() {
        return descricao;
    }

    public void setDescricao(EnumPapeis descricao) {
        this.descricao = descricao;
    }
    
    
}
