package com.gul.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gul.entity.Employee;
import com.gul.repository.EmpRepository;

@Controller
public class HomeController {

	@Autowired
	EmpRepository emprepo;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@GetMapping("/")
	public ModelAndView veiew() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("employee", new Employee());
		return mav;
	}

	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute("employee") Employee employee) {
		ModelAndView mav = new ModelAndView("index");
		System.out.println("dat:::::::: " + employee.getDob());
		emprepo.save(employee);
		mav.addObject("msg", "Employee saved");
		return mav;
	}
}
