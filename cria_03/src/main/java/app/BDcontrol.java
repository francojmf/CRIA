/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Cidade;
import model.UserInfo;

/**
 *
 * @author francojmf
 */

public class BDcontrol {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro_usuario");        
        EntityManager em = emf.createEntityManager();
      
        UserInfo u = em.find(UserInfo.class, 1L);
        System.out.println(u.getNome());
        System.out.println(u.getCidade().getNomeCid());
        

        
        String nomeCidade = "Caçapava-SP";
        String query = "SELECT u FROM usuario_info u, IN (u.cidade) c " +
                       "WHERE c.cidade = :nomeCidade";
        String queryb = "SELECT u FROM usuario_info u JOIN u.cidade c " +
                        "WHERE c.cidade = :nomeCidade";
                       
        Query q = em.createQuery(queryb);
        q.setParameter("nomeCidade", nomeCidade);
        List<UserInfo> usuarios = q.getResultList();
        System.out.println("usuários que residem em "+nomeCidade+": ");
        for(UserInfo ul : usuarios){
            System.out.println(ul.getNome());
        }
        
        /* Criando um novo usuário que não possui
        nenhuma cidade associada:
        */
        /*
        UserInfo u2 = new UserInfo();
        u2.setNome("Willian");
        u2.setId(6L);
        em.getTransaction().begin();
        em.persist(u2);
        em.getTransaction().commit();
        */
        
        /* Criando um usuário que possui uma cidade associada
        e esta cidade já consta no BD */
        /*
        UserInfo u3 = new UserInfo();
        Cidade c3 = em.find(Cidade.class, 1L);
        u3.setCidade(c3);
        u3.setNome("Willian");
        u3.setId(6L);        
        em.getTransaction().begin();
        em.persist(u3);
        em.getTransaction().commit();
        u3 = em.find(UserInfo.class, 6L);
        System.out.println("Cidade do Willian: " + u3.getCidade().getNomeCid());
        
        */
        /* Criando um novo usuário e uma nova cidade 
        a ser armazenada no BD (Cidade não deve existir) */
        /*
        UserInfo u4 = new UserInfo();
        u4.setNome("David");
        u4.setId(7L);
        Cidade c4 = new Cidade();
        c4.setNome("Caçapava-SP");
        c4.setId(4);
        u4.setCidade(c4);
        em.getTransaction().begin();
        em.persist(u4);
        em.getTransaction().commit();
        */
        /* Realizando uma atualização: */
        /* 
        UserInfo u4 = new UserInfo();
        u4.setNome("David Alterado");
        u4.setId(7L);
        Cidade c4 = new Cidade();
        c4.setNome("Caçapava-SP Alterada ");
        c4.setId(4);
        u4.setCidade(c4);
        em.getTransaction().begin();
        em.merge(u4);
        em.getTransaction().commit();
        */
        
        /* Efetuando uma busca considerando
        um relacionamento N:1 */
        
        /* Efetuando a remoção de um registro. Nesse caso,
        deve-se alterar o cascateamento para que não seja
        gerada uma violação da integridade referencial.*/        
        /*
        Usuario u5 = em.find(Usuario.class, 3L);
        em.getTransaction().begin();
        em.remove(u5);
        em.getTransaction().commit();
        */
        
        em.close();
        emf.close();        
    }
}
