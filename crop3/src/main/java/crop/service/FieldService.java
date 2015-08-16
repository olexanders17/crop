package crop.service;

import java.util.List;

import crop.domain.Field;
import crop.domain.Prices;

public interface FieldService {

	void add(String code, String oblast, String rajon, String village, double areaTotal, double areaPlanted);

	void update(long id, String code, String oblast, String rajon, String village, double areaTotal, double areaPlanted);
	// Prices getById(Long id);

	List<Field> getAll();

	void delete(Long id);

}
