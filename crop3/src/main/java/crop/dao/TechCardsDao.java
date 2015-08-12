package crop.dao;

import java.util.List;

import crop.domain.TechCards;

public interface TechCardsDao extends BaseDao<TechCards,  Long> {

	@Override
	void add(TechCards entity);

	@Override
	void update(TechCards entity);

	@Override
	TechCards getById(Long id);

	@Override
	List<TechCards> getAll();

	@Override
	void delete(TechCards entity);

	
	
}
