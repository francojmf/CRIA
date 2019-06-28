package model;

import model.Usuario;
import java.util.List;

/**
 *
 * @author francojmf
 */
public interface UsuarioDAO {
    public Usuario insert(Usuario Usuario);
    public Usuario findById(Long id);
    public Usuario findByNomeUsuario(String nomeUsuario);
    //public Usuario findByName(String name);
   // public List<Usuario> findAll();
   // public Usuario update(Usuario usuarioAnt, Usuario usuarioAt);
   // public boolean delete(Usuario usuario);
   // public boolean delete(Long id);  
}
