package crop.controller.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import crop.domain.Field;
import crop.service.FieldService;

@Controller
public class FieldController {

	@Autowired
	private FieldService service;

	@RequestMapping(value = "/fieldGetAll")
	public String fieldGetAll(Model model) {

		List<Field> list = service.getAll();
		model.addAttribute("fieldList", list);
		return "field_getAll";

		
	}
	

	
	@RequestMapping(value = "/fieldGetAllDataTable")
	public String fieldGetAllDataTable(Model model) {

		List<Field> list = service.getAll();
		model.addAttribute("fieldList", list);
		return "field-data-table";

	}

	@RequestMapping(value = "/fieldEdit")
	public String editFiled(Model model) {

		List<Field> list = service.getAll();
		model.addAttribute("fieldList", list);

		return "field_change";
	}

	@RequestMapping(value = "/fieldDelete")
	public String deleteFiled(Model model, HttpServletRequest req) {

		Long idToDelete = Long.parseLong(req.getParameter("id"));
		service.delete(idToDelete);

		return "redirect:/fieldEdit";
	}
	
	
	@RequestMapping(value = "/fieldUpdate", method=RequestMethod.POST)
	public String updateFiled(
			@RequestParam(value="id") long id,
			@RequestParam(value="code") String code,
			@RequestParam(value="oblast") String oblast,
			@RequestParam(value="rajon") String rajon,
			@RequestParam(value="village") String village,
			@RequestParam(value="areaTotal") double areaTotal,
			@RequestParam(value="areaPlanted") double areaPlanted					
			
			) {

		//Long idToUpdate = Long.parseLong(req.getParameter("id"));
		service.update(id, code, oblast, rajon, village, areaTotal, areaPlanted);
		//service.add(code, oblast, rajon, village, areaTotal, areaPlanted);
		return "redirect:/fieldEdit";
	}


	@RequestMapping(value = "/fieldAddForm")
	public String addFilefForm() {		
		return "field_add";
	}

		
	
	
	
	@RequestMapping(value = "/fieldAdd",method=RequestMethod.POST )
	public String addFiledHandler(
			@RequestParam(value="code") String code,
			@RequestParam(value="oblast") String oblast,
			@RequestParam(value="rajon") String rajon,
			@RequestParam(value="village") String village,
			@RequestParam(value="areaTotal") double areaTotal,
			@RequestParam(value="areaPlanted") double areaPlanted					
			) 
	{
	
	service.add(code, oblast, rajon, village, areaTotal, areaPlanted);
		

		return "redirect:/fieldEdit";
	}

	
	//fieldChart
	@RequestMapping(value = "fieldChart")
	public String fieldChart1(Model model) {
		List<Field> fieldList= service.getAll();
		model.addAttribute("fieldChartData", fieldList);

		
		
		return "field-chart";
	}

}





