package crop.dao;

import java.util.List;

import crop.domain.Inputs;

public interface InputsDao extends BaseDao<Inputs, Long>  {

	@Override
	void add(Inputs entity);

	@Override
	void update(Inputs entity);

	@Override
	Inputs getById(Long id);

	@Override
	List<Inputs> getAll();

	@Override
	void delete(Inputs entity);

	
	
}
