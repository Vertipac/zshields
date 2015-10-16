package com.joseph.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.joseph.model.Event;
import com.joseph.service.EventService;

@Controller
public class EventController {
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/event")
	public String setupForm(Map<String, Object> map){
		Event event=new Event();
		map.put("event",event);
		map.put("eventList", eventService.getAllEvents());
		return "event";
	}
	
	@RequestMapping(value="/event.do",method=RequestMethod.POST)
	public String doActions(@ModelAttribute Event event, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Event eventResult=new Event();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			eventService.add(event);
			eventResult =event;
			break;
			
		case "edit":
			eventService.edit(event);
			eventResult =event;
			break;
			
		case "delete":
			eventService.delete(event.getId());
			eventResult=new Event();
			break;
			
		case "search":
			Event searchedResult=eventService.getEvent(event.getId());
			eventResult= searchedResult !=null ? searchedResult : new Event();
			break;
	}
		map.put("event", eventResult);
		map.put("eventList",eventService.getAllEvents());
		return "event";
	
}
}
