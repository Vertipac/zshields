package com.joseph.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.joseph.dao.EventDao;
import com.joseph.model.Event;

@Repository

public class EventDaoImpl implements EventDao{
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Event event) {
		session.getCurrentSession().save(event);
		
	}

	@Override
	public void edit(Event event) {
		session.getCurrentSession().update(event);
		
	}

	@Override
	public void delete(int eventId) {
		session.getCurrentSession().delete(getEvent(eventId));
		
	}

	@Override
	public Event getEvent(int eventId) {
		return (Event)session.getCurrentSession().get(Event.class,eventId);
	}

	@Override
	public List getAllEvents() {
		return session.getCurrentSession().createQuery("from Event").list();
	}

}
