package crop.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import crop.domain.Inputs;
import crop.service.OperaionsService;
import crop.service.PricesService;
import crop.service.TechCardsService;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		PricesService pricesService = (PricesService) context.getBean("pricesService");
		pricesService.insertPrices("dsadsadsa", null, 1.2, 500);
		pricesService.findById(1);
		
		TechCardsService techCardsService=  (TechCardsService)  context.getBean("TechCardService");
		techCardsService.addTechCards(null, 01, 01, 2015, null, null, 100, 200, 58, 10000000);
		
		OperaionsService operaionsService =  (OperaionsService)  context.getBean("OperationsServise");
		operaionsService.addOperations("SuperSpray-1");
		operaionsService.addOperations("SuperSpray-2");
		operaionsService.addOperations("SuperSpray-3");
		
		operaionsService.deleteOperations(2);
		
		
		
		
		context.close();

	}

}
