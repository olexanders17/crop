package crop.controller.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import crop.domain.Inputs;
import crop.service.InputsService;


@Controller
public class InputsController {

	@Autowired
	private InputsService service;

	@RequestMapping(value = "/inputsController")
	public String inputsGetAll(Model model) {

		List<Inputs> list = service.getAll();
		model.addAttribute("inputsList", list);
		return "inputs_getAll";

		
	}
	

	
	@RequestMapping(value = "/inputsGetAllDataTable")
	public String inputsGetAllDataTable(Model model) {

		List<Inputs> list = service.getAll();
		model.addAttribute("inputsList", list);
		return "inputs-data-table";

	}

	@RequestMapping(value = "/inputsEdit")
	public String editFiled(Model model) {

		List<Inputs> list = service.getAll();
		model.addAttribute("inputsList", list);

		return "inputs_change";
	}

	@RequestMapping(value = "/inputsDelete")
	public String deleteFiled(Model model, HttpServletRequest req) {

		Long idToDelete = Long.parseLong(req.getParameter("id"));
		service.delete(idToDelete);

		return "redirect:/inputsEdit";
	}
	
	
	@RequestMapping(value = "/inputsUpdate", method=RequestMethod.POST)
	public String updateFiled(
			@RequestParam(value="id") long id,
			@RequestParam(value="name") String name,
			@RequestParam(value="unitMeasurmen") String unitMeasurmen,
			@RequestParam(value="inputClass") String inputClass,
			@RequestParam(value="prices") double prices
			
			) {

		
		//service.update(id, name, unitMeasurmen, inputClass, prices);
		
		return "redirect:/inputsEdit";
	}


	@RequestMapping(value = "/inputsAddForm")
	public String addFilefForm() {		
		return "inputs_add";
	}

		
	
	
	
	@RequestMapping(value = "/inputsAdd",method=RequestMethod.POST )
	public String addFiledHandler(
			@RequestParam(value="code") String code,
			@RequestParam(value="oblast") String oblast,
			@RequestParam(value="rajon") String rajon,
			@RequestParam(value="village") String village,
			@RequestParam(value="areaTotal") double areaTotal,
			@RequestParam(value="areaPlanted") double areaPlanted					
			) 
	{
	
	//service.add(code, oblast, rajon, village, areaTotal, areaPlanted);
		

		return "redirect:/inputsEdit";
	}

	
	//inputsChart
	@RequestMapping(value = "inputsChart")
	public String inputsChart1(Model model) {
		List<Inputs> inputsList= service.getAll();
		model.addAttribute("inputsChartData", inputsList);		
		return "inputs-chart";
	}

	
	
	@RequestMapping(value = "/inputsChangeOne")
	public String inputsChangeOne(Model model, HttpServletRequest req) {
		Long idToEdit=Long.parseLong( req.getParameter("id") );
		Inputs inputsToEdit=service.getById(idToEdit);					
		model.addAttribute("inputsToEdit", inputsToEdit);		
		return "inputs-change-one";
	}
	
	
	
	
	
}





