package crop.controller.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	private PricesService service;

	@RequestMapping(value = "/pricesGetAll")
	public String pricesGetAll(Model model) {

		List<Prices> list = service.getAll();
		model.addAttribute("pricesList", list);
		return "prices_getAll";

	}

	@RequestMapping(value = "/pricesGetAllDataTable")
	public String pricesGetAllDataTable(Model model) {

		List<Prices> list = service.getAll();
		model.addAttribute("pricesList", list);
		return "prices-data-table";

	}

	@RequestMapping(value = "/pricesEdit")
	public String editFiled(Model model) {

		List<Prices> list = service.getAll();
		model.addAttribute("pricesList", list);

		return "prices_change";
	}

	@RequestMapping(value = "/pricesDelete")
	public String deleteFiled(Model model, HttpServletRequest req) {

		Long idToDelete = Long.parseLong(req.getParameter("id"));
		service.delete(idToDelete);

		return "redirect:/pricesEdit";
	}

	@RequestMapping(value = "/pricesUpdate", method = RequestMethod.POST)
	public String updateFiled(
			@RequestParam(value = "id") long id,
			@RequestParam(value = "priceTypeName") String priceTypeName,
			@RequestParam(value = "vatRate") double vatRate,
			@RequestParam(value = "uahExcVat") double uahExcVat			

	) {


		service.update(id, priceTypeName,  vatRate, uahExcVat);
		
		return "redirect:/pricesEdit";
	}

	@RequestMapping(value = "/pricesAddForm")
	public String addFilefForm() {
		return "prices_add";
	}

	@RequestMapping(value = "/pricesAdd", method = RequestMethod.POST)
	public String addFiledHandler(
			@RequestParam(value = "priceTypeName") String priceTypeName,
			@RequestParam(value = "vatRate") double vatRate,
			@RequestParam(value = "uahExcVat") double uahExcVat
			
			)
			{

		service.add(priceTypeName,  vatRate, uahExcVat);

		return "redirect:/pricesEdit";
	}

	

}
