package crop.service;

import java.util.Calendar;
import java.util.List;

import crop.domain.Field;
import crop.domain.Inputs;
import crop.domain.Operations;
import crop.domain.TechCards;

public interface TechCardsService {

	public void addTechCards(Field field, int day, int month, int year, Operations operations, Inputs inputs,
			double applicationRate, double hectaresApplied, double totalQuantity, double totalUah);

	public void updateTechCards(int id, Field field, Calendar operationDate, Operations operations, Inputs inputs,
			double applicationRate, double hectaresApplied, double totalQuantity, double totalUah);

	public TechCards getTechCardsById(int id);

	public List<TechCards> getAllTechCards();

	public void deleteTechCards(int id);

}
