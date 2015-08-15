package crop.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

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

}
