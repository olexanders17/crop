package crop.dao;

import java.util.List;

import crop.domain.Field;

public interface FieldDao extends BaseDao<Field, Long> {

	@Override
	void add(Field entity);

	@Override
	void update(Field entity);

	@Override
	Field getById(Long id);

	@Override
	List<Field> getAll();

	@Override
	void delete(Field entity);
	

}
