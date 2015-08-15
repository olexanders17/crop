package crop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@RequestMapping(value="/")
	public String cretePricesPage(){
		
		return "body-default";
	}

}
