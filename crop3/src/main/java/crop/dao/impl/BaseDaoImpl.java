package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.BaseDao;

@Repository
public class BaseDaoImpl<E, N> implements BaseDao<E, N> {

	private Class<E> entityClass;

	public BaseDaoImpl() {
		// super();
		// this.entityClass = entityClass;
	}

	public BaseDaoImpl(Class<E> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	@Transactional
	public void add(E entity) {
		em.persist(entity);

	}

	@Override
	@Transactional
	public void update(E entity) {
		em.merge(entity);

	}

	@Override
	@Transactional
	public E getById(N id) {
		return (E) em.createQuery("select e from " + entityClass.getSimpleName() + " e where e.id = :id").setParameter("id", id).getSingleResult();

	}

	@Override
	@Transactional
	public List<E> getAll() {

		return em.createQuery("from " + entityClass.getSimpleName()).getResultList();
	}

	@Override
	@Transactional
	public void delete(E entity) {
		em.remove(em.merge(entity));

	}

}
