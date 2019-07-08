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
	public ModelAndView save(@ModelAttribute("employee") Employee employee) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		String sDate1 = "31/12/1998";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Date date = simpleDateFormat.parse("2018-09-09");
		System.out.println("ddddddddd>>>>> " + date);

		 System.out.println("dat:::::::: " + employee.getDob());
		emprepo.save(employee);
		mav.addObject("msg", "Employee saved");
		return mav;
	}
}
