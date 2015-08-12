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
public class OperationsDaoImpl implements OperationsDao {

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void addOperations(Operations operations) {
		em.persist(operations);

	}

	@Transactional
	public void updateOperations(Operations operations) {
		em.merge(operations);

	}

	@Transactional
	public Operations getOperationsById(int id) {		
		return em.find(Operations.class, id);
		 
	}

	@Transactional
	public List<Operations> getAllOperations() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	public void deleteOperations(Operations operations) {
		em.remove(em.merge(operations));

	}

}
