package crop.controller.impl;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import crop.domain.Field;
import crop.service.FieldService;
import crop.service.PricesService;

@Controller
public class FieldController {

	@Autowired
	private FieldService service;

	@RequestMapping(value = "/fieldGetAll")
	public String fieldGetAll(Model model) {
		
		List<Field> list=service.getAll();
		model.addAttribute("fieldList", list);
		return    "field_getAll"; 

	}

}
