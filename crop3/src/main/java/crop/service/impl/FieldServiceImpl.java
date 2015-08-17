package crop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crop.dao.FieldDao;
import crop.domain.Field;
import crop.service.FieldService;

@Service("FieldService")
public class FieldServiceImpl implements FieldService {

	@Autowired
	private FieldDao dao;

	@Override
	public List<Field> getAll() {

		return dao.getAll();
	}

	@Override
	public void delete(Long id) {

		dao.delete(dao.getById(id));

	}

	@Override
	public void update(long id, String code, String oblast, String rajon, String village, double areaTotal, double areaPlanted) {
		//Field itemToUpdate = new Field(code, oblast, rajon, village, areaTotal, areaPlanted);
		
		
		Field itemToUpdate = dao.getById(id);
		itemToUpdate.setCode(code);
		itemToUpdate.setOblast(oblast);
		itemToUpdate.setRajon(rajon);
		itemToUpdate.setVillage(village);
		itemToUpdate.setAreaTotal(areaTotal);
		itemToUpdate.setAreaPlanted(areaPlanted);		
		
		dao.update(itemToUpdate);

	}

	@Override
	public void add(String code, String oblast, String rajon, String village, double areaTotal, double areaPlanted) {
		dao.add(new Field(code, oblast, rajon, village, areaTotal, areaPlanted));

	}

}
