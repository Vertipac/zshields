/**
 * 
 */
package com.vertipac.dao.master.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.vertipac.dao.GenericHibernateDAO;
import com.vertipac.dao.master.IStandardDAO;
import com.vertipac.exception.DAOExceptions;
import com.vertipac.models.master.Standard;

/**
 * @author rahul
 *
 */
@Repository
@Transactional
public class StandardDAO extends GenericHibernateDAO<Standard, Integer> implements IStandardDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Standard> findAll() throws DAOExceptions {
		
		Criteria criteria = sessionFactory.openSession().createCriteria(Standard.class);
		return criteria.list();
	}
	
	@Override
	public Standard saveEntity(Standard entity) throws DAOExceptions {
		if(entity!=null){
			getCurrentSession().save(entity);
		}
		return entity;
	}
}
