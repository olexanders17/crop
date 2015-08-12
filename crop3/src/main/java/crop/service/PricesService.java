package crop.service;

import java.util.List;

import crop.domain.Inputs;
import crop.domain.Prices;

public interface PricesService {

	public void insertPrices(String priceTypeName, Inputs inputs, double vatRate, double uahExcVat);

	public List<Prices> getAllPrices();

	public Prices findById(int id);

}
