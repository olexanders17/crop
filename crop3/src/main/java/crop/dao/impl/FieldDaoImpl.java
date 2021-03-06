package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.FieldDao;
import crop.domain.Field;

@Repository
public class FieldDaoImpl extends BaseDaoImpl<Field, Long>implements FieldDao {

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public FieldDaoImpl() {
	super(Field.class);
	}
	
	
	public FieldDaoImpl(Class<Field> entityClass) {
		super(entityClass);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}


	@Override
	@Transactional
	public void add(Field entity) {
		// TODO Auto-generated method stub
		super.add(entity);
	}


	@Override
	@Transactional
	public void update(Field entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}


	@Override
	@Transactional
	public Field getById(Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}


	@Override
	@Transactional
	public List<Field> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}


	@Override
	@Transactional
	public void delete(Field entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	
	
}
