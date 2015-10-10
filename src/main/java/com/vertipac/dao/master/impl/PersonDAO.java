package com.vertipac.dao.master.impl;

import javax.transaction.Transactional;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.hibernate.Criteria;

import com.vertipac.dao.GenericHibernateDAO;
import com.vertipac.dao.master.IPersonDAO;
import com.vertipac.models.master.Person;

import com.vertipac.exception.DAOExceptions;



@Repository
@Transactional
public class PersonDAO extends GenericHibernateDAO<Person,Integer> implements IPersonDAO{

	@Override
	public Person findById(int id) throws DAOExceptions{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person savePerson(Person person) throws DAOExceptions{
		// TODO Auto-generated method stub
		if(person!=null){
			getCurrentSession().save(person);
		}
		return person;
		
	}

	@Override
	public void deletePersonByID(int id) throws DAOExceptions{
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> findAllPerson() throws DAOExceptions{
		// TODO Auto-generated method stub
		/*return null;*/
		Criteria criteria = sessionFactory.openSession().createCriteria(Person.class);
		return criteria.list();
	}

}
