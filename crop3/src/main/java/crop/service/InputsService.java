package crop.service;

import java.util.List;

import crop.domain.Inputs;
import crop.domain.Prices;


public interface InputsService  {
	
	void add(String name, String unitMeasurmen, String inputClass, List<Inputs> prices);

	void update(long id, String name, String unitMeasurmen, String inputClass, List<Prices> prices);
	
	Inputs getById(Long id);

	List<Inputs> getAll();

	void delete(Long id);

	

}
