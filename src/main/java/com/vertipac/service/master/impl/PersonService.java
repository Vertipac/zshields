package com.vertipac.service.master.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vertipac.dao.master.IPersonDAO;
import com.vertipac.dto.master.PersonDTO;
import com.vertipac.exception.ServiceException;
import com.vertipac.models.master.Person;
import com.vertipac.service.GenericService;
import com.vertipac.service.master.IPersonService;



@Service
@Transactional
public class PersonService extends GenericService<PersonDTO, Integer> implements IPersonService{
	
	@Autowired
	IPersonDAO personDAO;

	@Override
	public PersonDTO findById(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonDTO> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonDTO> findByCriteria(PersonDTO exampleInstance)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDTO saveEntity(PersonDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDTO updateEntity(PersonDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(PersonDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonDTO findObjectById(PersonDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<PersonDTO> convertPOJOsToDTOs (List<Person> entities){
		if (entities != null) 
		   {
			 List<PersonDTO> dtos = new ArrayList<PersonDTO>();
			 for (Person entity :entities){
				 dtos.add(convertPOJOToDTO(entity));
			 }
			 return dtos;
		   }
		return new ArrayList<PersonDTO>();
		}
	
	private PersonDTO convertPOJOToDTO(Person entity){
		if (entity != null) {
			PersonDTO dto=new PersonDTO();
			dto.setId(entity.getId());
			dto.setFirst_name(entity.getFirst_name());
			dto.setLast_name(entity.getLast_name());
			dto.setMiddle_name(entity.getMiddle_name());
			dto.setAdd_line_1(entity.getAdd_line_1());
			dto.setAdd_1_line_2(entity.getAdd_1_line_2());
			dto.setAdd_1_pin(entity.getAdd_1_pin());
			dto.setAdd_2_line_1(entity.getAdd_2_line_1());
			dto.setAdd_2_line_2(entity.getAdd_2_line_2());
			dto.setAdd_2_pin(entity.getAdd_2_pin());
			dto.setComments(entity.getComments());
			dto.setEmail_1(entity.getEmail_1());
			dto.setEmail_2(entity.getEmail_2());
			dto.setPhone_1(entity.getPhone_1());
			dto.setPhone_2(entity.getPhone_2());
			dto.setType(entity.getType());
			
			}
		return null;
	}
	
	private Person convertDTOToPojo(PersonDTO dto){
		if(dto!=null){
			Person entity=new Person();
			entity.setId(dto.getId());
			entity.setFirst_name(dto.getFirst_name());
			entity.setLast_name(dto.getLast_name());
			entity.setMiddle_name(dto.getMiddle_name());
			entity.setAdd_line_1(dto.getAdd_line_1());
			entity.setAdd_1_line_2(dto.getAdd_1_line_2());
			entity.setAdd_1_pin(dto.getAdd_1_pin());
			entity.setAdd_2_line_1(dto.getAdd_2_line_1());
			entity.setAdd_2_line_2(dto.getAdd_2_line_2());
			entity.setAdd_2_pin(dto.getAdd_2_pin());
			entity.setComments(dto.getComments());
			entity.setEmail_1(dto.getEmail_1());
			entity.setEmail_2(dto.getEmail_2());
			entity.setPhone_1(dto.getPhone_1());
			entity.setPhone_2(dto.getPhone_2());
			entity.setType(dto.getType());
		}
		
		return null;
	}
	
	}


