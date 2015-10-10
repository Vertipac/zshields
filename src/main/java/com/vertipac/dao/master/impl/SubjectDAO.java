package com.vertipac.dao.master.impl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.vertipac.dao.GenericHibernateDAO;
import com.vertipac.dao.master.ISubjectDAO;
import com.vertipac.exception.DAOExceptions;
import com.vertipac.models.master.Subject;


@Repository
@Transactional
public class SubjectDAO extends GenericHibernateDAO<Subject,Integer> implements ISubjectDAO{

	@SuppressWarnings("unchecked")
	@Override 
	public List<Subject> findAll() throws DAOExceptions{
		Criteria criteria = sessionFactory.openSession().createCriteria(Subject.class);
		return criteria.list();
	}
	
	@Override
	public Subject  saveEntity(Subject entity) throws DAOExceptions{
		if(entity!=null){
			getCurrentSession().save(entity);
		}
		return entity;
	}
}
