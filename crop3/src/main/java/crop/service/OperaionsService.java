package crop.service;

import java.util.List;

import crop.domain.Operations;

public interface OperaionsService {

	public void addOperations(String type);

	public void updateOperations(int id, String type);

	public Operations getOperationsById(int id);

	public List<Operations> getAllOperations();

	public void deleteOperations(int id);

}
