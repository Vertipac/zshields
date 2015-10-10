package com.vertipac.dao.master;

import java.util.List;

import com.vertipac.dao.IGenericDAO;
import com.vertipac.models.master.Person;


public interface IPersonDAO extends IGenericDAO<Person, Integer>{

	Person findById(int id);
	
	Person savePerson(Person person);
	
	void deletePersonByID(int id);
	
	List<Person> findAllPerson();
	
	
}
