package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Pedido;

public class RepositorioPedido {

	private static RepositorioPedido instance;
	protected EntityManager entityManager;

	public static RepositorioPedido getInstance() {
		if (instance == null) {
			instance = new RepositorioPedido();
		}

		return instance;
	}

	private RepositorioPedido() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pedido_cria");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Pedido getPorID(String id) {
		return entityManager.find(Pedido.class, Integer.parseInt(id));
	}
	
	public Pedido getPorEntidade(String entidade) {
		Query query = entityManager.createQuery("from "+Pedido.class.getName()+" where entidade = :entidade ");
		query.setParameter("entidade", entidade);
		Pedido pedido = (Pedido) query.getSingleResult();
		return pedido;
	}

	@SuppressWarnings("unchecked")
	public List<Pedido> getTodos() {
		Query query = entityManager.createQuery("from "+Pedido.class.getName()+"");
		List<Pedido> listaPedido = query.getResultList();
		return listaPedido;
	}

	public void salvar(Pedido pedido) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pedido);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void editar(Pedido pedido) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(pedido);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void excluir(Pedido pedido) {
		try {
			entityManager.getTransaction().begin();
			pedido = entityManager.find(Pedido.class, pedido.getId());
			entityManager.remove(pedido);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
}
