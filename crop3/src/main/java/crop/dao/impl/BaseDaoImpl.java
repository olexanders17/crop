package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.metamodel.source.annotations.entity.EntityClass;
import org.springframework.stereotype.Repository;

import crop.dao.BaseDao;

@Repository
public class BaseDaoImpl<E, N> implements BaseDao<E, N> {

	private Class<E> entityClass;

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
	public void add(E entity) {
		em.persist(entity);

	}

	@Override
	public void update(E entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public E getById(N id) {
		return (E) em.createQuery("select from" + entityClass.getSimpleName() + " e where e.id=:id").setParameter(1, id).getSingleResult();

	}

	@Override
	public List<E> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(E entity) {
		// TODO Auto-generated method stub

	}

}
