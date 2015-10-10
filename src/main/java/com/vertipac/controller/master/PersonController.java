package com.vertipac.controller.master;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import com.vertipac.dto.master.PersonDTO;
import com.vertipac.service.master.IPersonService;



@Controller
public class PersonController {
	
	@Autowired
	IPersonService personService;
	
	@RequestMapping("person")
	public ModelAndView getPerson(){
		List<PersonDTO> person=personService.findAll();
		 
		PersonDTO p=new PersonDTO();
		p.setId(1);
		p.setFirst_name("Pallavi");
		ModelAndView model = new ModelAndView("master/Person");
		model.addObject("person",person);
		return model;
	}

}
