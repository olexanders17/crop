package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.TechCardsDao;
import crop.domain.TechCards;

@Repository
public class TechCardsDaoImpl implements TechCardsDao {

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void addTechCards(TechCards techCards) {
		em.persist(techCards);

	}

	@Transactional
	public void updateTechCards(TechCards techCards) {
		em.merge(techCards);

	}

	@Transactional
	public TechCards getTechCardsById(int id) {
		return  (TechCards) em.createNamedQuery("TechCards.getTCById").setParameter("id", id).getSingleResult();
		
		
	}

	@Transactional
	public List<TechCards> getAllTechCards() {
		return em.createQuery("from TechCards").getResultList();
		
	}

	@Transactional
	public void deleteTechCards(TechCards techCards) {
		em.remove(techCards);

	}

	

}
