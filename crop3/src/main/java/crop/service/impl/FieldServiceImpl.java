package crop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crop.dao.FieldDao;
import crop.domain.Field;
import crop.domain.Prices;
import crop.service.FieldService;

@Service("FieldService")
public class FieldServiceImpl implements FieldService {

	@Autowired
	private FieldDao dao;

	@Override
	public List<Field> getAll() {

		return dao.getAll();
	}

}
