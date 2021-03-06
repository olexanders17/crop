package crop.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import crop.dao.OperationsDao;
import crop.domain.Operations;

@Repository
public class OperationsDaoImpl  extends BaseDaoImpl<Operations, Long> implements OperationsDao  {

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public OperationsDaoImpl() {
	
	}
	
	public OperationsDaoImpl(Class<Operations> entityClass) {
		super(entityClass);
	}
	
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}



	
	


}
