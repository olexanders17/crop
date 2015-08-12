package crop.dao;

import java.util.List;

import crop.domain.Operations;
import crop.domain.Prices;
import crop.domain.TechCards;

public interface OperationsDao {
	
	public void addOperations (Operations operations);
	public void updateOperations (Operations operations);
	public Operations  getOperationsById(int id);
	public List<Operations> getAllOperations() ;
	public void deleteOperations (Operations perations);

}
