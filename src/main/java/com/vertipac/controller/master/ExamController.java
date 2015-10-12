package com.vertipac.controller.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vertipac.dto.master.ExamDTO;
import com.vertipac.service.master.IExam;



@Controller
public class ExamController {
	@Autowired
	IExam examservice;
	
	@RequestMapping("exams")
	public ModelAndView getExam(){
		List<ExamDTO> exams=examservice.findAll();
		ExamDTO e=new ExamDTO();
		e.setId(1);
		e.setName("MAths");
		exams.add(e);
		ModelAndView model = new ModelAndView("master/Exam");
		model.addObject("exams",exams);
		return model;
	}
}
