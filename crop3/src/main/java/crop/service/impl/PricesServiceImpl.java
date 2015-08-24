package crop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crop.dao.PricesDao;
import crop.domain.Field;
import crop.domain.Prices;
import crop.service.PricesService;

@Service("pricesService")
public class PricesServiceImpl implements PricesService {

	@Autowired
	private PricesDao dao;

	public PricesServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	@Transactional
	public void add(String priceTypeName,  double vatRate, double uahExcVat) {
		dao.add(new Prices(priceTypeName, vatRate, uahExcVat));
		
	}

	@Override
	@Transactional
	public void update(long id, String priceTypeName,  double vatRate, double uahExcVat) {
		Prices itemToUpdate = dao.getById(id);
		itemToUpdate.setPriceTypeName(priceTypeName);
		itemToUpdate.setVatRate(vatRate);
		itemToUpdate.setUahExcVat(uahExcVat); 		
				
		dao.update(itemToUpdate);
		
	}

	@Override
	@Transactional
	public List<Prices> getAll() {
		return dao.getAll();
		
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.delete(dao.getById(id));
		
	}
	

	
	

}
