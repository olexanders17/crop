package crop.service;

import java.util.List;

import crop.domain.Field;
import crop.domain.Inputs;
import crop.domain.Prices;

public interface PricesService {

	void add();

	void update();
	// Prices getById(Long id);

	List<Prices> getAll();

	void delete(Long id);
}
