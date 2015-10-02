package com.vertipac.controller.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vertipac.dto.master.StandardDTO;
import com.vertipac.service.master.IStandardService;

@Controller
public class StandardController {
	
	@Autowired
	IStandardService standardService;
	
	@RequestMapping("standards")
	public ModelAndView getStandards()
	{
		List<StandardDTO> standards = standardService.findAll();
		
		StandardDTO e = new StandardDTO();
		e.setId(1);
		e.setDivision("a");
		standards.add(e);
		ModelAndView model = new ModelAndView("master/standard");
		model.addObject("standards",standards);
		
		return model;
	}
}
