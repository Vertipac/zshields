package com.vertipac.controller.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vertipac.dto.master.SubjectDTO;
import com.vertipac.service.master.ISubjectService;


@Controller
public class SubjectController {
	@Autowired
	ISubjectService subjectService;
	
	@RequestMapping("subjects")
	
	public ModelAndView getSubjects(){
		
		List<SubjectDTO> subjects=subjectService.findAll();
		
		SubjectDTO e=new SubjectDTO();
		e.setId(1);
		e.setName("A");
		subjects.add(e);
		ModelAndView model=new ModelAndView("master/Subject");
		model.addObject("subjects",subjects);
		
		return model;
	}

}
