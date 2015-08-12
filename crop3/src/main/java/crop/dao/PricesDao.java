package crop.dao;

import java.util.List;

import crop.domain.Prices;

public interface PricesDao extends BaseDao<Prices, Long> {

	@Override
	void add(Prices entity);

	@Override
	void update(Prices entity);

	@Override
	Prices getById(Long id);

	@Override
	List<Prices> getAll();

	@Override
	void delete(Prices entity);

	
}
