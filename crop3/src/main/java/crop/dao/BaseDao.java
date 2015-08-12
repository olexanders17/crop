package crop.dao;

import java.util.List;

import crop.domain.Operations;

public interface BaseDao<E, N> {

	void add(E entity);
	void update(E entity);
	E getById(N id);
	List<E> getAll();
	void delete(E entity);
}
