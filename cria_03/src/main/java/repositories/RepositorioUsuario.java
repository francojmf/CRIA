package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;

public class RepositorioUsuario {

	private static RepositorioUsuario instance;
	protected EntityManager entityManager;

	public static RepositorioUsuario getInstance() {
		if (instance == null) {
			instance = new RepositorioUsuario();
		}

		return instance;
	}

	private RepositorioUsuario() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("usuario");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Usuario getPorID(String id) {
		return entityManager.find(Usuario.class, Integer.parseInt(id));
	}
	
	public Usuario getPorNome(String nome) {
		Query query = entityManager.createQuery("from "+Usuario.class.getName()+" where nome = :nome ");
		query.setParameter("nome", nome);
		Usuario usuario = (Usuario) query.getSingleResult();
		return usuario;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> getTodos() {
		Query query = entityManager.createQuery("from "+Usuario.class.getName()+"");
		List<Usuario> listaUsuario = query.getResultList();
		return listaUsuario;
	}

	public void salvar(Usuario usuario) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(usuario);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void editar(Usuario usuario) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(usuario);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void excluir(Usuario usuario) {
		try {
			entityManager.getTransaction().begin();
			usuario = entityManager.find(Usuario.class, usuario.getId());
			entityManager.remove(usuario);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
}
