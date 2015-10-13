package com.vertipac.dao.master.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.hibernate.Criteria;

import com.vertipac.dao.GenericHibernateDAO;
import com.vertipac.dao.master.IStudentDAO;
import com.vertipac.exception.DAOExceptions;
import com.vertipac.models.master.Student;


@Repository
@Transactional
public class StudentDAO extends GenericHibernateDAO<Student,Integer> implements IStudentDAO{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAll() throws DAOExceptions{
		Criteria criteria = sessionFactory.openSession().createCriteria(Student.class);
		return criteria.list();
		}
	
	@Override
	public Student  saveEntity(Student entity) throws DAOExceptions{
		if(entity!=null){
			getCurrentSession().save(entity);
		}
		return entity;
	}

}
