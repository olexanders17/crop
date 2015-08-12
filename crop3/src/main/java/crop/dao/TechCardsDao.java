package crop.dao;

import java.util.List;

import crop.domain.TechCards;

public interface TechCardsDao {

	public void addTechCards (TechCards techCards);
	public void updateTechCards (TechCards techCards);
	public TechCards getTechCardsById(int id);
	public List<TechCards> getAllTechCards() ;
	public void deleteTechCards (TechCards techCards);
	
	
	
}
