package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.OperationsDao;
import crop.domain.Operations;
import crop.domain.TechCards;

@Repository
public class OperationsDaoImpl  extends BaseDaoImpl<Operations, Long> implements OperationsDao  {

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public OperationsDaoImpl(Class<Operations> entityClass) {
		super(entityClass);
	}

	
	


}
