package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.InputsDao;
import crop.domain.Field;
import crop.domain.Inputs;

@Repository
public class InputsDaoImpl extends BaseDaoImpl<Inputs, Long>implements InputsDao {

	@PersistenceContext(unitName = "Primary")
	private EntityManager em;

	public InputsDaoImpl() {
		super(Inputs.class);
	}

	public InputsDaoImpl(Class<Inputs> entityClass) {
		super(Inputs.class);

	}

	public InputsDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	@Transactional
	public void add(Inputs entity) {

		super.add(entity);
	}

	@Override
	@Transactional
	public void update(Inputs entity) {

		super.update(entity);
	}

	@Override
	@Transactional
	public Inputs getById(Long id) {

		return super.getById(id);
	}

	@Override
	@Transactional
	public List<Inputs> getAll() {

		return super.getAll();
	}

	@Override
	@Transactional
	public void delete(Inputs entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

}
