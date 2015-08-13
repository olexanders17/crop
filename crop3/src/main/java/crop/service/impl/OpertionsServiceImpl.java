package crop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crop.dao.OperationsDao;
import crop.domain.Operations;
import crop.service.OperaionsService;

@Service("OperationsServise")
public class OpertionsServiceImpl implements OperaionsService {

	@Autowired
	private OperationsDao operationsDao;

	public void addOperations(String type) {
		Operations operations = new Operations(type);
		//operationsDao.addOperations(operations);

	}

	public void updateOperations(int id, String type) {
		// TODO Auto-generated method stub

	}

	public Operations getOperationsById(int id) {

		return null;
	}

	public List<Operations> getAllOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteOperations(int id) {

//		Operations operationsToDelete = operationsDao.getOperationsById(id);
//		operationsDao.deleteOperations(operationsToDelete);
		

	}

}
