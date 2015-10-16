package com.joseph.dao;

import java.util.List;

import com.joseph.model.Event;


public interface EventDao {
	public void add(Event event);
	public void edit(Event event);
	public void delete(int eventId);
	public Event getEvent(int eventId);
	public List getAllEvents();

}
