package crop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import crop.domain.Prices;
import crop.service.PricesService;

@Controller
public class PricesController {
	
	@Autowired
	private PricesService pricesService;
	
	@RequestMapping(value="/showAllPrices")
	public String  getAllPrices(Model model) {
		
		List<Prices> prices= pricesService.getAllPrices();
		model.addAttribute("allPrices", prices);
		return "prices-list";
		
	}
	
	@RequestMapping(value="new-price")
	public String cretePricesPage(){
		
		return "prices-list";
	}
	
	
	@RequestMapping(value="/createPrices")
	public String cratePrice (
			@RequestParam(value="inputs")
			String inputs,
			@RequestParam(value="uahExcVat") 
			double uahExcVat
			) {

		pricesService.insertPrices(inputs, null, 1.2, uahExcVat);
		return "prices-list";
		
	}
	

}
