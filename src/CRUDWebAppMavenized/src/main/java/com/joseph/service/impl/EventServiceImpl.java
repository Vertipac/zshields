package com.joseph.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joseph.dao.EventDao;
import com.joseph.model.Event;
import com.joseph.service.EventService;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventDao eventDao;

	@Transactional
	public void add(Event event) {
		eventDao.add(event);
		
	}

	@Transactional
	public void edit(Event event) {
		eventDao.edit(event);
		
	}

	@Transactional
	public void delete(int eventId) {
		eventDao.delete(eventId);
		
	}

	@Transactional
	public Event getEvent(int eventId) {
		return eventDao.getEvent(eventId);
	}

	@Transactional
	public List getAllEvents() {
		return eventDao.getAllEvents();
	}

}
