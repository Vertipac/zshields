package com.vertipac.dao.master.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.vertipac.dao.GenericHibernateDAO;
import com.vertipac.dao.master.IEventDAO;
import com.vertipac.exception.DAOExceptions;
import com.vertipac.models.master.Event;


@Repository
@Transactional
public class EventDAO extends GenericHibernateDAO<Event,Integer> implements IEventDAO{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Event> findAll() throws DAOExceptions {
		Criteria criteria = sessionFactory.openSession().createCriteria(Event.class);
		return criteria.list();
	}
	
	@Override
	public Event saveEntity(Event entity) throws DAOExceptions{
		if(entity!=null){
			getCurrentSession().save(entity);
		}
		return entity;
	}

}
