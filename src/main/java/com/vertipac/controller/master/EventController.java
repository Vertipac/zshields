package com.vertipac.controller.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vertipac.dto.master.EventDTO;
import com.vertipac.service.master.IEventService;

@Controller
public class EventController {
	
	@Autowired
	IEventService eventService;
	
	@RequestMapping("events")
	
	public ModelAndView getEvents(){
		List<EventDTO> events=eventService.findAll();
		EventDTO ev=new EventDTO();
		ev.setId(1);
		ev.setName("a");
		events.add(ev);
		ModelAndView model=new ModelAndView("master/Event");
		model.addObject("events",events);
		
		return model;
	}

}
