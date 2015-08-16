package crop.controller.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping(value = "/fieldUpdate")
	public String updateFiled(Model modelm, HttpServletRequest req) {

		Long idToUpdate = Long.parseLong(req.getParameter("id"));
		//service.

		return "redirect:/fieldEdit";
	}

}
