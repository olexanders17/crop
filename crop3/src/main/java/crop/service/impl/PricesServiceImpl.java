package crop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crop.dao.PricesDao;
import crop.domain.Inputs;
import crop.domain.Prices;
import crop.service.PricesService;

@Service("pricesService")
public class PricesServiceImpl implements PricesService {

	@Autowired
	private PricesDao dao;

	public PricesServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertPrices(String priceTypeName, Inputs inputs, double vatRate, double uahExcVat) {

		Prices prices = new Prices(priceTypeName, inputs, vatRate, uahExcVat);
		// dao.insertPrices(prices);

	}

	public List<Prices> getAllPrices() {

		return dao.getAll();
	}

	public Prices findById(int id) {

		return null;
	}

}
