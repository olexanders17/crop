package crop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.InputsDao;
import crop.domain.Inputs;
import crop.domain.Prices;
import crop.service.InputsService;

@Service
public class InputsServiceImpl implements InputsService {

	@Autowired
	private InputsDao dao;

	@Override
	@Transactional
	public void add(String name, String unitMeasurmen, String inputClass, List<Inputs> prices) {
		dao.add(new Inputs(name, unitMeasurmen, inputClass));

	}

	@Override
	@Transactional
	public List<Inputs> getAll() {
		return dao.getAll();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.delete(dao.getById(id));	

	}

	@Override
	@Transactional
	public void update(long id, String name, String unitMeasurmen, String inputClass, List<Prices> prices) {
		Inputs itemToUpdate = dao.getById(id);
		itemToUpdate.setInputClass(inputClass);
		itemToUpdate.setName(name);
		itemToUpdate.setUnitMeasurmen(unitMeasurmen);
		itemToUpdate.setInputClass(inputClass);
	}

	@Override
	public Inputs getById(Long id) {
		return dao.getById(id);
		
	}

	
	
}
