package com.vertipac.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author Rahul.Thachilath
 * @version $Revision$ Last changed by $Author$ on $Date$ as $Revision$
 */
@Repository
@Scope("singleton")
public class GenericHibernateDAO<T, ID extends Serializable>  implements IGenericDAO<T, ID>, BeanFactoryAware
{
	@Autowired
	protected SessionFactory sessionFactory;
	protected Session getCurrentSession(){
		try{
			return sessionFactory.getCurrentSession();
		}catch(Exception e){
			return sessionFactory.openSession();
		}
		
	}

	
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T findById(ID id) throws com.vertipac.exception.DAOExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() throws com.vertipac.exception.DAOExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCriteria(T exampleInstance) throws com.vertipac.exception.DAOExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T saveEntity(T entity) throws com.vertipac.exception.DAOExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T updateEntity(T entity) throws com.vertipac.exception.DAOExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(T entity) throws com.vertipac.exception.DAOExceptions {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getCurrentUTCTimeStamp() {
		Object utcDateObject = getCurrentSession().createSQLQuery("SELECT UTC_TIMESTAMP").uniqueResult();
		return ((Date) utcDateObject);
	}

	@Override
	public void setUserId(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findObjectById(T entity) throws com.vertipac.exception.DAOExceptions {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSession(Session session) {
		// TODO Auto-generated method stub
		
	}}
