package com.vertipac.controller.master;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import com.vertipac.dto.master.StudentDTO;
import com.vertipac.service.master.IStudentService;

@Controller
public class StudentController {
	@Autowired
	IStudentService studentService;
	
	@RequestMapping("students")
	public ModelAndView getStudents(){
		List<StudentDTO> students=studentService.findAll();
		
		StudentDTO d=new StudentDTO();
		d.setId(1);
		d.setType(3);
		students.add(d);
		ModelAndView model = new ModelAndView("master/Student");
		model.addObject("students",students);
		
		return model;
	}

}
