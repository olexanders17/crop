package crop.service.impl;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crop.dao.TechCardsDao;
import crop.domain.Field;
import crop.domain.Inputs;
import crop.domain.Operations;
import crop.domain.TechCards;
import crop.service.TechCardsService;

@Service("TechCardService")
public class TechCardsServiceImpl implements TechCardsService {

	@Autowired
	private TechCardsDao techCardsDao; 
	
	
	public void addTechCards(Field field, int day, int month, int year, Operations operations, Inputs inputs,
			double applicationRate, double hectaresApplied, double totalQuantity, double totalUah) {
		
		Calendar operationDate= new GregorianCalendar(year, month-1, day);
		
		TechCards techCards = new TechCards(field, operationDate, operations, inputs, applicationRate, hectaresApplied, totalQuantity, totalUah);
	//	techCardsDao.addTechCards(techCards);

	}

	public void updateTechCards(int id, Field field, Calendar operationDate, Operations operations, Inputs inputs,
			double applicationRate, double hectaresApplied, double totalQuantity, double totalUah) {
		// TODO Auto-generated method stub

	}

	public TechCards getTechCardsById(int id) {
		
		return null;
	}

	public List<TechCards> getAllTechCards() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteTechCards(int id) {
		// TODO Auto-generated method stub

	}

}
