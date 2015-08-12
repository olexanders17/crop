package crop.dao;

import java.util.List;

import crop.domain.Operations;
import crop.domain.Prices;
import crop.domain.TechCards;

public interface OperationsDao extends BaseDao<Operations, Long> {

	@Override
	void add(Operations entity);

	@Override
	void update(Operations entity);

	@Override
	Operations getById(Long id);

	@Override
	List<Operations> getAll();

	@Override
	void delete(Operations entity);
	

	
	
	
	//	public void addOperations (Operations operations);
//	public void updateOperations (Operations operations);
//	public Operations  getOperationsById(int id);
//	public List<Operations> getAllOperations() ;
//	public void deleteOperations (Operations perations);

}
