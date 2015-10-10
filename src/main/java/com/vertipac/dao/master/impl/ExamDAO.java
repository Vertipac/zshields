package com.vertipac.dao.master.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.vertipac.dao.GenericHibernateDAO;
import com.vertipac.dao.master.IExamDAO;
import com.vertipac.exception.DAOExceptions;
import com.vertipac.models.master.Exam;


@Repository
@Transactional
public class ExamDAO extends GenericHibernateDAO<Exam,Integer> implements IExamDAO{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Exam> findAll() throws DAOExceptions{
		Criteria criteria = sessionFactory.openSession().createCriteria(Exam.class);
		return criteria.list();
	}
	
	@Override
	public Exam  saveEntity(Exam entity) throws DAOExceptions{
		if(entity!=null){
			getCurrentSession().save(entity);
		}
		return entity;
	}

}
