package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.TechCardsDao;
import crop.domain.TechCards;

@Repository
public class TechCardsDaoImpl extends BaseDaoImpl<TechCards, Long>implements TechCardsDao {

	public TechCardsDaoImpl() {

	}

	public TechCardsDaoImpl(Class<TechCards> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
