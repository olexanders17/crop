package crop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.PricesDao;
import crop.domain.Prices;

@Repository
public class PricesDaoImpl extends BaseDaoImpl<Prices, Long> implements PricesDao {

	public PricesDaoImpl(Class<Prices> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Prices entity) {
		// TODO Auto-generated method stub
		super.add(entity);
	}

	@Override
	public void update(Prices entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public Prices getById(Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<Prices> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}

	@Override
	public void delete(Prices entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}



}
